package com.formacion.ejercicio.basicos.secuenciales;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte un numero de cinco cifras:");
		int n = sc.nextInt();
		System.out.println(n / 10000);
		System.out.println(n / 1000);
		System.out.println(n / 100);
		System.out.println(n / 10);
		System.out.println(n);

	}

}
