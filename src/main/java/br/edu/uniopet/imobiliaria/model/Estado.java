package br.edu.uniopet.imobiliaria.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "uf")
    private String uf;

    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidadeList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;

    public Estado() {
    }

    public Estado(String uf, List<Cidade> cidadeList, Pais pais) {
        this.uf = uf;
        this.cidadeList = cidadeList;
        this.pais = pais;
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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "idEstado=" + idEstado +
                ", uf='" + uf + '\'' +
                ", cidadeList=" + cidadeList +
                ", pais=" + pais +
                '}';
    }
}
