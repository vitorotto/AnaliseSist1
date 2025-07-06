package br.faccat.clinica.model;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private final String nome;
    private final String cpf;
    private List<Consulta> consultas = new ArrayList<>();

    public Paciente(String nome, String cpf, List<Consulta> consultas) {
        this.nome = nome;
        this.cpf = cpf;
        this.consultas = consultas;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

}
