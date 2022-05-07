package edu.it.polimorfismo;

/*
 * Ejercicio:
 * A objeto volador, le vamos a agregar un metodo descripcion
 * Recordar que el metodo de una interfaz, NO tiene implementacion
 * Solo es descriptivo.
 * 
 * Que va a suceder: Como ese metodo NO esta implementado en ninguna
 * de las tres subclases de ObjetoVolador va a tirar error de compilacion
 * 
 * Como proceder ? creando para cada una de las subclases el metodo 
 * descripcion
 */

public interface ObjetoVolador {
	public void descripcion();
	public void despegar();
	public void viajar();
	public void aterrizar();
}
