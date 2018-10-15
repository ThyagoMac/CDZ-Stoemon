package br.com.cdzstoemon.test;

import java.util.Arrays;

import javax.persistence.EntityManager;

import br.com.cdzstoemon.model.Armadura;
import br.com.cdzstoemon.model.Atributos;
import br.com.cdzstoemon.model.Defeitos;
import br.com.cdzstoemon.model.Pericias;
import br.com.cdzstoemon.model.Personagem;
import br.com.cdzstoemon.model.Qualidades;
import br.com.cdzstoemon.model.Usuario;

public class TestPersonagem {
	public static void main(String[] args) {

		
		
		Usuario usuario = new Usuario();
		usuario.setAcc("Pickles");
		usuario.setPass("Senha");

		Personagem personagem = new Personagem();
		Atributos atributo = new Atributos();
		Pericias pericia = new Pericias();
		Armadura armadura = new Armadura();
		Atributos atributoAr = new Atributos();
		Qualidades qualidade = new Qualidades();
		Defeitos defeito = new Defeitos();
		
		
		
		personagem.setNome("PersoPickles");
		personagem.setSexo("Masc");
		atributo.setForca(1);
		atributo.setAgilidade(2);
		atributo.setVigor(3);
		atributoAr.setForca(6);
		atributoAr.setAgilidade(5);
		atributoAr.setVigor(4);
		pericia.setAcademicos(2);
		pericia.setComputador(3);
		pericia.setConducao(5);
		armadura.setNome("Pickles-Armor");
		qualidade.setNome("Bonitao");
		defeito.setNome("Caolho");
//		Personagem personagem2 = new Personagem();
//		personagem2.setNome("PersoPickles");
//		personagem2.setSexo("Masc");

		atributo.setPersonagem(personagem);
		atributoAr.setArmadura(armadura);
		armadura.setPersonagem(personagem);
		pericia.setPersonagem(personagem);
		qualidade.setPersonagem(personagem);
		defeito.setPersonagem(personagem);
		
		usuario.setPersonagens(Arrays.asList(personagem));
	}
}
