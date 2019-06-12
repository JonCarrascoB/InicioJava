package com.formacion.ejercicio.basicos.condicionales;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m;
		System.out.println("Introduce el numero de mes");
		m = sc.nextInt();

		if (m < 1 || m > 12) {
			System.out.println("El mes introducido es incorrecto");
		} else {
			switch (m) {
			case 1:
				System.out.println("El mes es enero y tiene 31 días");
				break;
			case 2:
				System.out.println("El mes es febreo y tiene 28 días");
				break;
			case 3:
				System.out.println("El mes es marzo y tiene 31 días");
				break;
			case 4:
				System.out.println("El mes es abril y tiene 30 días");
				break;
			case 5:
				System.out.println("El mes es mayo y tiene 31 días");
				break;
			case 6:
				System.out.println("El mes es junio y tiene 30 días");
				break;
			case 7:
				System.out.println("El mes es julio y tiene 31 días");
				break;
			case 8:
				System.out.println("El mes es agosto y tiene 31 días");
				break;
			case 9:
				System.out.println("El mes es septiembre y tiene 30 días");
				break;
			case 10:
				System.out.println("El mes es octubre y tiene 31 días");
				break;
			case 11:
				System.out.println("El mes es noviembre y tiene 30 días");
				break;
			case 12:
				System.out.println("El mes es diciembre y tiene 31 días");
				break;
			}
		}

	}

}
