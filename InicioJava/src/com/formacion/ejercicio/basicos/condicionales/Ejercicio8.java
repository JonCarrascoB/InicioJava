package com.formacion.ejercicio.basicos.condicionales;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3;
		System.out.println("Introduce un numero entero");
		num1 = sc.nextInt();
		System.out.println("Introduce otro numero entero");
		num2 = sc.nextInt();
		System.out.println("Introduce otro numero entero");
		num3 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("El numero " + num1 + " es el mayor numero.");
			} else {
				System.out.println("El numero " + num3 + " es el mayor numero.");
			}
		} else {
			if (num2 > num3) {
				System.out.println("El numero " + num2 + " es el mayor numero.");
			} else {
			}
		}
	}

}
