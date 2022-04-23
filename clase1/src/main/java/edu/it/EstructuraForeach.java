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
		
		String[] arrNombres = new String[] { "Brian", "Juan", "Lorena", "Nicolas"};
		
		for (String z : arrNombres) {
			System.out.println(z);
		}		
		
		String[] arrNombres2 = new String[4];
		
		for (String z : arrNombres2) {
			System.out.println(z);
		}
		
		arrNombres2[0] = "Brian";
		arrNombres2[1] = "Juan";
		arrNombres2[2] = "Lorena";
		arrNombres2[3] = "Nicolas";
		
		for (String z : arrNombres2) {
			System.out.println(z);
		}
		
	}
}
