package br.edu.uniopet.imobiliaria.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cidade")
public class Cidade {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cidade")
    private Integer idCidade;

    @Column(name = "cidade")
    private String cidade;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    @OneToMany(mappedBy = "cidade")
    private List<Localizacao> localizacaoList = new ArrayList<>();

    public Cidade() {
    }

    public Cidade(Integer id, String cidade, Estado estado, List<Localizacao> localizacaoList) {
        this.idCidade = id;
        this.cidade = cidade;
        this.estado = estado;
        this.localizacaoList = localizacaoList;
    }

    public Integer getId() {
        return idCidade;
    }

    public void setId(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public List<Localizacao> getLocalizacaoList() {
        return localizacaoList;
    }

    public void setLocalizacaoList(List<Localizacao> localizacaoList) {
        this.localizacaoList = localizacaoList;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "idCidade=" + idCidade +
                ", cidade='" + cidade + '\'' +
                ", estado=" + estado +
                ", localizacaoList=" + localizacaoList +
                '}';
    }
}
