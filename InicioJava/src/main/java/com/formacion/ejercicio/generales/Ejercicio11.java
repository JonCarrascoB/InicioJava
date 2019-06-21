package com.formacion.ejercicio.generales;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce un numero a transformar en romano: ");
			n = sc.nextInt();
		} while (n < 1 || n > 4000);

		System.out.println("El numero " + n + " en numeros romanos es: " + transformarEnRomano(n));

		sc.close();

	}

	private static String transformarEnRomano(int a) {
		String romano = "";
		int i, u, d, c, m;
		m = a / 1000;
		c = (a / 100) % 10;
		d = (a / 10) % 10;
		u = a % 10;

		// para correlacionar con las letras romanas:
		// miles
		for (i = 1; 1 < m; i++) {
			romano = romano + "M";
		}
		// centenas
		if (c == 9) {
			romano = romano + "CM";
		} else if (c >= 5) {
			romano = romano + "D";
			for (i = 6; i <= c; i++) {
				romano = romano + "C";
			}
		} else if (c == 4) {
			romano = romano + "CD";
		} else {
			for (i = 1; i <= c; i++) {
				romano = romano + "C";
			}
		}
		// decenas
		if (d == 9) {
			romano = romano + "XC";
		} else if (d >= 5) {
			romano = romano + "L";
			for (i = 6; i <= d; i++) {
				romano = romano + "X";
			}
		} else if (d == 4) {
			romano = romano + "XL";
		} else {
			for (i = 1; i <= d; i++) {
				romano = romano + "X";
			}
		}

		// unidades
		if (u == 9) {
			romano = romano + "IX";
		} else if (u >= 5) {
			romano = romano + "V";
			for (i = 6; i <= u; i++) {
				romano = romano + "I";
			}
		} else if (u == 4) {
			romano = romano + "IV";
		} else {
			for (i = 1; i <= u; i++) {
				romano = romano + "I";
			}
		}
		return romano;
	}

}
