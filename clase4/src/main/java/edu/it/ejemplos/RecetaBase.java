package edu.it.ejemplos;

public abstract class RecetaBase {
	public final void mostrarPreparacion() {
	      paso1();
	      paso2();
	      paso3();
	   }
	// no sobreescribir el metodo mostrarPreparacion, sino mas bien los metodos abstractos
	protected void paso1() {
		System.out.println("Esto serviria solo para una accion medio abstracta OK");
		System.out.println("Ejemplo de esto seria .... NO HAY PASO 1");
	}
	protected abstract void paso2();
	protected abstract void paso3();
}
