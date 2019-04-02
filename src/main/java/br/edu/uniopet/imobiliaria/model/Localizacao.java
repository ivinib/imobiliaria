package br.edu.uniopet.imobiliaria.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "localizacao")
public class Localizacao{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "cep")
    private String cep;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    @OneToMany(mappedBy = "localizacao")
    private List<VendaImovel> vendaImovelList = new ArrayList<>();

    public Localizacao() {
    }

    public Localizacao(String endereco, String numero, String complemento, String bairro, String cep, String latitude, String longitude, Cidade cidade, List<VendaImovel> vendaImovelList) {
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.latitude = latitude;
        this.longitude = longitude;
        this.cidade = cidade;
        this.vendaImovelList = vendaImovelList;
    }

    public Integer getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Integer idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
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
                "idLocalizacao=" + idLocalizacao +
                ", endereco='" + endereco + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", cidade=" + cidade +
                ", vendaImovelList=" + vendaImovelList +
                '}';
    }
}
