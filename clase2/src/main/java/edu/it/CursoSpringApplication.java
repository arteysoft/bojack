package edu.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String[] args) {
		System.out.println("Bienvenidos al curso de JAVA - clase 2");
		// Collatz.run();
		//var operacionSuma = new OperacionesSuma();
		//operacionSuma.verEjemplo();
		
		/*
		var total = new SumarArray().sumar(new Integer[] {2, 3, 5, 10});
		total = new SumarArray().sumar(2, 3, 10);
		System.out.println(total);
		*/
		
		var refObjeto1 = new ElProblemaDelScope();
		refObjeto1.nombre = "Silvana";
				
		var refObjeto2 = new ElProblemaDelScope();
		refObjeto2.nombre = "Braian";
		
		// refObjeto1 = refObjeto2;
		
		System.out.println(refObjeto1.nombre);
		System.out.println(refObjeto2.nombre);
	}
}
