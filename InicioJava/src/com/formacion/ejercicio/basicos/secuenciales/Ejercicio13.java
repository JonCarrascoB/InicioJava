package com.formacion.ejercicio.basicos.secuenciales;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dia, mes, año, suma, cif1, cif2, cif3, cif4;

		System.out.println("Introduzca la fecha de tu cumpleaños");
		System.out.println("Introduzca el día:");
		dia = sc.nextInt();
		System.out.println("Introduzca el mes:");
		mes = sc.nextInt();
		System.out.println("Introduzca el año:");
		año = sc.nextInt();

		suma = dia + mes + año;
		cif1 = suma / 1000;
		cif2 = (suma / 100) % 10;
		cif3 = (suma / 10) % 10;
		cif4 = suma % 10;

		System.out.println("Tu numero de la suerte es: " + (cif1 + cif2 + cif3 + cif4));

	}

}
