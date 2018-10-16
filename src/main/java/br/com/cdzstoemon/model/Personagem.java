package br.com.cdzstoemon.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "personagem")
public class Personagem {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String sexo;
	private Integer nivel;
	private Integer idade;
	
	@Enumerated
	private OpcoesClasses classe;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	@OneToMany
	private List<Armadura> armadura;
	
	@OneToOne
	private Atributos atributo;
	@OneToOne
	private Pericias pericia;
	
	@ManyToMany
	private List<Magia> magia;
	
	@ManyToMany
	private List<Qualidades> qualidade;
	@ManyToMany
	private List<Defeitos> defeito;
	
	
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
	public List<Magia> getMagia() {
		return magia;
	}
	public void setMagia(List<Magia> magia) {
		this.magia = magia;
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
