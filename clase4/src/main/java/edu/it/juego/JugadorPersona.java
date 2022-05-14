package edu.it.juego;

import java.util.Scanner;

public class JugadorPersona implements Jugador {
	public String jugar() {
		System.out.println("Por favor, ingrese un elemento");
		System.out.println("1.- Piedra");
		System.out.println("2.- Papel");
		System.out.println("3.- Tijera");
		
		Scanner scn = new Scanner(System.in);
		int elemento = scn.nextInt();
		scn.close();
		
		switch (elemento) {
		case 1:
			return "Piedra";
		case 2:
			return "Papel";
		case 3:
			return "Tijera";
		default:
			System.out.println("Atencion, esto es un error !!!");
			return null;
		}
	}
}
