package br.edu.uniopet.imobiliaria.model;

import org.hibernate.annotations.CollectionType;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "imovel")
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imovel")
    private Integer idImovel;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "status")
    private String status;

    @Column(name = "area_total")
    private String areaTotal;

    @Column(name = "area_privativa")
    private String areaPrivativa;

    @Column(name = "iptu")
    private String iptu;

    @Column(name = "condominio")
    private String condominio;

    @Column(name = "planta")
    private String planta;

    @Column(name = "dependencia")
    private String dependencia;

    @Column(name = "sacada")
    private String sacada;

    @Column(name = "portaria")
    private String portaria;

    @Column(name = "elevador")
    private String elevador;

    @Column(name = "churrasqueira")
    private String churrasqueira;

    @Column(name = "dormitorios")
    private String dormitorios;

    @Column(name = "suite")
    private String suite;

    @Column(name = "vagas")
    private String vagas;

    @Column(name = "banheiros")
    private String banheiros;

    @Column(name = "descricao", length = 1100)
    private String descricao;

    @Column(name = "valor_venda")
    private String valorVenda;

    @Column(name = "valor_aluguel")
    private String valorAluguel;

    @OneToMany(mappedBy = "imovel")
    private List<VendaImovel> vendaImovelList = new ArrayList<>();

    public Imovel() {
    }


    public Imovel(String categoria, String status, String areaTotal, String areaPrivativa, String iptu, String condominio, String planta, String dependencia, String sacada, String portaria, String elevador, String churrasqueira, String dormitorios, String suite, String vagas, String banheiros, String descricao, String valorVenda, String valorAluguel, List<VendaImovel> vendaImovelList) {
        this.categoria = categoria;
        this.status = status;
        this.areaTotal = areaTotal;
        this.areaPrivativa = areaPrivativa;
        this.iptu = iptu;
        this.condominio = condominio;
        this.planta = planta;
        this.dependencia = dependencia;
        this.sacada = sacada;
        this.portaria = portaria;
        this.elevador = elevador;
        this.churrasqueira = churrasqueira;
        this.dormitorios = dormitorios;
        this.suite = suite;
        this.vagas = vagas;
        this.banheiros = banheiros;
        this.descricao = descricao;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
        this.vendaImovelList = vendaImovelList;
    }

    public Integer getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(Integer idImovel) {
        this.idImovel = idImovel;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(String areaTotal) {
        this.areaTotal = areaTotal;
    }

    public String getAreaPrivativa() {
        return areaPrivativa;
    }

    public void setAreaPrivativa(String areaPrivativa) {
        this.areaPrivativa = areaPrivativa;
    }

    public String getIptu() {
        return iptu;
    }

    public void setIptu(String iptu) {
        this.iptu = iptu;
    }

    public String getCondominio() {
        return condominio;
    }

    public void setCondominio(String condominio) {
        this.condominio = condominio;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getSacada() {
        return sacada;
    }

    public void setSacada(String sacada) {
        this.sacada = sacada;
    }

    public String getPortaria() {
        return portaria;
    }

    public void setPortaria(String portaria) {
        this.portaria = portaria;
    }

    public String getElevador() {
        return elevador;
    }

    public void setElevador(String elevador) {
        this.elevador = elevador;
    }

    public String getChurrasqueira() {
        return churrasqueira;
    }

    public void setChurrasqueira(String churrasqueira) {
        this.churrasqueira = churrasqueira;
    }

    public String getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(String dormitorios) {
        this.dormitorios = dormitorios;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getVagas() {
        return vagas;
    }

    public void setVagas(String vagas) {
        this.vagas = vagas;
    }

    public String getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(String banheiros) {
        this.banheiros = banheiros;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(String valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public List<VendaImovel> getVendaImovelList() {
        return vendaImovelList;
    }

    public void setVendaImovelList(List<VendaImovel> vendaImovelList) {
        this.vendaImovelList = vendaImovelList;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "idImovel=" + idImovel +
                ", categoria='" + categoria + '\'' +
                ", status='" + status + '\'' +
                ", areaTotal='" + areaTotal + '\'' +
                ", areaPrivativa='" + areaPrivativa + '\'' +
                ", iptu='" + iptu + '\'' +
                ", condominio='" + condominio + '\'' +
                ", planta='" + planta + '\'' +
                ", dependencia='" + dependencia + '\'' +
                ", sacada='" + sacada + '\'' +
                ", portaria='" + portaria + '\'' +
                ", elevador='" + elevador + '\'' +
                ", churrasqueira='" + churrasqueira + '\'' +
                ", dormitorios='" + dormitorios + '\'' +
                ", suite='" + suite + '\'' +
                ", vagas='" + vagas + '\'' +
                ", banheiros='" + banheiros + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valorVenda='" + valorVenda + '\'' +
                ", valorAluguel='" + valorAluguel + '\'' +
                ", vendaImovelList=" + vendaImovelList +
                '}';
    }
}
