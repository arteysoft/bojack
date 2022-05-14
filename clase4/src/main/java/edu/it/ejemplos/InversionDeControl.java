package edu.it.ejemplos;

public class InversionDeControl {
	public void test(String s) {
		try {
			RecetaBase rb = (RecetaBase)Class.forName(s)
			.getConstructor()
			.newInstance();
			
			rb.mostrarPreparacion();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
