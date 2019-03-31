package br.edu.uniopet.imobiliaria.repository;

import br.edu.uniopet.imobiliaria.model.VendaImovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaImovelRepository extends JpaRepository<VendaImovel,Integer> {
}
