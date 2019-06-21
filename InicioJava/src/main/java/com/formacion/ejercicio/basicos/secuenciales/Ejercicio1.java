package com.formacion.ejercicio.basicos.secuenciales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número entero: ");
		int num1 = sc.nextInt();
		System.out.println("introduzca un nuevo numero entero");
		int num2 = sc.nextInt();
		System.out.println("El primer numero introducido es: " + num1 + " y el segundo es: " + num2);

	}

}
