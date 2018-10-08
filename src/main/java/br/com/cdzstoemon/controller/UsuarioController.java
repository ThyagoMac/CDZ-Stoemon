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

import br.com.cdzstoemon.model.Usuario;
import br.com.cdzstoemon.service.UsuarioService;

@RestController
public class UsuarioController {
	
	//injeta o usuarioService
	@Autowired
	UsuarioService usuarioService;
	
	//endpoints
	@RequestMapping(
			method=RequestMethod.POST, 
			value="/usuarios", 
			consumes=MediaType.APPLICATION_JSON_VALUE
			)
		public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario){
		
		Usuario usuarioCadastrado = usuarioService.cadastrar(usuario);
		return new ResponseEntity<>(usuarioCadastrado, HttpStatus.CREATED);
	}
	
	@RequestMapping(
			method=RequestMethod.GET, 
			value="/usuarios", 
			produces=MediaType.APPLICATION_JSON_VALUE
			)
		public ResponseEntity<Collection<Usuario>> buscarTodosUsuarios(){
		
		Collection<Usuario> usuariosBuscados = usuarioService.buscarTodos();
		return new ResponseEntity<>(usuariosBuscados, HttpStatus.OK);
		
	}
	
	@RequestMapping(
			method=RequestMethod.DELETE, 
			value="/usuarios/{id}"
			)
		public ResponseEntity<Usuario> excluirUsuario(@PathVariable Integer id){
		
		Usuario usuarioEncontrado = usuarioService.buscaPorId(id);
		
		if (usuarioEncontrado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		usuarioService.excluir(usuarioEncontrado);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(
			method=RequestMethod.PUT, 
			value="/usuarios", 
			consumes=MediaType.APPLICATION_JSON_VALUE
			)
		public ResponseEntity<Usuario> alterarUsuario(@RequestBody Usuario usuario){
		
//		Usuario usuarioEncontrado = usuarioService.buscaPorId(usuario.getId());
//		
//		if (usuarioEncontrado == null) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
		
		Usuario usuarioAlterado = usuarioService.alterar(usuario);
		return new ResponseEntity<>(usuarioAlterado, HttpStatus.OK);
	}

}
