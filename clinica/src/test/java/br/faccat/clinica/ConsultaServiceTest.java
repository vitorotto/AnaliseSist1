package br.faccat.clinica;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.faccat.clinica.model.Consulta;
import br.faccat.clinica.service.ConsultaService;

public class ConsultaServiceTest {

    private ConsultaService service;

    @BeforeEach
    public void setup() {
        service = new ConsultaService();
    }

    @Test
    void deveAgendarConsulta() {
        service.agendarConsulta("Ana", "00100200304", "2025-06-25T10:00");
        List<Consulta> consultas = service.getConsultas();
        assertEquals(1, consultas.size());
        assertEquals("Ana", consultas.get(0).getPaciente());
    }

    @Test
    void listaDeveComecarVazia() {
        assertTrue(service.getConsultas().isEmpty());
    }
}

