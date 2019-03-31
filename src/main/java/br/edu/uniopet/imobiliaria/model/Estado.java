package br.edu.uniopet.imobiliaria.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "estado")
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "uf")
    private String uf;

    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidadeList = new ArrayList<>();

    public Estado() {
    }

    public Estado(Integer idEstado, String uf, List<Cidade> cidadeList) {
        this.idEstado = idEstado;
        this.uf = uf;
        this.cidadeList = cidadeList;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Cidade> getCidadeList() {
        return cidadeList;
    }

    public void setCidadeList(List<Cidade> cidadeList) {
        this.cidadeList = cidadeList;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "idEstado=" + idEstado +
                ", uf='" + uf + '\'' +
                ", cidadeList=" + cidadeList +
                '}';
    }
}
