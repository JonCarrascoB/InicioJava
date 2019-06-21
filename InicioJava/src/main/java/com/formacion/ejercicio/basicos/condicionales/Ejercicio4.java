package com.formacion.ejercicio.basicos.condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un caracter");
		char c1 = sc.next().charAt(0);
		System.out.println("Introduzca otro caracter");
		char c2 = sc.next().charAt(0);
		if (c1 == c2) {
			System.out.println("Los caracteres son iguales");
		} else {
			System.out.println("Los caracteres no son iguales");
		}
	}

}
