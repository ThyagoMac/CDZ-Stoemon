package br.com.cdzstoemon.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//classe Jpa (Hibernate)
@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue
	private Integer id_usuario;
	private String acc;
	private String pass;

	//@OneToMany(mappedBy = "usuario") >>--> mappedBy indicates his owner resides in other entity
	@OneToMany(mappedBy = "usuario")
	private List<Personagem> personagens;

	
	public Integer getId() {
		return id_usuario;
	}

	public void setId(Integer id_usuario) {
		this.id_usuario = id_usuario;
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

	public List<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(List<Personagem> personagens) {
		this.personagens = personagens;
	}

}
