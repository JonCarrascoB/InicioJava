package com.formacion.ejercicio.generales;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		int n;
		String pal;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Sistema de cifrado Cesar");

		// comprobamos que introducen lo que queremos
		do {
			System.out.println("Inserte la palabra a codificar/decodificar");
			pal = sc.nextLine();
		} while (pal.isEmpty());

		do {
			System.out.println("Inserte un numero como nivel de cifrado");
			n = sc.nextInt();
		} while (n < 1);

		do {
			System.out.println("Cifrar (C) o Descifrar (D)");
			c = sc.next().charAt(0);
		} while (Character.toUpperCase(c) != 'C' && Character.toUpperCase(c) != 'D');

		// llamamos a los metodos
		if (Character.toUpperCase(c) == 'C') {
			System.out.println("El cifrado es: " + codificar(pal, n));
		} else {
			System.out.println("El descifrado es: " + decodificar(pal, n));
		}

		sc.close();

	}

	// metodos

	private static String codificar(String pal, int n) {

		StringBuilder cifrado = new StringBuilder();
		n = n % 26;
		for (int i = 0; i < pal.length(); i++) {
			if (pal.charAt(i) >= 'a' && pal.charAt(i) <= 'z') {
				if ((pal.charAt(i) + n) > 'z') {
					cifrado.append((char) (pal.charAt(i) + n - 26));
				} else {
					cifrado.append((char) (pal.charAt(i) + n));
				}
			} else if (pal.charAt(i) >= 'A' && pal.charAt(i) <= 'Z') {
				if ((pal.charAt(i) + n) > 'Z') {
					cifrado.append((char) (pal.charAt(i) + n - 26));
				} else {
					cifrado.append((char) (pal.charAt(i) + n));
				}
			}
		}
		return cifrado.toString();
	}

	private static String decodificar(String pal, int n) {

		StringBuilder cifrado = new StringBuilder();
		n = n % 26;
		for (int i = 0; i < pal.length(); i++) {
			if (pal.charAt(i) >= 'a' && pal.charAt(i) <= 'z') {
				if ((pal.charAt(i) - n) < 'a') {
					cifrado.append((char) (pal.charAt(i) - n + 26));
				} else {
					cifrado.append((char) (pal.charAt(i) - n));
				}
			} else if (pal.charAt(i) >= 'A' && pal.charAt(i) <= 'Z') {
				if ((pal.charAt(i) - n) < 'A') {
					cifrado.append((char) (pal.charAt(i) - n + 26));
				} else {
					cifrado.append((char) (pal.charAt(i) - n));
				}
			}
		}

		return cifrado.toString();
	}

}
