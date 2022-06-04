package edu.it.dto;

import java.util.Objects;

public class Alumno {
	public final String nombre;
	public final String apellido;
	
	public Alumno(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(apellido, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(nombre, other.nombre);
	}



	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
}
