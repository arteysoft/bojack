package edu.it;

public class ElProblemaDelScope {
	public String nombre = "Octavio";
	
	public void run() {
		/*
		 * El scope es el ambito de programacion que tiene
		 * una variable.
		 * Se especifica entre {}
		 */
		
		
		// Abro y cierro un scope
		for (;;) 
		{
			nombre = "vale esta instancia";
			System.out.println(nombre);
		}
		
	}
}
