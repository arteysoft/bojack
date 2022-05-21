package edu.it.manejoErrores;

public class EjercicioPila {
	public void run() {
		System.out.println("Ejercicio de manejo de pila o stack");
		/*
		 * Cada vez que invocamos un metodo, se guardan
		 * todas las variables del metodo y la direccion de retorno
		 * en una pila o stack
		 */
		
		Pila p = new Pila();
		p.m1();
		
		/*
		 * Ejercicio, pasar a cada uno de los mx un integer
		 * y a cada uno de los m, lo voy a llamar con mx(i + 1)
		 * 
		 * Si a m1 le envio un 10 a m6 va a llegar un 15
		 */	
	}
}
