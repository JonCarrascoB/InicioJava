package com.formacion.ejercicio.basicos.secuenciales;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte un numero de cinco cifras:");
		int n = sc.nextInt();
		System.out.println(n % 10);
		System.out.printf("%02d %n", n % 100);
		System.out.printf("%03d %n", n % 1000);
		System.out.printf("%04d %n", n % 10000);
		System.out.printf("%05d %n", n);

	}

}
