package com.formacion.basico;

import java.util.ArrayList;
import java.util.Scanner;

public class AppVoluntarios {

	public static void main(String[] args) {

		ArrayList <Person> alumnos = new ArrayList<Person>();
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Bienvenido a la aplicacion de eleccion de voluntarios para leer");
		System.out.println("Introduzca la opcion requerida del 1 al 5: ");
		int opcion = Integer.parseInt(sc.nextLine());
		activarOpciones(opcion);
		
		
		sc.close();

	}

	private static void activarOpciones(int opcion) {
		switch(opcion) {
		case 1:
			listarAlumnos();
			alumnos.add(p1);
			break;
		case 2:
			crearAlumno();
			break;
		case 3:
			eliminarAlumno();
			break;
		case 4:
			buscarVoluntario();
			break;
		case 5:
			break;
		}
		
	}

	private static void buscarVoluntario() {
		// TODO Auto-generated method stub
		
	}

	private static void eliminarAlumno() {
		// TODO Auto-generated method stub
		
	}

	private static Person crearAlumno() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte los datos para crear un nuevo Alumno: ");
		System.out.println("Inserte el nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Inserte la edad: ");
		int edad = Integer.parseInt(sc.nextLine());
		System.out.println("Inserte el sexo (recuerde h hombre, m mujer, i indefinido: ");
		char sexo = sc.nextLine().charAt(0);
		Person p1 = new Person (nombre, edad, sexo);
		return p1;
	}

	private static void listarAlumnos() {
		
		
	}
	
	

}
