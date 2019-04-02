package br.edu.uniopet.imobiliaria;

import br.edu.uniopet.imobiliaria.model.*;
import br.edu.uniopet.imobiliaria.repository.*;
import br.edu.uniopet.imobiliaria.util.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ImobiliariaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ImobiliariaApplication.class, args);
    }

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private EstadoRepository estadoRepository;

    @Autowired
    private ImovelRepository imovelRepository;

    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    @Autowired
    private VendaImovelRepository vendaImovelRepository;

    @Override
    public void run(String... args) throws Exception{

        List<Imobiliaria> imobiliariaList = new ArrayList<>();

        imobiliariaList = Convert.convertJson();

        for (Imobiliaria imobiliaria : imobiliariaList){

            Cidade cidade = new Cidade();
            Estado estado = new Estado();
            Imovel imovel = new Imovel();
            Localizacao localizacao = new Localizacao();
            VendaImovel vendaImovel = new VendaImovel();

            if (imobiliaria.getUf() != null){
                estado.setUf(imobiliaria.getUf());


                Estado e = new Estado();
                e = estadoRepository.findByUf(estado.getUf());
                if (e == null) {
                    estadoRepository.save(estado);
                }
            }


            if(imobiliaria.getCidade() != null){
                cidade.setCidade(imobiliaria.getCidade());

                Cidade c = new Cidade();
                c = cidadeRepository.findByCidade(cidade.getCidade());
                if(c == null){
                    Estado e = estadoRepository.findByUf(estado.getUf());
                    cidade.setEstado(e);
                    cidadeRepository.save(cidade);
                }
            }

            if (imobiliaria.getEndereco() != null ||
                    imobiliaria.getNumero() != null ||
                    imobiliaria.getComplemento() != null ||
                    imobiliaria.getBairro() != null ||
                    imobiliaria.getLatitude() != null ||
                    imobiliaria.getLongitude() != null ||
                    imobiliaria.getCep() != null){

                localizacao.setEndereco(imobiliaria.getEndereco());
                localizacao.setNumero(imobiliaria.getNumero());
                localizacao.setComplemento(imobiliaria.getComplemento());
                localizacao.setBairro(imobiliaria.getBairro());
                localizacao.setLatitude(imobiliaria.getLatitude());
                localizacao.setLongitude(imobiliaria.getLongitude());
                localizacao.setCep(imobiliaria.getCep());

                Localizacao l = new Localizacao();
                l = localizacaoRepository.findByEnderecoAndNumero(localizacao.getEndereco(),localizacao.getNumero());
                if(l == null){

                    Cidade c = new Cidade();
                    c = cidadeRepository.findByCidade(cidade.getCidade());

                    localizacao.setCidade(c);
                    localizacaoRepository.save(localizacao);
                }
            }

            if (imobiliaria.getCategoria() != null ||
                imobiliaria.getStatus() != null ||
                imobiliaria.getArea_total() != null ||
                imobiliaria.getArea_privativa() != null ||
                imobiliaria.getIptu() != null ||
                imobiliaria.getCondominio() != null ||
                imobiliaria.getPlanta() != null ||
                imobiliaria.getDependencia() != null ||
                imobiliaria.getSacada() != null ||
                imobiliaria.getPortaria() != null ||
                imobiliaria.getElevador() != null ||
                imobiliaria.getChurrasqueira() != null ||
                imobiliaria.getDormitorios() != null ||
                imobiliaria.getSuites() != null ||
                imobiliaria.getVagas() != null ||
                imobiliaria.getBanheiros() != null ||
                imobiliaria.getDescricao() != null ){

                imovel.setCategoria(imobiliaria.getCategoria());
                imovel.setStatus(imobiliaria.getStatus());
                imovel.setAreaTotal(imobiliaria.getArea_total());
                imovel.setAreaPrivativa(imobiliaria.getArea_privativa());
                imovel.setIptu(imobiliaria.getIptu());
                imovel.setCondominio(imobiliaria.getCondominio());
                imovel.setPlanta(imobiliaria.getPlanta());
                imovel.setDependencia(imobiliaria.getDependencia());
                imovel.setSacada(imobiliaria.getSacada());
                imovel.setPortaria(imobiliaria.getPortaria());
                imovel.setElevador(imobiliaria.getElevador());
                imovel.setChurrasqueira(imobiliaria.getChurrasqueira());
                imovel.setDormitorios(imobiliaria.getDormitorios());
                imovel.setSuite(imobiliaria.getSuites());
                imovel.setVagas(imobiliaria.getVagas());
                imovel.setBanheiros(imobiliaria.getBanheiros());
                imovel.setDescricao(imobiliaria.getDescricao());

                if (imobiliaria.getValor_venda() == "null"){
                    imovel.setValorVenda(imobiliaria.getValor_venda());
                }else{
                    imovel.setValorVenda("0");
                }

                if (imobiliaria.getValor_aluguel() == "null"){
                    imovel.setValorAluguel(imobiliaria.getValor_aluguel());
                }else{
                    imovel.setValorAluguel("0");
                }

                Imovel i = new Imovel();

                i = imovelRepository.findByCategoriaAndAreaTotal(imovel.getCategoria(),imovel.getAreaTotal());

                if (i == null){
                   imovelRepository.save(imovel);
                }
            }

            if (imobiliaria.getId() != null){
                vendaImovel.setIdJSON(imobiliaria.getId());

                Imovel i = new Imovel();
                i = imovelRepository.findByCategoriaAndAreaTotal(imovel.getCategoria(), imovel.getAreaTotal());

                Localizacao l = new Localizacao();
                l = localizacaoRepository.findByEnderecoAndNumero(localizacao.getEndereco(),localizacao.getNumero());

                vendaImovel.setImovel(i);
                vendaImovel.setLocalizacao(l);

                vendaImovelRepository.save(vendaImovel);
            }
        }
    }
}
