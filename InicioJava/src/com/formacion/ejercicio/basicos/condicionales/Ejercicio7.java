package com.formacion.ejercicio.basicos.condicionales;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double num1, num2;
		System.out.println("Introduzca un numero");
		num1 = sc.nextDouble();
		System.out.println("Introduzca otro numero");
		num2 = sc.nextDouble();

		if (num2 == 0) {
			System.out.println("No se puede dividir entre 0");
		} else {
			System.out.println("La division entre " + num1 + " por " + num2 + " es igual a " + num1 / num2);
		}

	}

}
