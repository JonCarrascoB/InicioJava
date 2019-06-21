package com.formacion.ejercicio.bucle.anidado;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double factorial, suma = 0;
		int num;
		do {
			System.out.println("Introduzca un numero entero > 0 para hallar su factorial: ");
			num = Integer.parseInt(sc.nextLine());
		} while (num < 0);

		for (int i = 0; i <= num; i++) {
			factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial = factorial * j;
			}
			suma = suma + factorial;
		}
		System.out.println(suma);
	}

}
