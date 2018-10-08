package br.com.cdzstoemon.model;


public class Personagem {
	
	private Integer id;
	private String nome;
	private String sexo;
	private String classe;
	private Integer nivel;
	private Integer idade;
	
	private Atributos atributos;
	private Pericias pericias;
	private Magia magia;
	
	
	public Integer getId() {
		return id;
	}
	public Atributos getAtributos() {
		return atributos;
	}
	public void setAtributos(Atributos atributos) {
		this.atributos = atributos;
	}
	public Pericias getPericias() {
		return pericias;
	}
	public void setPericias(Pericias pericias) {
		this.pericias = pericias;
	}
	public Magia getMagia() {
		return magia;
	}
	public void setMagia(Magia magia) {
		this.magia = magia;
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
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
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
	
	
	
}
