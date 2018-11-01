package br.com.cdzstoemon.model;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "personagem")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Personagem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_personagem")
	private Integer id;
	private String nome;
	private String sexo;
	private Integer nivel;
	private Integer idade;

	@Enumerated(EnumType.STRING)
	private OpcoesClasses classe;

	// JoinColumn indicates entity is the owner of the relationship
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@OneToOne
	@JoinColumn(name = "id_atributos")
	private Atributo atributo;

	@OneToOne
	@JoinColumn(name = "id_pericias")
	private Pericia pericia;

	@OneToMany
	private List<Armadura> armadura;

	@ManyToMany
	private List<Magia> magia;

	@ManyToMany
	private List<Qualidade> qualidade;

	
	
	
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

	public List<Magia> getMagia() {
		return magia;
	}

	public void setMagia(List<Magia> magia) {
		this.magia = magia;
	}

	public List<Qualidade> getQualidade() {
		return qualidade;
	}

	public void setQualidade(List<Qualidade> qualidade) {
		this.qualidade = qualidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId_personagem(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public OpcoesClasses getClasse() {
		return classe;
	}

	public void setClasse(OpcoesClasses classe) {
		this.classe = classe;
	}

}
