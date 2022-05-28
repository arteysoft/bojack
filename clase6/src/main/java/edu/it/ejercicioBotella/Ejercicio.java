package edu.it.ejercicioBotella;

public class Ejercicio {
	public void run() {
		StringBuilder strBld = new StringBuilder()
				.append("El ejercicio consta de lo siguiente: \n")
				.append("1) En una clase botella voy a tener un estado liquido \n")
				.append("   y voy a tener un metodo servir \n")
				.append("2) Cada vez que sirvo, se descuentan 250 ml \n")
				.append("3) Si hay menos de 250 ml entonces arrojar una RuntimeException \n")
				.append("   del tipo FinDeLiquidoException \n")
				.append("4) El objeto FinDeLiquidoException debe tener un metodo, obtenerCantRestante");
		
		System.out.println(strBld);
	}
}
