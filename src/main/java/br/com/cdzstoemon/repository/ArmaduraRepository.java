package br.com.cdzstoemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.cdzstoemon.model.Armadura;

@Repository
public interface ArmaduraRepository extends JpaRepository<Armadura, Integer> {

}
