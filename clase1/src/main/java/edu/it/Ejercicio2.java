package edu.it;

public class Ejercicio2 {
	public void run() {
		Float[] indices = {1.027f, 1.029f, 1.035f};
		Float base = 100f;
		Float acumulado = base;
		
		for (Float indiceMensual : indices) {
			acumulado = (acumulado * indiceMensual);
		}
		System.out.println(acumulado);
	}
}
