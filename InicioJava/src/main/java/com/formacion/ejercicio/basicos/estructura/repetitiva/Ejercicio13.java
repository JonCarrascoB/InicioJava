package com.formacion.ejercicio.basicos.estructura.repetitiva;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final float km = 1.60934f;
		int millas;

		do {
			System.out.println("Inserte el numero de millas:");
			millas = sc.nextInt();
			if (millas != 0) {
				System.out.println("La equivalencia de " + millas + " en kilometros es de " + millas * km);
			}

		} while (millas != 0);
		sc.close();

	}

}
