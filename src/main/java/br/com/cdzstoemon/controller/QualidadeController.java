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

import br.com.cdzstoemon.model.Qualidade;
import br.com.cdzstoemon.service.QualidadeService;

@RestController
public class QualidadeController {

	@Autowired
	QualidadeService qualidadeService;

	@RequestMapping(method = RequestMethod.POST, value = "/qualidade", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Qualidade> cadastrarQualidade(@RequestBody Qualidade qualidade) {

		Qualidade qualidadeCadastrada = qualidadeService.cadastrar(qualidade);
		return new ResponseEntity<>(qualidadeCadastrada, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/qualidade", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Qualidade>> buscarTodasQualidades() {

		Collection<Qualidade> qualidadesBuscadas = qualidadeService.buscarTodos();
		return new ResponseEntity<>(qualidadesBuscadas, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/qualidade/{id}")
	public ResponseEntity<Qualidade> escluirQualidade(@PathVariable Integer id) {

		Qualidade qualidadeEncontrada = qualidadeService.buscaPorId(id);
		if (qualidadeEncontrada == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		qualidadeService.excluir(qualidadeEncontrada);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/qualidade", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Qualidade> alterarQualidade(@RequestBody Qualidade qualidade) {

		Qualidade qualidadeEncontrada = qualidadeService.buscaPorId(qualidade.getId());
		if (qualidadeEncontrada == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		Qualidade qualidadeAlterada = qualidadeService.alterar(qualidade);
		return new ResponseEntity<>(qualidadeAlterada, HttpStatus.OK);
	}
}
