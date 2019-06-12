package com.formacion.ejercicio.basicos.condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Inserte un numero entero");
		num = sc.nextInt();
		if (num % 10 == 0) {
			System.out.println("El numero " + num + " es un multiplo de 10.");
		} else {
			System.out.println("El numero " + num + " no es un multiplo de 10.");
		}

	}

}
