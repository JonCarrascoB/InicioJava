package com.formacion.ejercicio.generales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		char cont;
		Scanner sc = new Scanner(System.in);
		System.out.println("Tabla de multiplicar");
		do {
			System.out.println("Introduzca un numero a multiplicar");
			int num = sc.nextInt();

			System.out.println("Por 1 = " + (num * 1));
			System.out.println("Por 2 = " + (num * 2));
			System.out.println("Por 3 = " + (num * 3));
			System.out.println("Por 4 = " + (num * 4));
			System.out.println("Por 5 = " + (num * 5));
			System.out.println("Por 6 = " + (num * 6));
			System.out.println("Por 7 = " + (num * 7));
			System.out.println("Por 8 = " + (num * 8));
			System.out.println("Por 9 = " + (num * 9));
			System.out.println("Por 10 = " + (num * 10));

			System.out.println("¿Quiere usted multiplicar otro numero? S/N");
			cont = sc.next().charAt(0);
		} while (cont != 'n' && cont != 'N');
		sc.close();

	}

}
