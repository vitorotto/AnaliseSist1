package br.faccat.clinica.model;

import java.time.LocalDateTime;

public class Consulta {
    private final String paciente;
    private final String cpf;
    private final LocalDateTime dataHora;

    public Consulta(String paciente, String cpf, LocalDateTime dataHora) {
        this.paciente = paciente;
        this.cpf = cpf;
        this.dataHora = dataHora;
    }

    public String getPaciente() {
        return paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getCpf() {
        return cpf;
    }
}

