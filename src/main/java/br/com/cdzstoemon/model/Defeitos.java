package br.com.cdzstoemon.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Defeitos {

	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
