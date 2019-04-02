package br.edu.uniopet.imobiliaria.repository;

import br.edu.uniopet.imobiliaria.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

    Pagamento findByTipoPagamento(String pagamento);

    Pagamento findByFornecedorFinanciamento(String fornecedor);
}
