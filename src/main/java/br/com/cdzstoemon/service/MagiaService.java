package br.com.cdzstoemon.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cdzstoemon.model.Magia;
import br.com.cdzstoemon.repository.MagiaRepository;

@Service
public class MagiaService {
	@Autowired
	MagiaRepository magiaRepository;
	
	public Magia cadastrar(Magia magia) {
		return magiaRepository.save(magia);
	}
	
	public Collection<Magia> buscarTodos(){
		return magiaRepository.findAll();
	}
	
	public void excluir (Magia magia) {
		magiaRepository.delete(magia);
	}
	
	public Magia buscaPorId(Integer id) {
		return magiaRepository.getOne(id);
	}
	
	public Magia alterar(Magia magia) {
		return magiaRepository.save(magia);
	}
}
