package edu.it.polimorfismo;

public class Piedrazo implements ObjetoVolador {
	public void despegar() {
		System.out.println("Saliendo de mi mano");
	}
	public void viajar() {
		System.out.println("Dirijiendose al norte");
	}
	public void aterrizar() {
		System.out.println("Cae en el cesped");
	}
}
