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
		
		var gano = JuegoPPT.jugar(
				new JugadorMaquina(), 
				new JugadorPersona()
		);
		
		System.out.println();
		System.out.println("Gano el jugador: " + gano);
		// Hacer un hashMap<Integer, String> donde 
		// 0 Hubo Empate
		// 1 Gano Maquina
		// 2 Gano Persona
		// Luego, la composicion va a quedar, HashMap.get(resultado)
	}
}
