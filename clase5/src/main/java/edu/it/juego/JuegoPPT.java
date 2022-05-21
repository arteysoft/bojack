package edu.it.juego;

public class JuegoPPT {
	public static Integer jugar(Jugador j1, Jugador j2) {
		var strj1 = j1.jugar();
		var strj2 = j2.jugar();
		
		System.out.println("El jugador 1, selecciono " + strj1);
		System.out.println("El jugador 2, selecciono " + strj2);
		
		if (strj1.equals(ElementosJuego.PIEDRA) && strj2.equals(ElementosJuego.TIJERA)) {
			return 1;
		}
		if (strj1.equals(ElementosJuego.PIEDRA) && strj2.equals(ElementosJuego.PAPEL)) {
			return 2;
		}
		if (strj1.equals(ElementosJuego.PAPEL) && strj2.equals(ElementosJuego.PIEDRA)) {
			return 1;
		}
		if (strj1.equals(ElementosJuego.PAPEL) && strj2.equals(ElementosJuego.TIJERA)) {
			return 2;
		}
		if (strj1.equals(ElementosJuego.TIJERA) && strj2.equals(ElementosJuego.PIEDRA)) {
			return 2;
		}
		if (strj1.equals(ElementosJuego.TIJERA) && strj2.equals(ElementosJuego.PAPEL)) {
			return 1;
		}
		
		return 0;
	}
}
