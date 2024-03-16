package dao;

import java.util.List;

import entities.Equipe;

public class TestDao {
	public static void main(String[] args) {
		EquipeDaoImpl pdao= new EquipeDaoImpl();
		Equipe prod= pdao.save(new Equipe("REAL MADRID",2));
		System.out.println(prod);
		List<Equipe> prods =pdao.equipesParMC("R");
		for (Equipe p : prods) System.out.println(p);
	}
}