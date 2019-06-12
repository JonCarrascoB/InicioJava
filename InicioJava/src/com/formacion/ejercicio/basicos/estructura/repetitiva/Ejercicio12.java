package com.formacion.ejercicio.basicos.estructura.repetitiva;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		char respuesta;
		System.out.println("Ver si los numeros son pares o impares o positivos o negativos (el 0 lo para)");

		do {
			System.out.println("Introduce un numero");
			n = sc.nextInt();
			if (n % 2 == 0) {
				System.out.println("El numero " + n + " es par");
			} else {
				System.out.println("El numero " + n + " es impar");
			}
			if (n > 0) {
				System.out.println("El numero " + n + " es positivo");
			} else {
				System.out.println("El numero " + n + " es negativo");
			}

		} while (n != 0);

		sc.close();
		

	}

}
