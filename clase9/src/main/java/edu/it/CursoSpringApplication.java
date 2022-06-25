package edu.it;

import edu.it.basededatos.ConnectionCreatorMySQL;
import edu.it.transac.EjercicioTransacciones;

public class CursoSpringApplication {
	public static void main(String[] args) {
		System.out.println("Bienvenidos al curso de JAVA - clase 9");
		
		new EjercicioTransacciones().run(new ConnectionCreatorMySQL());
	}
}
