package com.formacion.ejercicio.basicos.estructura.repetitiva;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Introduce un numero");
		n = sc.nextInt();

		int i = 1;
		while (i <= n) {
			System.out.println(i);
			i++;
		}

		do {
			System.out.println(i);
			i++;
		} while (i <= n);

		for (int j = 1; j <= n; j++) {
			System.out.println(j);
		}

	}

}
