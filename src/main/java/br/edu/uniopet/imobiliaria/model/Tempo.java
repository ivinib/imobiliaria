package br.edu.uniopet.imobiliaria.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tempo")
public class Tempo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tempo")
    private Integer idTempo;

    @Column(name = "ano")
    private String ano;

    @Column(name = "semana")
    private String semana;

    @Column(name = "feriado")
    private String feriado;

    @Column(name = "semana_mes")
    private String semanaMes;

    @OneToMany(mappedBy = "localizacao")
    private List<VendaImovel> vendaImovelList = new ArrayList<>();

    public Tempo() {
    }

    public Tempo(String ano, String semana, String feriado, String semanaMes, List<VendaImovel> vendaImovelList) {
        this.ano = ano;
        this.semana = semana;
        this.feriado = feriado;
        this.semanaMes = semanaMes;
        this.vendaImovelList = vendaImovelList;
    }

    public Integer getIdTempo() {
        return idTempo;
    }

    public void setIdTempo(Integer idTempo) {
        this.idTempo = idTempo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }

    public String getFeriado() {
        return feriado;
    }

    public void setFeriado(String feriado) {
        this.feriado = feriado;
    }

    public String getSemanaMes() {
        return semanaMes;
    }

    public void setSemanaMes(String semanaMes) {
        this.semanaMes = semanaMes;
    }

    public List<VendaImovel> getVendaImovelList() {
        return vendaImovelList;
    }

    public void setVendaImovelList(List<VendaImovel> vendaImovelList) {
        this.vendaImovelList = vendaImovelList;
    }

    @Override
    public String toString() {
        return "Tempo{" +
                "idTempo=" + idTempo +
                ", ano='" + ano + '\'' +
                ", semana='" + semana + '\'' +
                ", feriado='" + feriado + '\'' +
                ", semanaMes='" + semanaMes + '\'' +
                ", vendaImovelList=" + vendaImovelList +
                '}';
    }
}
