package edu.it.ejemplos;

public class EjemploConstructor  {
	/*
	 * El constructor es un metodo especial, que NO tiene
	 * tipo de dato de retorno, ya que es invocado al construir
	 * el objeto
	 * Sin importar si este objeto es referenciado por una variable
	 * o Ninguna
	 * La regla es que tiene que llamarse de la misma forma
	 * que la clase, opcionalmente puede tener sobrecarga
	 */
	public EjemploConstructor() {
		System.out.println("Estoy en el constructor");
	}
	public EjemploConstructor(String leyenda) {
		System.out.println(leyenda);
	} 
}
