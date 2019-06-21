package com.formacion.ejercicio.basicos.condicionales;

import java.util.Scanner;

/**
 * 
 * @author Curso
 * @see http://www.campus.formacion.ipartek.com/moodle/mod/page/view.php?id=882
 *
 */
public class VariablesPrimitivasWrappers {

	public static void main(String[] args) {

		// Declarar todas las posibles tipos de variables primitivas existentes

		// Numeros enteros
		byte b = 2;
		short s = 4;
		int i = 0;
		long l = 8;

		// nuemeros reales o con decimales
		float f = 2.34f;
		double d = 4.56;

		char c = 'a'; // se utilizan las comillas simples
		boolean b1 = true; // o false

		// Los wrappers, clases que envuelven a primitivas

		int numeroParseado = Integer.parseInt("3");

		System.out.printf("El rango de un in %d %d \n \n \n", Integer.MIN_VALUE, Integer.MAX_VALUE);

		// Ejercicio para indicar si el caracter introducido por pantalla es mayuscula o
		// minuscula,
		// letra o numero, o investigar más.

		System.out.println("Por favor introduzca un caracter");
		Scanner sc = new Scanner(System.in);
		char caracter = sc.next().charAt(0);
		if (Character.isLetterOrDigit(caracter)) {
			if (Character.isDigit(caracter)) {
				System.out.println("El caracter " + caracter + " es un numero.");
			} else {
				if (Character.isUpperCase(caracter)) {
					System.out.println("El caracter " + caracter + " es mayuscula.");
				} else {
					System.out.println("El caracter " + caracter + "es minuscula");
				}
			}
		} else {
			System.out.println("El caracter " + caracter + " no es un numero, ni una letra.");
		}
		
		
		sc.close();

	}

}
