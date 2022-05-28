package edu.it.manejoErrores;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

class Alumno {
	public String nombre;
	public String apellido;
}

public class EjemploJSON {
	public void run() {
		String unJson = new Scanner(System.in).nextLine();
		
		try {
			var alumno = new Gson().fromJson(unJson, Alumno.class);
			System.out.println(alumno.nombre);
			System.out.println(alumno.apellido);
			Integer zero = 0;
			Integer mal = 10 / zero;
		}
		catch (JsonSyntaxException ex) {
			System.out.println("Salio x JsonSyntaxException");
		}
		catch (java.lang.ArithmeticException ex) {
			System.out.println("Salio x la division por zero");
		}
		catch (Exception ex) {
			System.out.println("Salio x exception");
			ex.printStackTrace();
		}
	}
}
