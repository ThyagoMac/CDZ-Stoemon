package br.com.cdzstoemon.model;

public class Qualidades {

	private String nome;
	private Atributos atributos = new Atributos();
	private Pericias pericias = new Pericias();
	private Magia magia = new Magia();

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
