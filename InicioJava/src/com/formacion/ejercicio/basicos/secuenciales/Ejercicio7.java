package com.formacion.ejercicio.basicos.secuenciales;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserte un cateto:");
		double cat1 = sc.nextDouble();
		System.out.println("Inserte un segundo cateto:");
		double cat2 = sc.nextDouble();
		System.out.println("La longitud de la hipotenusa es:" + Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2)));

	}

}
