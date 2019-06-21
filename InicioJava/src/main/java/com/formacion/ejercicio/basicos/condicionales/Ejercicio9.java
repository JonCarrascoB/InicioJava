package com.formacion.ejercicio.basicos.condicionales;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h, m, s;
		System.out.println("Introduce un numero entero");
		h = sc.nextInt();
		System.out.println("Introduce otro numero entero");
		m = sc.nextInt();
		System.out.println("Introduce otro numero entero");
		s = sc.nextInt();

		if (h <= 24 && h >= 0) {
			if (m >= 0 && m <= 60) {
				if (s >= 0 && s <= 60) {
					System.out.println("La hora es " + h + " horas, " + m + " minutos y " + s + " segundos.");
				} else {
					System.out.println("No es una hora valida");
				}
			} else {
				System.out.println("No es una hora valida");
			}
		} else {
			System.out.println("No es una hora valida");
		}

	}

}
