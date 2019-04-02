package br.edu.uniopet.imobiliaria.repository;

import br.edu.uniopet.imobiliaria.model.Tempo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempoRepository extends JpaRepository<Tempo,Integer> {

    Tempo findBySemanaAndAno(String semana, String ano);

    Tempo findBySemanaMesAndAndAno(String semanaMes, String ano);

    Tempo findBySemanaAndFeriado(String semana, String feriado);
}
