package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name = "equipe")
public class Equipe implements Serializable{
	@Id
	@Column (name="ID")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idEquipe;
	@Column (name="NOM")
	private String nomEquipe;
	private int classement;
	
	public Equipe() {
		super();
	}
	
	public Equipe(String nomEquipe, int classement) {
		super();
		this.nomEquipe = nomEquipe;
		this.classement = classement;
	}
		
	public Long getIdEquipe() {
		return idEquipe;
	}
	
	public void setIdEquipe(Long idEquipe) {
		this.idEquipe = idEquipe;
	}
	
	public String getNomEquipe() {
		return nomEquipe;
	}
	
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}

	public int getClassement() {
		return classement;
	}
	
	public void setClassement(int classement) {
		this.classement = classement;
	}
	
	public String toString() {
		return "Equipe [idEquipe=" + idEquipe + ", nomEquipe=" +
		nomEquipe + ", classement=" + classement + "]";
		}
}