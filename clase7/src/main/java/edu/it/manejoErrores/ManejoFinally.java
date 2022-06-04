package edu.it.manejoErrores;

public class ManejoFinally {
	private static void arrojaError(Boolean b) {
		if (b)
			throw new RuntimeException();
	}
	public static void run() {
		try {
			System.out.println("Voy a invocar a arrojaError");
			arrojaError(false);
			System.out.println("Arroja error NO tiro error");
		}
		catch (Exception ex) {
			System.out.println("Sale x Exception");
		}
		finally {
			System.out.println("Ejecuta el bloque finally");
			// Normalmente esto sirve para cerrar
			// Archivos
			// Conexiones a base de datos
		}
	}
}
