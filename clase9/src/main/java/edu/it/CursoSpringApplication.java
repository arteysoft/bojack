package edu.it;

import edu.it.basededatos.ConnectionCreatorMySQL;
import edu.it.basededatos.PruebaBaseDeDatos;

public class CursoSpringApplication {
	public static void main(String[] args) {
		System.out.println("Bienvenidos al curso de JAVA - clase 9");
		
		new PruebaBaseDeDatos().run(new ConnectionCreatorMySQL());
	}
}
