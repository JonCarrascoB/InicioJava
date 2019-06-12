package com.formacion.ejercicio.basicos.estructura.repetitiva;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;

		do {
			System.out.println("Introduzca un numero entero");
			a = sc.nextInt();
			System.out.println("Introduzca otro numero entero mayor que el anterior");
			b = sc.nextInt();
			if (a >= b) {
				System.out.println("El segundo debe ser un numero entero mayor que el primero");
			}

		} while (a >= b);
		System.out.println("\n Los numeros pares que hay entre " + a + " y " + b + "son:");
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
