package com.uce.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Pa2U1P5LrDeberApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5LrDeberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Programación Avanzada 2");
		System.out.println("Deber 2, uso de GitHub");
		System.out.println("Leonardo Ramirez");
		System.out.println("Cambio primer commit");
	}

}
