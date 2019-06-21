package com.formacion.ejercicio.basicos.condicionales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un caracter");
		char c1 = sc.next().charAt(0);
		System.out.println("Introduzca otro caracter");
		char c2 = sc.next().charAt(0);
		if (Character.isLetterOrDigit(c1) && Character.isLetterOrDigit(c2)) {
			if (Character.isLetter(c1) && Character.isLetter(c2)) {
				if (Character.isLowerCase(c1) && Character.isLowerCase(c2)) {
					System.out.println("Los caracteres son dos letras minusculas");
				} else {
					System.out.println("Uno de los caracteres no es una letra minuscula");
				}
			} else {
				System.out.println("Uno de los caracteres no es una letra");
			}
		} else {
			System.out.println("Uno de los caracteres no es una letra");
		}

	}

}
