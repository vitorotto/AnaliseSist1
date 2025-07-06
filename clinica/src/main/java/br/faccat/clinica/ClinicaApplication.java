package br.faccat.clinica;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.faccat.clinica.service.ConsultaService;

@SpringBootApplication
public class ClinicaApplication {

	public static void main(String[] args) {
		ConsultaService service = new ConsultaService();
        service.agendarConsulta("João", "00100200304", "2025-06-30T09:00");
        service.agendarConsulta("Maria", "00100200304", "2025-07-01T14:00");
        service.listarConsultas();
	}

}
