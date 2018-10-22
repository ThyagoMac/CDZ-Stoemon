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

import br.com.cdzstoemon.model.Armadura;
import br.com.cdzstoemon.model.Magia;
import br.com.cdzstoemon.service.MagiaService;

@RestController
public class MagiaController {

	@Autowired
	MagiaService magiaService;

	@RequestMapping(method = RequestMethod.POST, value = "/magia", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Magia> cadastrarMagia(@RequestBody Magia magia) {

		Magia magiaCadastrada = magiaService.cadastrar(magia);
		return new ResponseEntity<>(magiaCadastrada, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/magia", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Magia>> buscarTodasMagias() {

		Collection<Magia> magiasBuscadas = magiaService.buscarTodos();
		return new ResponseEntity<>(magiasBuscadas, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/magia/{id}")
	public ResponseEntity<Armadura> excluirArmadura(@PathVariable Integer id) {

		Magia magiaEncontrada = magiaService.buscaPorId(id);

		if (magiaEncontrada == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		magiaService.excluir(magiaEncontrada);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/magia", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Magia> alterarMagia(@RequestBody Magia magia) {

		Magia magiaEncontrada = magiaService.buscaPorId(magia.getId());
		if (magiaEncontrada == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		Magia magiaAlterada = magiaService.alterar(magia);
		return new ResponseEntity<>(magiaAlterada, HttpStatus.OK);
	}

}
