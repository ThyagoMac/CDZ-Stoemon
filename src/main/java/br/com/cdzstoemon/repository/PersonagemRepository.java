package br.com.cdzstoemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cdzstoemon.model.Personagem;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {
	
}
