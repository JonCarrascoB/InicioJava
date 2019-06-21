package com.formacion.ejercicio.basicos.secuenciales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final float pi = 3.141516f;

		System.out.println("Inserte el radio de la circunferencia");
		float radius = sc.nextFloat();
		System.out.println("La longitud de la circunferencia es: " + (2 * pi * radius));
		System.out.println("La longitud de la circunferencia es: " + (pi * Math.pow(radius, 2)));

	}

}
