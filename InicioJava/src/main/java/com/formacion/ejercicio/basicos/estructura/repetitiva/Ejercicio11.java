package com.formacion.ejercicio.basicos.estructura.repetitiva;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, m;
		System.out.println("Introducir dos numeros enteros ()");
		do {
			System.out.println("Introduca un numero entero positivo");
			n = sc.nextInt();
			if (n <= 0) {
				System.out.println("Debe introducir un numero positivo");
			}
		} while (n <= 0);

		do {
			System.out.println("Introduca otro numero entero positivo");
			m = sc.nextInt();
			if (m <= 0) {
				System.out.println("Debe introducir un numero positivo");
			} else if (n >= m) {
				System.out.println("Debe introducir un numero mayor que: " + n);
			}

		} while (m <= 0 || n >= m);

		// Mostrar los numeros multiplos de n
		System.out.println("\n Los multiplos de " + n + "que hay entre 1 y " + m + "son: ");
		for (int i = 1; i < m; i++) {
			if (i % n == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
