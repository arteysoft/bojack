package edu.it.juego;

import java.util.HashMap;

public class Init {
	private HashMap<Integer, String> mapaGanador = new HashMap<>();
	
	public Init() {
		mapaGanador.put(0, "Es empate");
		mapaGanador.put(1, "Gana jugador Maquina");
		mapaGanador.put(2, "Gana jugador Humano");
	}
	
	public void run() {
		System.out.println("Juego de Piedra Papel o Tijera");
		
		/*
		 *  Vamos a realizar dos pasos.
		 *  1) Intercambiar elementos de varias formas
		 *  2) Enviar como parametro de la consola que tipo de jugadores
		 *  voy a usar. Esto es para enteder aun mas la abstraccion. 
		 * 
		 */
		
		var gano = JuegoPPT.jugar(
				new JugadorMaquina(), 
				new JugadorPersona()
		);
		
		System.out.println();
		System.out.println(mapaGanador.get(gano));
	}
}
