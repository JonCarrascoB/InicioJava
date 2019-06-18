package com.formacion.ejercicio.basicos.secuenciales;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero de tres cifras: ");
		int num = sc.nextInt();
		System.out.println("La primera cifra es " + (num / 100) + " , la segunda cifra es " + ((num % 100) / 10)
				+ " y la tercer cifra es " + (num % 10));

	}

}
