package com.formacion.ejercicio.generales;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		int n, exp, dig;
		double bin;
		Scanner sc = new Scanner(System.in);
		System.out.println("Paso de un numero decimal a binario");

		do {
			System.out.println("Inserte un numero entero >= 0");
			n = sc.nextInt();
		} while (n < 0);
		exp = 0;
		bin = 0;
		while (n != 0) {
			dig = n % 2;
			bin = bin + dig * Math.pow(10, exp);
			exp++;
			n = n / 2;
		}
		System.out.println("El numero binario es: "+bin);
		sc.close();

	}

}
