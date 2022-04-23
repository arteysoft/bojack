package edu.it;

public class Ejercicio1 {
	public void run() {
		System.out.println("Estoy en el ejercicio 1");
		
		/*
		 * Dados unos indices de inflacion del 2.7 - 2.9 - 3.5
		 * Calcular la inflacion total del trimestre
		 * 
		 * No USAR Cilclos for
		 * Atencion que es indice compuesto, NO ES LA SUMA
		 * 
		 * Usar Float o Double usar identificadores con nombres
		 * Que sean intuitivos
		 * 
		 * 100 * 1.027 = I1
		 * I1 * 1.029 = I2
		 * I2 * 1.035 = Total inflacion trimestral
		 * Sacar el numero final, deberia restarle los 100 iniciales
		 */
		
		Float numeroBase = 100f;
		Float M1 = numeroBase * 1.027f;
		Float M2 = M1 * 1.029f;
		Float M3 = M2 * 1.035f;
		
		System.out.println(M3 - 100); // Composicion
		System.out.println(0.027f + 0.029f + 0.035f); // Suma Directa
	}
}
