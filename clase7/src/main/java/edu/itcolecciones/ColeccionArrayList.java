package edu.itcolecciones;

import java.util.ArrayList;

import com.google.gson.Gson;

public class ColeccionArrayList {
	public static void run() {
		// Los Arrays tienen que ser tipados
		// Ej: String[] 
		// Las colecciones tambien lo son
		
		var coleccion = new ArrayList<String>();
		
		coleccion.add("Jaime");
		coleccion.add("Braian");
		coleccion.add("Silvana");
		
		for (String nombre : coleccion) {
			System.out.println(nombre);
		}
		
		// Tengo tres entradas en un arrayList
		// Quiero atraves de un while ir borrando todas las
		// entradas que yo tengo. Hasta que coleccion.size() == 0
	}
}
