package br.com.cdzstoemon.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "armadura")
public class Armadura {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	
	@ManyToOne
	private Personagem personagem;
	
	@ManyToMany
	private List<Qualidades> qualidade;
	@ManyToMany
	private List<Defeitos> defeito;
	@ManyToMany
	private List<Magia> magia;
	
	@OneToOne
	private Atributos atributo;
	@OneToOne
	private Pericias pericia;
	
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Qualidades> getQualidade() {
		return qualidade;
	}
	public void setQualidade(List<Qualidades> qualidade) {
		this.qualidade = qualidade;
	}
	public List<Defeitos> getDefeito() {
		return defeito;
	}
	public void setDefeito(List<Defeitos> defeito) {
		this.defeito = defeito;
	}
	public List<Magia> getMagia() {
		return magia;
	}
	public void setMagia(List<Magia> magia) {
		this.magia = magia;
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
	
}
