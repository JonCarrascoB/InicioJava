package com.formacion.ejercicio.generales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, cifras;
		char car;
		do {
			System.out.print("Introduce un n�mero entero: ");
			n = sc.nextInt();
			cifras = 0;
			while (n != 0) {
				n = n / 10;
				cifras++;
			}
			System.out.println("El n�mero tiene " + cifras + " cifras");
			System.out.print("Continuar? ");
			car = sc.next().charAt(0);
		} while (car != 'n' && car != 'N');

		sc.close();

	}

}
