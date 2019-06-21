package com.formacion.ejercicio.basicos.estructura.repetitiva;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2;
		System.out.println("Introduce un numero");
		n1 = sc.nextInt();
		System.out.println("Introduce otro numero");
		n2 = sc.nextInt();

		if (n1 > n2) {
			for (int i = n2; i <= n1; i++) {
				System.out.println(i);
			}

		} else {
			for (int i = n1; i <= n2; i++) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
