package edu.it.juego;

class StubPapel implements Jugador {
	public String jugar() {
		return "Papel";
	}
}

class StubPiedra implements Jugador {
	public String jugar() {
		return "Piedra";
	}
}

class StubTijera implements Jugador {
	public String jugar() {
		return "Tijera";
	}
}

public class TestearJuegoPPT {
	public void run() {
		/*
		 * Como funciona un test ?
		 * Yo le voy a poner un caso de uso, y voy a validar
		 * lo que yo espero que sea la respuesta
		 * ejemplo "Papel" "Piedra" -> Ganador 1
		 */
		int valorReferencia = JuegoPPT.jugar(new StubPiedra(), new StubTijera());
		
		if (valorReferencia == 1) {
			System.out.println("Es correcto el funcionamiento de Piedra contra tijera");
		}
		else {
			System.out.println("Es INcorrecto el funcionamiento de Piedra contra tijera");
		}
	}
}
