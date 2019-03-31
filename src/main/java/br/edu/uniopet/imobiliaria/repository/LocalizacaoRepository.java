package br.edu.uniopet.imobiliaria.repository;

import br.edu.uniopet.imobiliaria.model.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizacaoRepository extends JpaRepository<Localizacao, Integer> {
    Localizacao findByEnderecoAndNumero(String endereco, String numero);
}
