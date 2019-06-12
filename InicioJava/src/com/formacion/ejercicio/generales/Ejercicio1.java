package com.formacion.ejercicio.generales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, aux;

		System.out.println("Introduce un numero entero");
		a = sc.nextInt();
		System.out.println("Introduce otro numero entero");
		b = sc.nextInt();
		System.out.println("Los valores son: a = " + a + " y b = " + b);

		aux = a;
		a = b;
		b = aux;

		System.out.println("Los valores intercambiados son: a = " + a + " y b = " + b);

		sc.close();

	}

}
