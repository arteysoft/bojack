package edu.it;

import java.util.Scanner;

public class Collatz {	
	public static void run() {
		Scanner StdIn = new Scanner(System.in);
        System.out.println("Ingrese un número para calcular la conjetura de Collatz: ");
        int num = StdIn.nextInt();
        if (esValido(num)) {
        	collatz(num);
        }
	}
	private static Boolean esValido(int num) {
		if (num > 0) {
			return true;
		}
		return false;
		
		// return (num > 0)
	}
    private static void collatz(int num) {
    	System.out.println("Resultado:");
	    while (num != 1) {
	        if (num % 2 == 0) {
	        	num = num / 2;
	        } else {
	        	num = (num * 3) + 1;
	        }
	        System.out.println(num);
	    }
    }
}

