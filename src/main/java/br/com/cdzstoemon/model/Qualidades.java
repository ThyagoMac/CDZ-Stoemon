package br.com.cdzstoemon.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "qualidades")
public class Qualidades {

	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	

	@ManyToMany
	private List<Personagem> personagem;
	@ManyToMany
	private List<Armadura> armadura;

	@OneToOne
	private Atributos atributo;
	@OneToOne
	private Pericias pericia;

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

	public Atributos getAtributo() {
		return atributo;
	}

	public void setAtributo(Atributos atributo) {
		this.atributo = atributo;
	}

	public Pericias getPericia() {
		return pericia;
	}

	public void setPericia(Pericias pericia) {
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
