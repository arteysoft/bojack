package edu.it.polimorfismo;

import java.util.Random;

public class EjemplosPolimorfismo {
	private ObjetoVolador crearObjetoVolador() {
		// Que pasa si quiero hacer que una instancia sea aletoria.
		// Que fuera cual fuera el algorimo no varia
		int numeroAleatorio = new Random().nextInt(3);
		switch (numeroAleatorio) {
		case 0:
			System.out.println("Salio sorteado Avion");
			return new Avion();
		case 1:
			System.out.println("Salio sorteado Helicoptero");
			return new Helicoptero();
		case 2:
			System.out.println("Salio sorteado Piedrazo");
			return new Piedrazo();
		default:
			System.out.println("Guarda que no deberia llegar nunca a este punto...");
			return null;
		}
	}
	public void run() {
		// El tipo de dato, es objeto volador ahora bien
		// la instancia es o bien Avion, Helicoptero o Piedrazo
	
		ObjetoVolador punteroObjeto = crearObjetoVolador();
		
		punteroObjeto.despegar();
		punteroObjeto.viajar();
		punteroObjeto.aterrizar();
	}
}
