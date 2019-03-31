package br.edu.uniopet.imobiliaria.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "localizacao")
public class Localizacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idLocalizacao")
    private Integer idLocalizacao;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "numero")
    private String numero;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "bairro")
    private String bairro;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    @OneToMany(mappedBy = "localizacao")
    private List<VendaImovel> vendaImovelList = new ArrayList<>();

    public Localizacao() {
    }

    public Localizacao(Integer id, String endereco, String numero, String complemento, String bairro, Cidade cidade,List<VendaImovel> vendaImovelList) {
        this.idLocalizacao = id;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.vendaImovelList = vendaImovelList;
    }

    public Integer getId() {
        return idLocalizacao;
    }

    public void setId(Integer id) {
        this.idLocalizacao = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<VendaImovel> getVendaImovelList() {
        return vendaImovelList;
    }

    public void setVendaImovelList(List<VendaImovel> vendaImovelList) {
        this.vendaImovelList = vendaImovelList;
    }

    @Override
    public String toString() {
        return "Localizacao{" +
                "id=" + idLocalizacao +
                ", endereco='" + endereco + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade=" + cidade +
                ", vendaImovelList=" + vendaImovelList +
                '}';
    }
}
