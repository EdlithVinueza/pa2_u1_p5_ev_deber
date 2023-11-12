package com.uce.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Pa2U1P5EvDeberApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5EvDeberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Deber de Programación Avanzada 2");
		System.out.println("Tema: Uso de GitHub");
		System.out.println("Nombre: Edlith Vinueza");
		System.out.println("Cambio para la nueva rama");
		
	}

}