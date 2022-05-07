package edu.it.juego;

public class JuegoPPT {
	public static Integer jugar(Jugador j1, Jugador j2) {
		var strj1 = j1.jugar();
		var strj2 = j2.jugar();
		
		System.out.println("El jugador 1, selecciono " + strj1);
		System.out.println("El jugador 2, selecciono " + strj2);
		
		System.out.println("Quedaria la parte del ejercicio donde da al ganador... ");
		
		return 0;
	}
}
