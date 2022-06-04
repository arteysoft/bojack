package edu.it.dto;

import java.util.Objects;

import edu.it.juego.ElementosJuego;

public class PlanteoJugada {
	public final ElementosJuego jugador1;
	public final ElementosJuego jugador2;
	
	public PlanteoJugada(ElementosJuego jugador1, ElementosJuego jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(jugador1, jugador2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlanteoJugada other = (PlanteoJugada) obj;
		return jugador1 == other.jugador1 && jugador2 == other.jugador2;
	}	
}
