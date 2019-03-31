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

        Cidade cidade = new Cidade();
        Estado estado = new Estado();
        Imovel imovel = new Imovel();
        Localizacao localizacao = new Localizacao();
        VendaImovel vendaImovel = new VendaImovel();

        System.out.println(imobiliariaList);

        for (Imobiliaria imobiliaria : imobiliariaList){

            if (imobiliaria.getUf() != null){
                estado.setUf(imobiliaria.getUf());
                Estado e = new Estado();
                e = estadoRepository.findByUf(estado.getUf());
                if (e == null)
                    estadoRepository.save(estado);
            }

            if(imobiliaria.getCidade() != null){
                cidade.setCidade(imobiliaria.getCidade());
                cidade.setCep(imobiliaria.getCep());
                Cidade c = new Cidade();
                c = cidadeRepository.findByCidade(cidade.getCidade());
                if(c == null){
                    Estado e = estadoRepository.findByUf(estado.getUf());
                    cidade.setEstado(e);
                    cidadeRepository.save(cidade);
                }
            }

            if (imobiliaria.getCategoria() != null ||
                imobiliaria.getStatus() != null ||
                imobiliaria.getAreaTotal() != null ||
                imobiliaria.getAreaPrivativa() != null ||
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
                imobiliaria.getDescricao() != null ||
                imobiliaria.getValorVenda() != null){

                imovel.setCategoria(imobiliaria.getCategoria());
                imovel.setStatus(imobiliaria.getStatus());
                imovel.setAreaTotal(imobiliaria.getAreaTotal());
                imovel.setAreaPrivativa(imobiliaria.getAreaPrivativa());
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
                imovel.setValorVenda(imobiliaria.getValorVenda());

                Imovel i = new Imovel();
                i = imovelRepository.findByCategoria(imovel.getCategoria());

                if (i == null)
                    imovelRepository.save(i);
            }

            if (imobiliaria.getEndereco() != null ||
                imobiliaria.getNumero() != null ||
                imobiliaria.getComplemento() != null ||
                imobiliaria.getBairro() != null ){

                localizacao.setEndereco(imobiliaria.getEndereco());
                localizacao.setNumero(imobiliaria.getNumero());
                localizacao.setComplemento(imobiliaria.getComplemento());
                localizacao.setBairro(imobiliaria.getBairro());

                Localizacao l = new Localizacao();
                l = localizacaoRepository.findByEnderecoAndNumero(localizacao.getEndereco(),localizacao.getNumero());
                if(l == null){

                    Cidade c = new Cidade();
                    c = cidadeRepository.findByCidade(cidade.getCidade());

                    localizacao.setCidade(c);
                    localizacaoRepository.save(localizacao);
                }
            }

            if (imobiliaria.getId() != null){
                vendaImovel.setIdJSON(imobiliaria.getId());

                Imovel i = new Imovel();
                i = imovelRepository.findByCategoria(imovel.getCategoria());

                Localizacao l = new Localizacao();
                l = localizacaoRepository.findByEnderecoAndNumero(localizacao.getEndereco(),localizacao.getNumero());

                vendaImovel.setImovel(i);
                vendaImovel.setLocalizacao(l);

                vendaImovelRepository.save(vendaImovel);
            }

            cidade = null;
            estado = null;
            imovel = null;
            localizacao = null;
            vendaImovel = null;
        }
    }
}
