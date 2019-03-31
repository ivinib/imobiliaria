package br.edu.uniopet.imobiliaria.repository;

import br.edu.uniopet.imobiliaria.model.Imobiliaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImobiliariaRepository extends JpaRepository<Imobiliaria, Integer> {
}
