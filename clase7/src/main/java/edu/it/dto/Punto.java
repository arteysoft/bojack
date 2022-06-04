package edu.it.dto;

import java.util.Objects;

import com.google.gson.Gson;

public class Punto {
	public final Integer x;
	public final Integer y;
	
	public Punto(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	@Override
	public int hashCode() {
		System.out.println("Aca esta consultando al hashCode....");
		return Objects.hash(x, y);
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Aca consulta al equals ...");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Objects.equals(x, other.x) && Objects.equals(y, other.y);
	}	
}
