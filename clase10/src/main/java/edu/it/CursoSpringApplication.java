package edu.it;

import com.google.gson.Gson;

import edu.it.generacionQR.EjemploQR;
import edu.it.manejoarchivos.LeerYModificar;

public class CursoSpringApplication {
	public static void main(String[] args) {
		System.out.println("Bienvenidos al curso de JAVA - clase 10");
		
		edu.it.qrextendido.VuelcaArchivoQR.run();
		
		// LeerYModificar.run();
	}
}
