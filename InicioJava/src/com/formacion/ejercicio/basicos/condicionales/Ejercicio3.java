package com.formacion.ejercicio.basicos.condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un caracter");
		char c = sc.next().charAt(0);
		if (Character.isLetterOrDigit(c)) {
			if (Character.isDigit(c)) {
				System.out.println("El caracter introducido no es una letra, sino un numero");
			} else {
				if (Character.isUpperCase(c)) {
					System.out.println("El caracter introducido es una letra mayuscula");
				} else {
					System.out.println("El caracter introducido es una letra minuscula");
				}
			}
		} else {
			System.out.println("El caracter introducido no es una letra, sino un caracter especial");
		}

	}

}
