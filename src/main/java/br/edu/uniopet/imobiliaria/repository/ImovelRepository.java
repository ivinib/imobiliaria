package br.edu.uniopet.imobiliaria.repository;

import br.edu.uniopet.imobiliaria.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel,Integer> {
    Imovel findByCategoriaAndAreaTotal(String categoria, String area);

    Imovel findByAreaTotalAndAreaPrivativa(String areaTotal, String areaPrivativa);

    Imovel findByCategoriaAndStatus(String categoria, String status);

    Imovel findByCategoriaAndIptu(String categoria, String iptu);

    List<Imovel> findAllByCategoria(String categoria);

    List<Imovel> findAllByStatus(String status);

}
