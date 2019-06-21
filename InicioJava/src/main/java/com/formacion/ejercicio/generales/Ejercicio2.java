package com.formacion.ejercicio.generales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, cifras;
		char car;
		do {
			System.out.print("Introduce un número entero: ");
			n = sc.nextInt();
			cifras = 0;
			while (n != 0) {
				n = n / 10;
				cifras++;
			}
			System.out.println("El número tiene " + cifras + " cifras");
			System.out.print("Continuar? ");
			car = sc.next().charAt(0);
		} while (car != 'n' && car != 'N');

		sc.close();

	}

}
