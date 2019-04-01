package br.edu.uniopet.imobiliaria.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pagamento")
    private Integer idPagamento;

    @Column(name = "tipo_pagamento")
    private String tipoPagamento;

    @Column(name = "fornecedor_financiamento")
    private String fornecedorFinanciamento;

    @Column(name = "tipo_entrada")
    private String tipoEntrada;

    @OneToMany(mappedBy = "localizacao")
    private List<VendaImovel> vendaImovelList = new ArrayList<>();

    public Pagamento() {
    }

    public Pagamento(String tipoPagamento, String fornecedorFinanciamento, String tipoEntrada, List<VendaImovel> vendaImovelList) {
        this.tipoPagamento = tipoPagamento;
        this.fornecedorFinanciamento = fornecedorFinanciamento;
        this.tipoEntrada = tipoEntrada;
        this.vendaImovelList = vendaImovelList;
    }

    public Integer getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Integer idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getFornecedorFinanciamento() {
        return fornecedorFinanciamento;
    }

    public void setFornecedorFinanciamento(String fornecedorFinanciamento) {
        this.fornecedorFinanciamento = fornecedorFinanciamento;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public List<VendaImovel> getVendaImovelList() {
        return vendaImovelList;
    }

    public void setVendaImovelList(List<VendaImovel> vendaImovelList) {
        this.vendaImovelList = vendaImovelList;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "idPagamento=" + idPagamento +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                ", fornecedorFinanciamento='" + fornecedorFinanciamento + '\'' +
                ", tipoEntrada='" + tipoEntrada + '\'' +
                ", vendaImovelList=" + vendaImovelList +
                '}';
    }
}
