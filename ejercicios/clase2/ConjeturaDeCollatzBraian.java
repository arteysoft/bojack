package edu.it;

import java.util.Scanner;

public class ConjeturaDeCollatz {

	public static void main(String[] args) {
		System.out.println("Ingrese un numero: ");
		Scanner teclado = new Scanner(System.in);

		int num = teclado.nextInt();

		System.out.println("Conjetura de Collatz: ");

		if (num >= 1) {
			while (num != 1) {
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = num * 3 + 1;
				}
				System.out.println(num);
			}
			teclado.close();
		}
	}
}