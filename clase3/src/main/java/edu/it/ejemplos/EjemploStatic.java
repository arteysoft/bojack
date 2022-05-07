package edu.it.ejemplos;

/*
 * Para todas las instancias de la clase Ejemplo Static
 * La variable saludo es una sola.
 * Podria darse que tengo 10 instancias pero todas apuntan
 * a la misma variable.
 * Para tener en cuenta. las static van en el area de variables
 * globales.
 */

public class EjemploStatic {
	public static String saludo;
	
	public EjemploStatic(String s) {
		saludo = s;
	}
	public void saludar() {
		System.out.println(saludo);
	}
	public static void metodoEstatico() {
		System.out.println("Para llamar a este metodo, solo tengo que anteponerle la clase");
	}
}
