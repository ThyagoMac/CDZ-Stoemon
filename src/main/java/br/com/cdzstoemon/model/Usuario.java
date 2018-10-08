package br.com.cdzstoemon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//classe Jpa (Hibernate)
@Entity
public class Usuario {
	@Id
	@GeneratedValue
	private Integer id;
	private String acc;
	private String pass;
	
	private Personagem personagem;
	private Armadura armadura;
	private Qualidades qualidades;
	private Defeitos defeitos;
	
	//Getters and Setters
	public Armadura getArmadura() {
		return armadura;
	}
	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}
	public Qualidades getQualidades() {
		return qualidades;
	}
	public void setQualidades(Qualidades qualidades) {
		this.qualidades = qualidades;
	}
	public Defeitos getDefeitos() {
		return defeitos;
	}
	public void setDefeitos(Defeitos defeitos) {
		this.defeitos = defeitos;
	}
	public Personagem getPersonagem() {
		return personagem;
	}
	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
