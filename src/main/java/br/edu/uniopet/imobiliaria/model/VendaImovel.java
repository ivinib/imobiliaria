package br.edu.uniopet.imobiliaria.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "venda_imovel")
public class VendaImovel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venda_imovel")
    private Integer idVenda;
    private Integer idJSON;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_imovel")
    private Imovel imovel;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_localizacao")
    private Localizacao localizacao;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_pagamento")
    private Pagamento pagamento;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "tempo")
    private Tempo tempo;

    public VendaImovel() {
    }

    public VendaImovel(Integer idJSON, Imovel imovel, Localizacao localizacao, Cliente cliente, Pagamento pagamento, Tempo tempo) {
        this.idJSON = idJSON;
        this.imovel = imovel;
        this.localizacao = localizacao;
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.tempo = tempo;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Integer getIdJSON() {
        return idJSON;
    }

    public void setIdJSON(Integer idJSON) {
        this.idJSON = idJSON;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Tempo getTempo() {
        return tempo;
    }

    public void setTempo(Tempo tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "VendaImovel{" +
                "idVenda=" + idVenda +
                ", idJSON=" + idJSON +
                ", imovel=" + imovel +
                ", localizacao=" + localizacao +
                ", cliente=" + cliente +
                ", pagamento=" + pagamento +
                ", tempo=" + tempo +
                '}';
    }
}


