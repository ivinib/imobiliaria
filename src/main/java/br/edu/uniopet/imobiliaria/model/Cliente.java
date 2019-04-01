package br.edu.uniopet.imobiliaria.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "faixaEtaria")
    private String faixaEtaria;

    @Column(name = "faixa_renda")
    private String faixaRenda;

    @Column(name = "genero")
    private String genero;

    @Column(name = "grauEscolaridade")
    private String grauEscolaridade;

    @OneToMany(mappedBy = "localizacao")
    private List<VendaImovel> vendaImovelList = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String faixaEtaria, String faixaRenda, String genero, String grauEscolaridade, List<VendaImovel> vendaImovelList) {
        this.faixaEtaria = faixaEtaria;
        this.faixaRenda = faixaRenda;
        this.genero = genero;
        this.grauEscolaridade = grauEscolaridade;
        this.vendaImovelList = vendaImovelList;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getFaixaRenda() {
        return faixaRenda;
    }

    public void setFaixaRenda(String faixaRenda) {
        this.faixaRenda = faixaRenda;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGrauEscolaridade() {
        return grauEscolaridade;
    }

    public void setGrauEscolaridade(String grauEscolaridade) {
        this.grauEscolaridade = grauEscolaridade;
    }

    public List<VendaImovel> getVendaImovelList() {
        return vendaImovelList;
    }

    public void setVendaImovelList(List<VendaImovel> vendaImovelList) {
        this.vendaImovelList = vendaImovelList;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", faixaEtaria='" + faixaEtaria + '\'' +
                ", faixaRenda='" + faixaRenda + '\'' +
                ", genero='" + genero + '\'' +
                ", grauEscolaridade='" + grauEscolaridade + '\'' +
                ", vendaImovelList=" + vendaImovelList +
                '}';
    }
}
