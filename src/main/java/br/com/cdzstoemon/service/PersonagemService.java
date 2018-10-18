package br.com.cdzstoemon.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cdzstoemon.model.Personagem;
import br.com.cdzstoemon.repository.PersonagemRepository;

@Service
public class PersonagemService {

	@Autowired
	PersonagemRepository personagemRepository;

	public Personagem cadastrar(Personagem personagem) {
		return personagemRepository.save(personagem);
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
