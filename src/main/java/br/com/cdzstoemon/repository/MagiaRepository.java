package br.com.cdzstoemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cdzstoemon.model.Magia;

@Repository
public interface MagiaRepository extends JpaRepository<Magia, Integer> {

}
