package br.com.cdzstoemon.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cdzstoemon.model.Personagem;
import br.com.cdzstoemon.service.PersonagemService;

@RestController
public class PersonagemController {

	@Autowired
	PersonagemService personagemService;

	@RequestMapping(method = RequestMethod.POST, value = "/personagem", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Personagem> cadastrarPersonagem(@RequestBody Personagem personagem) {

		Personagem personagemCadastrado = personagemService.cadastrar(personagem);
		return new ResponseEntity<>(personagemCadastrado, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/personagem", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Personagem>> buscarTodosPersonagens() {

		Collection<Personagem> personagensBuscados = personagemService.buscarTodos();
		return new ResponseEntity<>(personagensBuscados, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "personagem/{id}")
	public ResponseEntity<Personagem> excluirPersonagem(@PathVariable Integer id) {

		Personagem personagemEncontrado = personagemService.buscaPorId(id);

		if (personagemEncontrado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		personagemService.excluir(personagemEncontrado);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/personagem", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Personagem> alterarPersonagem(@RequestBody Personagem personagem) {

		Personagem personagemEncontrado = personagemService.buscaPorId(personagem.getId());
		if (personagemEncontrado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		Personagem personagemAlterado = personagemService.alterar(personagem);
		return new ResponseEntity<>(personagemAlterado, HttpStatus.OK);

	}
}
