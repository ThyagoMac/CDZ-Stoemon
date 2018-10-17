package br.com.cdzstoemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atributos")
public class Atributo {

	@Id
	@GeneratedValue
	@Column(name="id_atributo")
	private Integer id;
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

	
	public Integer getId_atributos() {
		return id;
	}

	public void setId_atributos(Integer id_atributos) {
		this.id = id_atributos;
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
