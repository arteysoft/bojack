package edu.it;

public class OperacionesSuma {
	public void verEjemplo() {
		// Sumar 2, 3, 5 utilizando sumar
		// resultado = (2 + (3 + 5))
		var total = sumar(2, sumar(3, 5)); // innerMost o masAdentrado
		System.out.println("Total = " + total);
	}
	private Integer sumar(Integer x, Integer y) {
		return x + y;
	}
}
