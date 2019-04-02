package br.edu.uniopet.imobiliaria.repository;

import br.edu.uniopet.imobiliaria.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<Pais,Integer> {

    Pais findByNomePais(String pais);
}
