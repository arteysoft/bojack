package edu.it;

public class TiposDeDatos {
	public void run() {
		System.out.println("Estoy en el metodo run");
		
		{
			char ch = 'A'; // Ocupa un byte
			byte bt = 2; // Ocupa un byte
			short sh = 222; // Ocupa 2 bytes
			int entero = 23; // 4 Bytes
			boolean bool = true; // Ocupa un byte
			float f = 2.3f;
			double d = 32.3;
		}
		// Wrappers
		{
			Character ch = 'A';
			Byte bt = 2;
			Short sh = 222;
			Integer entero = 23;
			Boolean bool = true;
			Float f = 2.3f;
			Double d = 21.3;
		}
		/*
		 * Lo que tenemos que saber aca es que los tipos primitivos van 
		 * en un lugar de la memoria, y los tipo Object van en otra
		 * Por otra parte, los tipo Object extienden o heredan caracteristicas
		 * de una clase llamada Object
		 * 
		 */
		
		
	}
}
