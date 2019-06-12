package com.formacion.ejercicio.generales;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int n, fib1, fib2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Mostrar los numeros de la serie de Fibonacci hasta el valor dado");
		do {
			System.out.println("Inserte el valor");
			n = sc.nextInt();
		} while (n <= 1);
		System.out.println("Los primeros " + n + "son: ");
		fib1 = 1;
		fib2 = 1;
		System.out.println(fib1 + " ");
		for (int i = 2; i <= n; i++) {
			System.out.println(fib2 + " ");
			fib2 = fib1 + fib2;
			fib1 = fib2 - fib1;
		}
		System.out.println();

		sc.close();

	}

}
