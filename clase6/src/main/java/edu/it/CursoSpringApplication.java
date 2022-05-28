package edu.it;

import edu.it.ejercicioBotella.Ejercicio;

class A {
	public A(Integer x) {
		System.out.println("Instanciando a con " + x);
	}
}

class B extends A {
	public B(Integer x) {
		super(x + x);
		System.out.println("Instanciando b con " + x);	
	}
}

public class CursoSpringApplication {
	public static void main(String[] args) {
		System.out.println("Bienvenidos al curso de JAVA - clase 5");
		new Ejercicio().run();
		
		// new B(5);
		
	}
}
