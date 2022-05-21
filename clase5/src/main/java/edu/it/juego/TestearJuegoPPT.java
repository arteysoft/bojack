package edu.it.juego;

public class TestearJuegoPPT {
	
	public void run() {
		/*
		 * Que se agrego en java 8
		 * Se quita todo lo menos significativo, el codigo declarativo
		 * y tengo la posibilidad de escribir menos codigo.
		 */
		
		Jugador stubPapel = () -> ElementosJuego.PAPEL;
		Jugador stubPiedra = () -> ElementosJuego.PIEDRA;
		Jugador stubTijera = () -> ElementosJuego.TIJERA;
		
		/*
		 * Como funciona un test ?
		 * Yo le voy a poner un caso de uso, y voy a validar
		 * lo que yo espero que sea la respuesta
		 * ejemplo "Papel" "Piedra" -> Ganador 1
		 */
		int valorReferencia = JuegoPPT.jugar(stubTijera, stubPiedra);
		
		if (valorReferencia == 2) {
			System.out.println("Es correcto el funcionamiento de stubTijera contra stubPiedra");
		}
		else {
			System.out.println("Es INcorrecto el funcionamiento de stubPiedra contra stubPiedra");
		}	
	}
}
