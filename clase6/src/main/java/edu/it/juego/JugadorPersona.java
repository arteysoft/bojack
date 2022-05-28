package edu.it.juego;

import java.util.Scanner;

public class JugadorPersona implements Jugador {
	public ElementosJuego jugar() {
		System.out.println("Por favor, ingrese un elemento");
		System.out.println("1.- Piedra");
		System.out.println("2.- Papel");
		System.out.println("3.- Tijera");
		
		Scanner scn = new Scanner(System.in);
		int elemento = scn.nextInt();
		scn.close();
		
		switch (elemento) {
		case 1:
			return ElementosJuego.PIEDRA;
		case 2:
			return ElementosJuego.PAPEL;
		case 3:
			return ElementosJuego.TIJERA;
		default:
			System.out.println("Atencion, esto es un error !!!");
			return null;
		}
	}
}
