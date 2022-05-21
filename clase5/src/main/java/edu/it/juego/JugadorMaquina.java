package edu.it.juego;

import java.util.Random;

public class JugadorMaquina implements Jugador {
	public String jugar() {
		int elemento = new Random().nextInt(3);
		
		switch (elemento) {
		case 0:
			return "Piedra";
		case 1:
			return "Papel";
		case 2:
			return "Tijera";
		default:
			System.out.println("Atencion, esto es un error !!!");
			return null;
		}	
	}
}
