package com.formacion.ejercicio.generales;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int i, suma = 0, n, m;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero");
		n = sc.nextInt();
		System.out.println("Introduzca otro numero");
		m = sc.nextInt();

		for (i = 1; i < n; i++) {
			if (n % i == 0) {
				suma = suma + i;
			}
		}
		if (suma == m) {
			suma = 0;
			for (i = 1; i < m; i++) {
				if (m % i == 0) {
					suma = suma + i;
				}
			}
			if (suma == n) {
				System.out.println("Los dos numeros son amigos");
			} else {
				System.out.println("Los dos numeros no son amigos");
			}
		} else {
			System.out.println("Los dos numeros no son amigos");
		}

		sc.close();
	}

}
