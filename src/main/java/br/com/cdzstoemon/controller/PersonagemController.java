package br.com.cdzstoemon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonagemController {

	@RequestMapping(method=RequestMethod.GET, value="/personagens")
	public void buscarPersonagens(){
		
	}
	
}
