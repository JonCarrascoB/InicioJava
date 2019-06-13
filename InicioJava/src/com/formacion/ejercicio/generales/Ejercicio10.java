package com.formacion.ejercicio.generales;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		long n, aux, dec, dig;
		int exp;
		Boolean esBinario;
		Scanner sc = new Scanner(System.in);
		System.out.println("Paso de un numero binario a decimal");

		// Primero comprobamos que el numero pasado por teclado es binario
		do {
			System.out.println("Inserte un numero binario: ");
			n = sc.nextLong();
			esBinario = true;
			aux = n;
			while (aux != 0) {
				dig = aux % 10;
				if (dig != 1 && dig != 0) {
					esBinario = false;
				}
				aux = aux / 10;
			}
		} while (!esBinario);

		// Transformamos el numero binario a decimal

		exp = 0;
		dec = 0;
		while (n != 0) {
			dig = n % 10;
			dec = dec + dig * (int) Math.pow(2, exp);
			exp++;
			n = n / 10;
		}
		System.out.println("El numero dec es: " + dec);
		sc.close();

	}

}
