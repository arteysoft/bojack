package edu.it;

import edu.it.basededatos.ConnectionCreatorMySQL;
import edu.it.manejoarchivos.CrearArchivos;

public class CursoSpringApplication {
	public static void main(String[] args) {
		System.out.println("Bienvenidos al curso de JAVA - clase 9");
		
		new CrearArchivos().run();
	}
}
