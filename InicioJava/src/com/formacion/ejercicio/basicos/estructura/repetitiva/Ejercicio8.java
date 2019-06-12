package com.formacion.ejercicio.basicos.estructura.repetitiva;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Introduce un numero");
		n = sc.nextInt();

		int i = n;
		while (i > 0) {
			System.out.println(i);
			i--;
		}

		do {
			System.out.println(i);
			i--;
		} while (i > 0);

		
		for (int j = n; j > 0; j--) {
			System.out.println(j);
		}

	}

}
