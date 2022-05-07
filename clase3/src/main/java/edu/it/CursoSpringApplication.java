package edu.it;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.juego.Init;

@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String[] args) {
		System.out.println("Bienvenidos al curso de JAVA - clase 3");
		/*
		var z1 = new EjemploStatic("Que hay");
		var z2 = new EjemploStatic("Hola que onda");
		var z3 = new EjemploStatic("Ultimo saludo chau");
		
		z1.saludar();
		z2.saludar();
		z3.saludar();
		
		EjemploStatic.metodoEstatico();
		*/
		
		new Init().run();
	}
}
