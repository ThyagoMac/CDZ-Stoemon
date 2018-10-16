package br.com.cdzstoemon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "atributos")
public class Atributos {

	@Id
	@GeneratedValue
	private Integer id;

	@JoinColumn(name = "id_personagem")
	@OneToOne
	private Personagem personagem;
	
	@JoinColumn(name = "id_armadura")
	@OneToOne
	private Armadura armadura;
	
	@JoinColumn(name = "id_defeitos")
	@OneToOne
	private Defeitos defeito;
	
	@JoinColumn(name = "id_qualidades")
	@OneToOne
	private Qualidades qualidade;

	@JoinColumn(name = "id_magia")
	@OneToOne
	private Magia magia;

	private Integer forca;
	private Integer agilidade;
	private Integer vigor;
	private Integer presenca;
	private Integer manipulacao;
	private Integer autoControle;
	private Integer inteligencia;
	private Integer raciocinio;
	private Integer perceveranca;
	private Integer atributoDano;
	private Integer atributoHabilidade;
	private Integer atributoDefesa;
	private Integer grupoFisico;
	private Integer grupoSocial;
	private Integer grupoMental;

	
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

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public Defeitos getDefeito() {
		return defeito;
	}

	public void setDefeito(Defeitos defeito) {
		this.defeito = defeito;
	}

	public Qualidades getQualidade() {
		return qualidade;
	}

	public void setQualidade(Qualidades qualidade) {
		this.qualidade = qualidade;
	}

	public Magia getMagia() {
		return magia;
	}

	public void setMagia(Magia magia) {
		this.magia = magia;
	}

	public Integer getForca() {
		return forca;
	}

	public void setForca(Integer forca) {
		this.forca = forca;
	}

	public Integer getAgilidade() {
		return agilidade;
	}

	public void setAgilidade(Integer agilidade) {
		this.agilidade = agilidade;
	}

	public Integer getVigor() {
		return vigor;
	}

	public void setVigor(Integer vigor) {
		this.vigor = vigor;
	}

	public Integer getPresenca() {
		return presenca;
	}

	public void setPresenca(Integer presenca) {
		this.presenca = presenca;
	}

	public Integer getManipulacao() {
		return manipulacao;
	}

	public void setManipulacao(Integer manipulacao) {
		this.manipulacao = manipulacao;
	}

	public Integer getAutoControle() {
		return autoControle;
	}

	public void setAutoControle(Integer autoControle) {
		this.autoControle = autoControle;
	}

	public Integer getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}

	public Integer getRaciocinio() {
		return raciocinio;
	}

	public void setRaciocinio(Integer raciocinio) {
		this.raciocinio = raciocinio;
	}

	public Integer getPerceveranca() {
		return perceveranca;
	}

	public void setPerceveranca(Integer perceveranca) {
		this.perceveranca = perceveranca;
	}

	public Integer getAtributoDano() {
		return atributoDano;
	}

	public void setAtributoDano(Integer atributoDano) {
		this.atributoDano = atributoDano;
	}

	public Integer getAtributoHabilidade() {
		return atributoHabilidade;
	}

	public void setAtributoHabilidade(Integer atributoHabilidade) {
		this.atributoHabilidade = atributoHabilidade;
	}

	public Integer getAtributoDefesa() {
		return atributoDefesa;
	}

	public void setAtributoDefesa(Integer atributoDefesa) {
		this.atributoDefesa = atributoDefesa;
	}

	public Integer getGrupoFisico() {
		return grupoFisico;
	}

	public void setGrupoFisico(Integer grupoFisico) {
		this.grupoFisico = grupoFisico;
	}

	public Integer getGrupoSocial() {
		return grupoSocial;
	}

	public void setGrupoSocial(Integer grupoSocial) {
		this.grupoSocial = grupoSocial;
	}

	public Integer getGrupoMental() {
		return grupoMental;
	}

	public void setGrupoMental(Integer grupoMental) {
		this.grupoMental = grupoMental;
	}

}
