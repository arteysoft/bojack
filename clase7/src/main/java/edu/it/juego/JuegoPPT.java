package edu.it.juego;

import java.util.HashMap;

import edu.it.dto.PlanteoJugada;

import static edu.it.juego.ElementosJuego.PIEDRA;
import static edu.it.juego.ElementosJuego.PAPEL;
import static edu.it.juego.ElementosJuego.TIJERA;

public class JuegoPPT {
	private static HashMap<PlanteoJugada, Integer> mapaJugadas = new HashMap<>();
	
	static {
		mapaJugadas.put(new PlanteoJugada(PIEDRA, TIJERA), 1);
		mapaJugadas.put(new PlanteoJugada(PIEDRA, PAPEL), 2);
		mapaJugadas.put(new PlanteoJugada(PIEDRA, PIEDRA), 0);
		
		mapaJugadas.put(new PlanteoJugada(PAPEL, PIEDRA), 1);		
		mapaJugadas.put(new PlanteoJugada(PAPEL, TIJERA), 2);
		mapaJugadas.put(new PlanteoJugada(PAPEL, PAPEL), 0);
		
		mapaJugadas.put(new PlanteoJugada(TIJERA, PIEDRA), 2);
		mapaJugadas.put(new PlanteoJugada(TIJERA, PAPEL), 1);
		mapaJugadas.put(new PlanteoJugada(TIJERA, TIJERA), 0);
	}
	
	public static Integer jugar(Jugador j1, Jugador j2) {
		var strj1 = j1.jugar();
		var strj2 = j2.jugar();
		
		System.out.println("El jugador 1, selecciono " + strj1);
		System.out.println("El jugador 2, selecciono " + strj2);
		
		var planteo = new PlanteoJugada(strj1, strj2);
		return mapaJugadas.get(planteo);
	}
}
