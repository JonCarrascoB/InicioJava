package com.formacion.ejercicio.generales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int num, suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Contar numeros acabados en 2");

		do {
			System.out.println("Inserte un numero");
			num = sc.nextInt();
			if (num / 10 == 2) {
				suma = suma + num;
			}
		} while (num >= 0);
		System.out.println("Han aparecido tantos numeros acabados en 2: " + suma);

		sc.close();

	}

}
