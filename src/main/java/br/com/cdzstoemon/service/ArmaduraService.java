package br.com.cdzstoemon.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cdzstoemon.model.Armadura;
import br.com.cdzstoemon.repository.ArmaduraRepository;

@Service
public class ArmaduraService {

	@Autowired
	ArmaduraRepository armaduraRepository;

	public Armadura cadastrar(Armadura armadura) {
		return armaduraRepository.save(armadura);
	}

	public Collection<Armadura> buscarTodos() {
		return armaduraRepository.findAll();
	}

	public void excluir(Armadura armadura) {
		armaduraRepository.delete(armadura);
	}

	public Armadura buscaPorId(Integer id) {
		return armaduraRepository.getOne(id);
	}

	public Armadura alterar(Armadura armadura) {
		return armaduraRepository.save(armadura);
	}
}
