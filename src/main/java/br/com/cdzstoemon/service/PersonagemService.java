package br.com.cdzstoemon.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cdzstoemon.model.Armadura;
import br.com.cdzstoemon.model.Personagem;
import br.com.cdzstoemon.repository.ArmaduraRepository;
import br.com.cdzstoemon.repository.PersonagemRepository;

@Service
public class PersonagemService {

	@Autowired
	PersonagemRepository personagemRepository;
	@Autowired
	ArmaduraRepository armaduraRepository;

	public Personagem cadastrar(Personagem personagem) {

		personagemRepository.save(personagem);

		Collection<Armadura> armadurasEncontradas = armaduraRepository.findAll();

		if (armadurasEncontradas != null ) {
			for (Armadura plate : armadurasEncontradas) {
				
				System.out.println("Plate: " + plate.getNome());
			}
		}
		System.out.println("0 Plate");
		// listar armaduras e salvar -> reposit
		return personagem;
	}

	public Collection<Personagem> buscarTodos() {
		return personagemRepository.findAll();

	}

	public void excluir(Personagem personagem) {
		personagemRepository.delete(personagem);
	}

	public Personagem buscaPorId(Integer id) {
		return personagemRepository.getOne(id);
	}

	public Personagem alterar(Personagem personagem) {
		return personagemRepository.save(personagem);
	}

}
