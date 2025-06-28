package br.faccat.model;


import java.time.LocalDateTime;

public class Agendamento {
    public LocalDateTime dataAgendamento;
    public String codCNJ;

    public Agendamento(LocalDateTime dataAgendamento, String codCNJ) {
        this.dataAgendamento = dataAgendamento;
        this.codCNJ = codCNJ;
    }

    public LocalDateTime getDataAgendamento() {
        return dataAgendamento;
    }

    public String getCodCNJ() {
        return codCNJ;
    }

    public void reagendar() {
    }

    public void confirmar() {
    }

    public void cancelar() {
    }
}


