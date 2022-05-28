package edu.it.ejercicioBotella;

public class FinDeLiquidoException extends RuntimeException {
	public final Integer cantidadRestante;
	
	public FinDeLiquidoException(Integer cantidadRestante) {
		super("No hay liquido sufiente disponible...");
		this.cantidadRestante = cantidadRestante;
	}
	
	@Override
	public String getMessage() {
		return "Hola que tal";
	}
}
