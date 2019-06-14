package com.formacion.ejercicio.basicos.secuenciales;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserte un lado del triangulo");
		double l1 = sc.nextDouble();
		System.out.println("Inserte un lado del triangulo");
		double l2 = sc.nextDouble();
		System.out.println("Inserte un lado del triangulo");
		double l3 = sc.nextDouble();

		double p = (l1 + l2 + l3) / 2;
		System.out.println(Math.sqrt(p * (p - l1) * (p - l2) * (p - l3)));

	}

}
