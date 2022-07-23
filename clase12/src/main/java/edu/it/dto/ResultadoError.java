package edu.it.components.model;

public class ResultadoError {
	public final String status;
	public final String motivoError;
	
	public ResultadoError(String motivoError) {
		this.status = "ERROR";
		this.motivoError = motivoError;
	}
}
