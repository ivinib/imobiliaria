package br.edu.uniopet.imobiliaria.model;


import javax.persistence.Entity;
import java.util.List;

@Entity
public class Imobiliaria {

    private Integer id;
    private String categoria;
    private String cidade;
    private String uf;
    private String bairro;
    private String status;
    private String areaTotal;
    private String areaPrivativa;
    private String iptu;
    private String condominio;
    private String planta;
    private String dependencia;
    private String sacada;
    private String portaria;
    private String elevador;
    private String churrasqueira;
    private String dormitorios;
    private String suites;
    private String vagas;
    private String banheiros;
    private String cep;
    private String endereco;
    private String numero;
    private String complemento;
    private String descricao;
    private String latitude;
    private String longitude;
    private String valorVenda;
    private String mostrarMapa;
    private String imagemPrincipal;
    private List<String> imagens;


    public Imobiliaria() {
    }

    public Imobiliaria(Integer id, String categoria,String cidade, String uf, String bairro, String status, String areaTotal, String areaPrivativa, String iptu, String condominio, String planta, String dependencia, String sacada, String portaria, String elevador, String churrasqueira, String dormitorios, String suites, String vagas, String banheiros, String cep, String endereco, String numero, String complemento, String descricao, String latitude, String longitude, String valorVenda, String mostrarMapa, String imagemPrincipal, List<String> imagens) {
        this.id = id;
        this.categoria = categoria;
        this.cidade = cidade;
        this.uf = uf;
        this.bairro = bairro;
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
        this.suites = suites;
        this.vagas = vagas;
        this.banheiros = banheiros;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.descricao = descricao;
        this.latitude = latitude;
        this.longitude = longitude;
        this.valorVenda = valorVenda;
        this.mostrarMapa = mostrarMapa;
        this.imagemPrincipal = imagemPrincipal;
        this.imagens = imagens;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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

    public String getSuites() {
        return suites;
    }

    public void setSuites(String suites) {
        this.suites = suites;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getMostrarMapa() {
        return mostrarMapa;
    }

    public void setMostrarMapa(String mostrarMapa) {
        this.mostrarMapa = mostrarMapa;
    }

    public String getImagemPrincipal() {
        return imagemPrincipal;
    }

    public void setImagemPrincipal(String imagemPrincipal) {
        this.imagemPrincipal = imagemPrincipal;
    }

    public List<String> getImagens() {
        return imagens;
    }

    public void setImagens(List<String> imagens) {
        this.imagens = imagens;
    }

    @Override
    public String toString() {
        return "Imobiliaria{" +
                "id=" + id +
                ", categoria='" + categoria + '\'' +
                ", uf='" + uf + '\'' +
                ", bairro='" + bairro + '\'' +
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
                ", dormitorios=" + dormitorios +
                ", suites=" + suites +
                ", vagas=" + vagas +
                ", banheiros=" + banheiros +
                ", cep='" + cep + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", descricao='" + descricao + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", valorVenda='" + valorVenda + '\'' +
                ", mostrarMapa='" + mostrarMapa + '\'' +
                ", imagemPrincipal='" + imagemPrincipal + '\'' +
                ", imagens=" + imagens +
                '}';
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
