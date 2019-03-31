package br.edu.uniopet.imobiliaria.repository;

import br.edu.uniopet.imobiliaria.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer> {
    Estado findByUf(String uf);
}
