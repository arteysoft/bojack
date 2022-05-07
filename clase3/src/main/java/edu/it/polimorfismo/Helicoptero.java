package edu.it.polimorfismo;

// Helicoptero es un objeto volador

public class Helicoptero implements ObjetoVolador {
	public void despegar() {
		System.out.println("Despegando helicoptero");
	}
	public void viajar() {
		System.out.println("yendo a balcarce");	
	}
	public void aterrizar() {
		System.out.println("Aterrizano en casa");
	}
}
