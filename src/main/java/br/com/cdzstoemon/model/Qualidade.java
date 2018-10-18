package br.com.cdzstoemon.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "qualidade")
public class Qualidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_qualidade")
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private OpcoesCaracteristica caracteristica;

	@ManyToMany
	@JoinColumn(name = "id_personagem")
	private List<Personagem> personagem;
	
	@ManyToMany
	@JoinColumn(name = "id_armadura")
	private List<Armadura> armadura;

	@OneToOne
	@JoinColumn(name = "id_atributos")
	private Atributo atributo;

	@OneToOne
	@JoinColumn(name = "id_pericias")
	private Pericia pericia;

	public List<Personagem> getPersonagem() {
		return personagem;
	}

	public void setPersonagem(List<Personagem> personagem) {
		this.personagem = personagem;
	}

	public List<Armadura> getArmadura() {
		return armadura;
	}

	public void setArmadura(List<Armadura> armadura) {
		this.armadura = armadura;
	}

	public Atributo getAtributo() {
		return atributo;
	}

	public void setAtributo(Atributo atributo) {
		this.atributo = atributo;
	}

	public Pericia getPericia() {
		return pericia;
	}

	public void setPericia(Pericia pericia) {
		this.pericia = pericia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
