package com.formacion.ejercicio.basicos.condicionales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un caracter");
		char c1 = sc.next().charAt(0);
		if (Character.isDigit(c1)) {
			System.out.println("El caracter es un numero");
		} else {
			System.out.println("El caracter no es un numero");
		}

	}

}
