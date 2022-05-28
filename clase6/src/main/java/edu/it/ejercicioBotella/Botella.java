package edu.it.ejercicioBotella;

public class Botella {
	// Esta especificado en ml
	private Integer restante;
	private final static Integer CANT_SERVIR = 250;
	
	public Botella(Integer restante) {
		this.restante = restante;
	}
	
	public void servir() {
		if (restante < CANT_SERVIR) {
			throw new FinDeLiquidoException(restante);
		}
		restante -= CANT_SERVIR;
	}
	public Integer cantidadDisponible() {
		return restante;
	}
}
