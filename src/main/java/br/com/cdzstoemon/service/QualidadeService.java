package br.com.cdzstoemon.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cdzstoemon.model.Qualidade;
import br.com.cdzstoemon.repository.QualidadeRepository;

@Service
public class QualidadeService {
	
	@Autowired
	QualidadeRepository qualidadeRepository;
	
	public Qualidade cadastrar(Qualidade qualidade) {
		return qualidadeRepository.save(qualidade);
	}
	
	public Collection<Qualidade> buscarTodos(){
		return qualidadeRepository.findAll();
	}
	
	public void excluir (Qualidade qualidade) {
		qualidadeRepository.delete(qualidade);
	}
	
	public Qualidade buscaPorId(Integer id) {
		return qualidadeRepository.getOne(id);
	}

	public Qualidade alterar (Qualidade qualidade) {
		return qualidadeRepository.save(qualidade);
	}
}
