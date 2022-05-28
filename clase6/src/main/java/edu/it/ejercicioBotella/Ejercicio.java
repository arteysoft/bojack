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
		
		Botella b = null;
		
		try {
			b = new Botella(850);
			b.servir();
			b.servir();
			b.servir();
			b.servir();
		}
		catch (FinDeLiquidoException ex) {
			/*
			System.out.println(ex.getMessage());
			System.out.println("No hay mas liquido, la cantidad restante es: " + ex.cantidadRestante + " ml");
			System.out.println("No hay mas liquido, la cantidad restante es: " + b.cantidadDisponible() + " ml");
			}
			*/
			for (StackTraceElement ste : ex.getStackTrace()) {
				System.out.println(ste.getClassName());
				System.out.println(ste.getLineNumber());
				System.out.println(ste.getMethodName());
				System.out.println("-------------------------------");
			}
		}
	}
}
