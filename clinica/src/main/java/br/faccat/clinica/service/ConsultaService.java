package br.faccat.clinica.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.faccat.clinica.model.Consulta;

public class ConsultaService {
    private final List<Consulta> consultas = new ArrayList<>();

    public void agendarConsulta(String paciente, String cpf, String dataHoraTexto) {
        System.out.println("Agendando consulta para " + paciente + " CPF: " + cpf + " em " + dataHoraTexto);
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraTexto);
        Consulta c = new Consulta(paciente, cpf, dataHora);
        consultas.add(c);
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void listarConsultas() {
        System.out.println("\nLista de Consultas agendadas:");
        for (Consulta c : consultas) {
            System.out.println("- " + c.getPaciente() + " - CPF: " + c.getCpf() +  " em " + c.getDataHora());
        }
    }
}

