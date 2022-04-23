package edu.it;

public class EstructuraForeach {
	public void run() {
		// Lo primero es tener un array
		// Un array es una coleccion de datos del mismo tipo
		
		Integer[] arrEnteros = {2,4,6,8};
		
		for (int x=0; x < arrEnteros.length; x++) {
			System.out.println(arrEnteros[x]);
		}
		
		System.out.println("Hacemos lo mismo con un foreach");
		
		for (Integer z : arrEnteros) {
			System.out.println(z);
		}
	}
}
