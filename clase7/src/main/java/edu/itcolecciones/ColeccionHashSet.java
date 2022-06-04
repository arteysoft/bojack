package edu.itcolecciones;

import java.util.HashSet;

import edu.it.dto.Alumno;
import edu.it.dto.Punto;

public class ColeccionHashSet {
	public static void run() {
		var miSet = new HashSet<Punto>();
		
		var unPunto = new Punto(3, 4);
		var otroPunto = new Punto(unPunto.x + 1, unPunto.y);

		System.out.println("Voy a agregar el punto 3,4");
		miSet.add(unPunto);
		System.out.println("Voy a agregar el punto 4,4");
		miSet.add(otroPunto);
		System.out.println("Voy a agregar el punto 3,4 en un objeto diferente");
		miSet.add(new Punto(3, 4));
		
		for (Punto p : miSet) {
			System.out.println(p);
		}
		
		var otroSet = new HashSet<Alumno>();
		
		otroSet.add(new Alumno("Braian", "David"));
		otroSet.add(new Alumno("Jaime", "Andres"));
		otroSet.add(new Alumno("Silvana", "Sanchez"));
		otroSet.add(new Alumno("Silvana", "Sanchez"));
		
		for (Alumno a : otroSet) {
			System.out.println(a);
		}
	}
}
