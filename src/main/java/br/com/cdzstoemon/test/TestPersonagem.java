package br.com.cdzstoemon.test;

import java.util.Arrays;

import br.com.cdzstoemon.model.Armadura;
import br.com.cdzstoemon.model.Atributo;
import br.com.cdzstoemon.model.Pericia;
import br.com.cdzstoemon.model.Personagem;
import br.com.cdzstoemon.model.Qualidade;
import br.com.cdzstoemon.model.Usuario;

public class TestPersonagem {
	public static void main(String[] args) {

		Usuario usuarioJoao = new Usuario();
		usuarioJoao.setAcc("Pickles");
		usuarioJoao.setPass("Senha");

		Personagem personagem1 = new Personagem();
		Atributo atributo1 = new Atributo();
		Pericia pericia1 = new Pericia();
		Armadura armadura1 = new Armadura();
		Atributo atributoAr = new Atributo();
		Qualidade qualidade1 = new Qualidade();

		personagem1.setNome("PersoPickles");
		personagem1.setSexo("Masc");
		atributo1.setForca(1);
		atributo1.setAgilidade(2);
		atributo1.setVigor(3);
		atributoAr.setForca(6);
		atributoAr.setAgilidade(5);
		atributoAr.setVigor(4);
		pericia1.setAcademicos(2);
		pericia1.setComputador(3);
		pericia1.setConducao(5);
		armadura1.setNome("Pickles-Armor");
		qualidade1.setNome("Bonitao");
		
//		List <Qualidade> qualidades = null;
//		qualidades.add(qualidade1);
//		Personagem personagem2 = new Personagem();
//		personagem2.setNome("PersoPickles");
//		personagem2.setSexo("Masc");

		personagem1.setAtributo(atributo1);
		armadura1.setAtributo(atributoAr);
//		personagem1.setQualidade(java.util.List<Qualidade>);
		System.out.println(personagem1.getQualidade());
		//personagem1.setArmadura(armadura1);
//		personagem1.setQualidade(qualidades);
		armadura1.setPersonagem(personagem1);
		personagem1.setPericia(pericia1);
		
		//qualidade.setPersonagem(personagem1);
		//defeito.setPersonagem(personagem1);

		usuarioJoao.setPersonagens(Arrays.asList(personagem1));
	}
}
