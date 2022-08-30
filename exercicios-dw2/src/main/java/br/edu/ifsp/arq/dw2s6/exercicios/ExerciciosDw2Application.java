package br.edu.ifsp.arq.dw2s6.exercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/clientes")
public class ExerciciosDw2Application {

	public static void main(String[] args) {

		SpringApplication.run(ExerciciosDw2Application.class, args);
	}


}
