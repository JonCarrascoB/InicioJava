package com.formacion.ejercicio.basicos.condicionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("Introduzca un numero entero");
		num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("El numero " + num + " es un numero par");
		} else {
			System.out.println("El numero " + num + " es un numero impar");
		}

	}

}
