package br.com.cdzstoemon.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Armadura {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	
	@ManyToOne
	private Personagem personagem;
	@ManyToMany
	private Qualidades qualidade;
	@ManyToMany
	private Defeitos defeito;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Personagem getPersonagem() {
		return personagem;
	}
	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
	public Qualidades getQualidade() {
		return qualidade;
	}
	public void setQualidade(Qualidades qualidade) {
		this.qualidade = qualidade;
	}
	public Defeitos getDefeito() {
		return defeito;
	}
	public void setDefeito(Defeitos defeito) {
		this.defeito = defeito;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
