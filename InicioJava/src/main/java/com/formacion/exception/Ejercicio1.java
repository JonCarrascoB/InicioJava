package com.formacion.exception;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println("Comienza programa");

		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduzca un numero del 0 al 9");

		try {
			String sNumero = sc.nextLine(); // Usar mejor siempre esto que no nextInt o nextChar
			int numero = Integer.parseInt(sNumero);
			System.out.println("Su numero es " + numero);
			
		} catch (Exception e) {
			//e.printStackTrace(); nos pinta donde se da la excepcion, pero nunca la debe verla el usuario
			System.out.println("Mensaje de la excepcion: "+ e.getMessage());
			
			System.out.println("*** Te dije un numero que sino falla ***");
		} finally {
			sc.close();
		}

		System.out.println("Finaliza programa");

	}

}
