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
import br.com.cdzstoemon.service.ArmaduraService;

@RestController
public class ArmaduraController {

	@Autowired
	ArmaduraService armaduraService;

	@RequestMapping(method = RequestMethod.POST, value = "/armadura", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Armadura> cadastrarArmadura(@RequestBody Armadura armadura) {

		Armadura armaduraCadastrada = armaduraService.cadastrar(armadura);
		return new ResponseEntity<>(armaduraCadastrada, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/armadura", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Armadura>> buscarTodasArmaduras() {

		Collection<Armadura> armadurasBuscadas = armaduraService.buscarTodos();
		return new ResponseEntity<>(armadurasBuscadas, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/armadura/{id}")
	public ResponseEntity<Armadura> excluirArmadura(@PathVariable Integer id) {

		Armadura armaduraEncontrada = armaduraService.buscaPorId(id);

		if (armaduraEncontrada == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		armaduraService.excluir(armaduraEncontrada);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/armadura", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Armadura> alterarArmadura(@RequestBody Armadura armadura) {

		Armadura armaduraEncontrada = armaduraService.buscaPorId(armadura.getId());
		if (armaduraEncontrada == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		Armadura armaduraAlterada = armaduraService.alterar(armadura);
		return new ResponseEntity<>(armaduraAlterada, HttpStatus.OK);
	}

}
