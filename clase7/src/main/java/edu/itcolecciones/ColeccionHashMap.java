package edu.itcolecciones;

import java.util.HashMap;

import com.google.gson.Gson;

import edu.it.dto.Alumno;

public class ColeccionHashMap {
	public static void run() {
		var mapa = new HashMap<Integer, Alumno>();
		
		var al1 = new Alumno("Braian", "David");
		var al2 = new Alumno("Jaime", "Andres");
		
		mapa.put(1000, al1);
		mapa.put(2000, al2);
		
		for (Integer i : mapa.keySet()) {
			System.out.println("Key es: " + i);
			System.out.println("El value para le key es " + mapa.get(i));
		}
		
		System.out.println(new Gson().toJson(mapa));
	}
}
