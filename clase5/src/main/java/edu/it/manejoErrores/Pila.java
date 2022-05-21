package edu.it.manejoErrores;

public class Pila {
	public void m6() {
		System.out.println("Llegue a m6 ...");
	}
	public void m5() {
		System.out.println("Antes de llamar a m6");
		m6();
		System.out.println("Despues de llamar a m6");
	}
	public void m4() {
		System.out.println("Antes de llamar a m5");
		m5();
		System.out.println("Despues de llamar a m5");
	}
	public void m3() {
		System.out.println("Antes de llamar a m4");
		m4();
		System.out.println("Despues de llamar a m4");
	}
	public void m2() {
		System.out.println("Antes de llamar a m3");
		m3();
		System.out.println("Despues de llamar a m3");
	}
	public void m1() {
		System.out.println("Antes de llamar a m2");
		m2();
		System.out.println("Despues de llamar a m2");
	}
}
