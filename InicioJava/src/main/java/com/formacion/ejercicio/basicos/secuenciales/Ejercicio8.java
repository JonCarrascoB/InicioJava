package com.formacion.ejercicio.basicos.secuenciales;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final float pi = 3.141516f;

		System.out.println("Introduzca el radio de la esfera");
		double rad = sc.nextDouble();
		System.out.println("El volumen de la esfera es: " + ((4 * pi * Math.pow(rad, 3)) / 3));
	}

}
