package edu.it;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.ejemplos.DondeJavaUtilizaLaHerencia;

@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String[] args) {
		System.out.println("Bienvenidos al curso de JAVA - clase 4");
		new DondeJavaUtilizaLaHerencia().init();
	}
}
