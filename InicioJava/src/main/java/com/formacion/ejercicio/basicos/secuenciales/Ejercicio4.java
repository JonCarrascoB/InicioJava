package com.formacion.ejercicio.basicos.secuenciales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca los grados centigrados");
		float temp = sc.nextFloat();
		System.out.println(temp + " grados centigrados son " + (32 + ((9 * temp) / 5)) + " grados fharenhet");

	}

}
