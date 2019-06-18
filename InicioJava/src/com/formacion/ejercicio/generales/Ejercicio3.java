package com.formacion.ejercicio.generales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		final double KELVIN = 273.15;
		char cont;
		double grad;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduzca el numero de grados centigrados a cambiar: ");
			grad = sc.nextDouble();

			System.out.println("Los grados kelvin seran: " + (grad + KELVIN));
			System.out.println("¿Repetir el proceso? S/N");
			cont = sc.next().charAt(0);

		} while (cont != 'n' && cont != 'N');

		sc.close();

	}

}
