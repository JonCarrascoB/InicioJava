package com.formacion.ejercicio.basicos.secuenciales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una velocidad en Km/h");
		float vel = sc.nextFloat();
		System.out.println("La velocidad en m/s es de: " + ((vel * 1000) / 3600));

	}

}
