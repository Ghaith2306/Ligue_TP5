package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Equipe;
import util.JPAutil;


public class EquipeDaoImpl implements IEquipeDao {

	private EntityManager entityManager=JPAutil.getEntityManager("Ligue_TP5");
	@Override
	public Equipe save(Equipe p) {
	
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.persist(p);
	tx.commit();
	return p;
	}
	@Override
	public List<Equipe> equipesParMC(String mc) {
	List<Equipe> prods = entityManager.createQuery("select p from Equipe p where p.nomEquipe like :mc").setParameter("mc", "%"+mc+"%").getResultList();
	 return prods;
	}
	@Override
	public Equipe getEquipe(Long id) {
	 return entityManager.find(Equipe.class, id);
	}
	@Override
	public Equipe updateEquipe(Equipe p) {
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.merge(p);
	tx.commit();
	return p;
	}
	@Override
	public void deleteEquipe(Long id) {
		Equipe produit = entityManager.find(Equipe.class, id);
	entityManager.getTransaction().begin();
	entityManager.remove(produit);
	entityManager.getTransaction().commit();
	}
}