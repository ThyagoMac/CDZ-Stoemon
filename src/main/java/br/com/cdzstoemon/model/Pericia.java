package br.com.cdzstoemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pericia")
public class Pericia {

	@Id
	@GeneratedValue
	@Column(name="id_pericia")
	private Integer id;
	private Integer esportes;
	private Integer intimidacao;
	private Integer furtividade;
	private Integer sobrevivencia;
	private Integer conducao;
	private Integer punga;
	private Integer etiqueta;
	private Integer expressao;
	private Integer labia;
	private Integer manha;


	@JoinColumn(name = "id_personagem")
	@OneToOne
	private Personagem personagem;
	
	@JoinColumn(name = "id_armadura")
	@OneToOne
	private Armadura armadura;
	
	@JoinColumn(name = "id_qualidades")
	@OneToOne
	private Qualidade qualidade;

	@JoinColumn(name = "id_magia")
	@OneToOne
	private Magia magia;

	
	
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

	public Qualidade getQualidade() {
		return qualidade;
	}

	public void setQualidade(Qualidade qualidade) {
		this.qualidade = qualidade;
	}

	public Magia getMagia() {
		return magia;
	}

	public void setMagia(Magia magia) {
		this.magia = magia;
	}

	public Integer getEsportes() {
		return esportes;
	}

	public void setEsportes(Integer esportes) {
		this.esportes = esportes;
	}

	public Integer getIntimidacao() {
		return intimidacao;
	}

	public void setIntimidacao(Integer intimidacao) {
		this.intimidacao = intimidacao;
	}

	public Integer getFurtividade() {
		return furtividade;
	}

	public void setFurtividade(Integer furtividade) {
		this.furtividade = furtividade;
	}

	public Integer getSobrevivencia() {
		return sobrevivencia;
	}

	public void setSobrevivencia(Integer sobrevivencia) {
		this.sobrevivencia = sobrevivencia;
	}

	public Integer getConducao() {
		return conducao;
	}

	public void setConducao(Integer conducao) {
		this.conducao = conducao;
	}

	public Integer getPunga() {
		return punga;
	}

	public void setPunga(Integer punga) {
		this.punga = punga;
	}

	public Integer getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(Integer etiqueta) {
		this.etiqueta = etiqueta;
	}

	public Integer getExpressao() {
		return expressao;
	}

	public void setExpressao(Integer expressao) {
		this.expressao = expressao;
	}

	public Integer getLabia() {
		return labia;
	}

	public void setLabia(Integer labia) {
		this.labia = labia;
	}

	public Integer getManha() {
		return manha;
	}

	public void setManha(Integer manha) {
		this.manha = manha;
	}

	public Integer getAcademicos() {
		return academicos;
	}

	public void setAcademicos(Integer academicos) {
		this.academicos = academicos;
	}

	public Integer getComputador() {
		return computador;
	}

	public void setComputador(Integer computador) {
		this.computador = computador;
	}

	public Integer getInvestigacao() {
		return investigacao;
	}

	public void setInvestigacao(Integer investigacao) {
		this.investigacao = investigacao;
	}

	public Integer getFinancas() {
		return financas;
	}

	public void setFinancas(Integer financas) {
		this.financas = financas;
	}

	public Integer getBriga() {
		return briga;
	}

	public void setBriga(Integer briga) {
		this.briga = briga;
	}

	public Integer getArmas() {
		return armas;
	}

	public void setArmas(Integer armas) {
		this.armas = armas;
	}

	public Integer getBloqueio() {
		return bloqueio;
	}

	public void setBloqueio(Integer bloqueio) {
		this.bloqueio = bloqueio;
	}

	public Integer getEsquiva() {
		return esquiva;
	}

	public void setEsquiva(Integer esquiva) {
		this.esquiva = esquiva;
	}

	public Integer getFoco() {
		return foco;
	}

	public void setFoco(Integer foco) {
		this.foco = foco;
	}

	private Integer academicos;
	private Integer computador;
	private Integer investigacao;
	private Integer financas;

	private Integer briga;
	private Integer armas;
	private Integer bloqueio;
	private Integer esquiva;
	private Integer foco;

}
