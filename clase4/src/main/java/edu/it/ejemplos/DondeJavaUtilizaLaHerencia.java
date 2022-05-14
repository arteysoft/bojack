package edu.it.ejemplos;

import java.util.Objects;

import com.google.gson.Gson;

class EstructuraDeDatos /*extends Object*/ {
	public EstructuraDeDatos(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String nombre;
	public String apellido;
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
		EstructuraDeDatos other = (EstructuraDeDatos) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}

public class DondeJavaUtilizaLaHerencia {
	public void init() {
		Object o1 = new EstructuraDeDatos("Jaime", "Rodriguez");
		Object o2 = new EstructuraDeDatos("Jaime", "Rodriguez");
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());	
		
		if (o1.equals(o2)) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son Diferentes");
		}

		System.out.println(o1.toString());
		System.out.println(o1);
	}
}
