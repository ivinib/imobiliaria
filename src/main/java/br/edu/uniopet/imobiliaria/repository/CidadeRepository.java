package br.edu.uniopet.imobiliaria.repository;

import br.edu.uniopet.imobiliaria.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Integer> {
    Cidade findByCidade(String cidade);

    Cidade existsByCidade(String cidade);
}
