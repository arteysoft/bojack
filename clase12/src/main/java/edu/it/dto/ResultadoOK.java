package edu.it.components.model;

public class ResultadoOK {
	public final String status;
	public final Object resultado;
	
	public ResultadoOK(Object resultado) {
		this.status = "OK";
		this.resultado = resultado;
	}
}
