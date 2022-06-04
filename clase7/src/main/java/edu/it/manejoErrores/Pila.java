package edu.it.manejoErrores;

public class Pila {
	public void m6(Integer i) throws Exception {
		System.out.print(new Throwable().getStackTrace()[0].getLineNumber() + " ");
		System.out.println("Llegue a m6; El valor de i es: " + i);
		if (i == 20) {
			Exception ex = new Exception("i no puede ser 20, en virtud de nuestra logica...");
			throw ex;
		}
		System.out.print(new Throwable().getStackTrace()[0].getLineNumber() + " ");
	}
	public void m5(Integer i) throws Exception {
		System.out.print(new Throwable().getStackTrace()[0].getLineNumber() + " ");
		System.out.println("Antes de llamar a m6");
		m6(i + 1);
		System.out.print(new Throwable().getStackTrace()[0].getLineNumber() + " ");
		System.out.println("Despues de llamar a m6");
	}
	public void m4(Integer i) throws Exception {
		System.out.print(new Throwable().getStackTrace()[0].getLineNumber() + " ");
		System.out.println("Antes de llamar a m5");
		m5(i + 1);
		System.out.print(new Throwable().getStackTrace()[0].getLineNumber() + " ");
		System.out.println("Despues de llamar a m5");
	}
	public void m3(Integer i) throws Exception {
		System.out.print(new Throwable().getStackTrace()[0].getLineNumber() + " ");
		System.out.println("Antes de llamar a m4");
		m4(i + 1);
		System.out.print(new Throwable().getStackTrace()[0].getLineNumber() + " ");
		System.out.println("Despues de llamar a m4");
	}
	public void m2(Integer i) throws Exception {
		System.out.print(new Throwable().getStackTrace()[0].getLineNumber() + " ");
		System.out.println("Antes de llamar a m3");
		m3(i + 1);
		System.out.print(new Throwable().getStackTrace()[0].getLineNumber() + " ");
		System.out.println("Despues de llamar a m3");
	}
	public void m1(Integer i) throws Exception {
		System.out.print(new Throwable().getStackTrace()[0].getLineNumber() + " ");
		System.out.println("Antes de llamar a m2");
		m2(i + 1);
		System.out.print(new Throwable().getStackTrace()[0].getLineNumber() + " ");
		System.out.println("Despues de llamar a m2");
	}
}
