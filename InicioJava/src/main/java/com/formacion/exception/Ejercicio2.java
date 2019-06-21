package com.formacion.exception;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		String a, b;
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int suma;
		boolean rep = false;
		do {
			System.out.println("Por favor introduzca un numero");
			a = sc.nextLine();
			try {
				num1 = Integer.parseInt(a);
				rep = false;
			} catch (Exception e) {
				System.out.println("Por favor se le ha pedido que inserte un numero");
				rep = true;
			}

		} while (rep);

		do {
			System.out.println("Por favor introduzca otro numero");
			b = sc.nextLine();
			try {
				num2 = Integer.parseInt(b);
				rep = false;
			} catch (Exception e) {
				System.out.println("Por favor se le ha pedido que inserte un numero");
				rep = true;
			}
		} while (rep);

		suma = num1 + num2;
		System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + suma);

		sc.close();
	}

}
