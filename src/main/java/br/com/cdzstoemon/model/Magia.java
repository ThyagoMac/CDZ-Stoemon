package br.com.cdzstoemon.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "magia")
public class Magia {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	private Integer nivel;
	private Integer ip;
	private Integer ipReducao;
	private Integer dano;
	private Integer danoBonus;
	private Integer alcance;
	private Integer duracao;
	private Integer atributoBonus;
	private Integer cura;
	private Integer periciaBonus;
	private Integer periciaReducao;
	private Integer desabilitar;
	private Integer paralisar;
	private Integer queimaEnergia;
	private Integer materializar;
	
	@ManyToMany
	private List<Personagem> personagens;
	@ManyToMany
	private List<Armadura> armadura;
	
	@OneToOne
	private Atributos atributo;
	@OneToOne
	private Pericias pericia;
	
	
	public List<Personagem> getPersonagens() {
		return personagens;
	}
	public void setPersonagens(List<Personagem> personagens) {
		this.personagens = personagens;
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
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public Integer getIp() {
		return ip;
	}
	public void setIp(Integer ip) {
		this.ip = ip;
	}
	public Integer getIpReducao() {
		return ipReducao;
	}
	public void setIpReducao(Integer ipReducao) {
		this.ipReducao = ipReducao;
	}
	public Integer getDano() {
		return dano;
	}
	public void setDano(Integer dano) {
		this.dano = dano;
	}
	public Integer getDanoBonus() {
		return danoBonus;
	}
	public void setDanoBonus(Integer danoBonus) {
		this.danoBonus = danoBonus;
	}
	public Integer getAlcance() {
		return alcance;
	}
	public void setAlcance(Integer alcance) {
		this.alcance = alcance;
	}
	public Integer getDuracao() {
		return duracao;
	}
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	public Integer getAtributoBonus() {
		return atributoBonus;
	}
	public void setAtributoBonus(Integer atributoBonus) {
		this.atributoBonus = atributoBonus;
	}
	public Integer getCura() {
		return cura;
	}
	public void setCura(Integer cura) {
		this.cura = cura;
	}
	public Integer getPericiaBonus() {
		return periciaBonus;
	}
	public void setPericiaBonus(Integer periciaBonus) {
		this.periciaBonus = periciaBonus;
	}
	public Integer getPericiaReducao() {
		return periciaReducao;
	}
	public void setPericiaReducao(Integer periciaReducao) {
		this.periciaReducao = periciaReducao;
	}
	public Integer getDesabilitar() {
		return desabilitar;
	}
	public void setDesabilitar(Integer desabilitar) {
		this.desabilitar = desabilitar;
	}
	public Integer getParalisar() {
		return paralisar;
	}
	public void setParalisar(Integer paralisar) {
		this.paralisar = paralisar;
	}
	public Integer getQueimaEnergia() {
		return queimaEnergia;
	}
	public void setQueimaEnergia(Integer queimaEnergia) {
		this.queimaEnergia = queimaEnergia;
	}
	public Integer getMaterializar() {
		return materializar;
	}
	public void setMaterializar(Integer materializar) {
		this.materializar = materializar;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}