package br.edu.uniopet.imobiliaria.repository;

import br.edu.uniopet.imobiliaria.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel,Integer> {
    Imovel findByCategoria(String categoria);
}
