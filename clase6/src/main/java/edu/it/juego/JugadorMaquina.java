package edu.it.juego;

import java.util.Random;

public class JugadorMaquina implements Jugador {
	public ElementosJuego jugar() {
		int elemento = new Random().nextInt(3);
		
		switch (elemento) {
		case 0:
			return ElementosJuego.PIEDRA;
		case 1:
			return ElementosJuego.PAPEL;
		case 2:
			return ElementosJuego.TIJERA;
		default:
			System.out.println("Atencion, esto es un error !!!");
			return null;
		}	
	}
}
