package edu.it.basededatos;

import java.util.UUID;

import com.github.javafaker.Faker;

public class UtilesAlumno {
	private static Faker fkr;
	
	static {
		fkr = new Faker();
	}
	
	public static Alumno generarAlumnoRandom() {	
		return new Alumno(
				UUID.randomUUID().toString(),
	            fkr.address().firstName(),
	            fkr.address().lastName(),
	            fkr.address().streetName(),
	            fkr.address().streetAddressNumber(),
	            fkr.address().state(),
	            fkr.address().country()
	        );
	}
}
