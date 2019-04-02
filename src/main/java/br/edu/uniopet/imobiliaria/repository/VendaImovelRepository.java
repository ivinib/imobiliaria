package br.edu.uniopet.imobiliaria.repository;

import br.edu.uniopet.imobiliaria.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendaImovelRepository extends JpaRepository<VendaImovel,Integer> {

    List<VendaImovel> findAllByLocalizacaoAndAndImovel(Localizacao localizacao, Imovel imovel);

    VendaImovel findByClienteAndImovel(Cliente cliente, Imovel imovel);

    VendaImovel findByClienteAndPagamentoAndImovel(Cliente cliente, Pagamento pagamento, Imovel imovel);

    VendaImovel findByClienteAndImovelAndTempo(Cliente cliente, Imovel imovel, Tempo tempo);
}
