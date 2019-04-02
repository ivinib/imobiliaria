package br.edu.uniopet.imobiliaria.repository;

import br.edu.uniopet.imobiliaria.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

    Cliente findByFaixaEtaria(String faixa);

    Cliente findByFaixaRenda(String renda);
}
