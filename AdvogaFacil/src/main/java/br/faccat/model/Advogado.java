package br.faccat.model;

import java.time.LocalDateTime;

public class Advogado {
    public String registroOAB;
    public String especialidade;

    public Advogado(String registroOAB, String especialidade) {
        this.registroOAB = registroOAB;
        this.especialidade = especialidade;
    }

    public String getRegistroOAB() {
        return registroOAB;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}