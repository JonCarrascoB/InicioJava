package com.formacion.ejercicio.generales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, suma = 0;
		System.out.println("Introduzca un numero");
		int n = sc.nextInt();

		for (i = 1; i < n; i++) {
			if (n % i == 0) {
				suma = suma + i;
			}
		}

		if (suma == 0) {
			System.out.println("El numero es perfecto");
		} else {
			System.out.println("El numero no es perfecto");
		}

		sc.close();
	}

}
