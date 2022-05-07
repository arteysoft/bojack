package edu.it.juego;

public class Init {
	public void run() {
		System.out.println("Juego de Piedra Papel o Tijera");
		
		/*
		 *  Vamos a realizar dos pasos.
		 *  1) Intercambiar elementos de varias formas
		 *  2) Enviar como parametro de la consola que tipo de jugadores
		 *  voy a usar. Esto es para enteder aun mas la abstraccion. 
		 * 
		 */
		
		JuegoPPT.jugar(
				new JugadorMaquina(), 
				new JugadorPersona()
		);
	}
}
