package org.example;

import java.util.Arrays;

public class Disciplina {
    private String sigla;
    private DiaDaSemana[] aulas;

    public Disciplina(String siglas, DiaDaSemana[] aulas){
        this.sigla = siglas;
        this.aulas = aulas;
    }


    @Override
    public String toString() {
        return "Disciplina{" +
                "sigla='" + sigla + '\'' +
                ", aulas=" + Arrays.toString(aulas) +
                '}';
    }
}
