package com.formacion.basico;

import java.util.Scanner;

public class CrearPerro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre, raza;
		int edad = 0;
		boolean vacunado = false;
		boolean repetir = false;
		
		System.out.println("Vamos a introducir los datos de tu perro");
		System.out.println("Inserte el nombre del perro");
		nombre = sc.nextLine();
		System.out.println("Inserte la raza de su perro");
		raza = sc.nextLine();
		
		do {
			System.out.println("Inserte la edad de su perro");
			try {
				edad = Integer.parseInt(sc.nextLine());
				repetir = false; 
			} catch (Exception e) {
				System.out.println("Por favor introduzca una edad valida, en numeros");
				repetir= true;
			}
		} while (repetir);
		
		System.out.println("Inserte si esta vacunado, diga S/N");
		try {
		vacunado = Boolean.parseBoolean(sc.nextLine());
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		sc.close();
		
		Perro p = new Perro (nombre, raza, edad, vacunado);
		
		System.out.println(p.toString());

	}

}
