package br.edu.uniopet.imobiliaria.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais")
    private Integer idPais;

    @Column(name = "nome_pais")
    private String nomePais;

    @OneToMany(mappedBy = "pais")
    List<Estado> estadoList = new ArrayList<>();

    public Pais() {
    }

    public Pais(String nomePais, List<Estado> estadoList) {
        this.nomePais = nomePais;
        this.estadoList = estadoList;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public List<Estado> getEstadoList() {
        return estadoList;
    }

    public void setEstadoList(List<Estado> estadoList) {
        this.estadoList = estadoList;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "idPais=" + idPais +
                ", nomePais='" + nomePais + '\'' +
                ", estadoList=" + estadoList +
                '}';
    }
}
