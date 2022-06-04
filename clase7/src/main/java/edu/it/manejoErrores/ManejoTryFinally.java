package edu.it.manejoErrores;

public class ManejoTryFinally {
	private static void arrojaError(Boolean b) {
		if (b)
			throw new RuntimeException();
	}
	private static void pasoIntermedio() {
		try {
			System.out.println("Intentar llamar a arrojaError");
			arrojaError(true);
			System.out.println("NO TIRO ERROR");
		}		
		finally {
			System.out.println("Cerramos las conexiones");
		}
	}
	public static void run() {
		try {
			pasoIntermedio();
		}
		catch (Exception ex) {
			System.out.println("Sale x Exception");
		}
	}
}
