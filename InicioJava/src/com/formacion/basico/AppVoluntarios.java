package com.formacion.basico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class AppVoluntarios {

	static ArrayList<Person> alumnos = new ArrayList<Person>();
	
	public static void main(String[] args) {

		
		//Iterator<Person> it = alumnos.iterator();
		
		Person p1 = new Person("Mounir", 0, 'h');
		Person p2 = new Person("Andoni", 0, 'h');
		Person p3 = new Person("Asier", 0, 'h');
		Person p4 = new Person("Jon C", 0, 'h');
		Person p5 = new Person("Arkaitz", 0, 'h');
		Person p6 = new Person("Aritz", 0, 'h');
		Person p7 = new Person("Manuel", 0, 'h');
		Person p8 = new Person("Eduardo", 0, 'h');
		Person p9 = new Person("Eder I", 0, 'h');
		Person p10 = new Person("Eder S", 0, 'h');
		Person p11 = new Person("Gaizka", 0, 'h');
		Person p12 = new Person("Borja", 0, 'h');
		Person p13 = new Person("Veronica", 0, 'm');
		Person p14 = new Person("Jon A", 0, 'h');
		Person p15 = new Person("Jose Luis", 0, 'h');
		alumnos.add(p1);
		alumnos.add(p2);
		alumnos.add(p3);
		alumnos.add(p4);
		alumnos.add(p5);
		alumnos.add(p6);
		alumnos.add(p7);
		alumnos.add(p8);
		alumnos.add(p9);
		alumnos.add(p10);
		alumnos.add(p11);
		alumnos.add(p12);
		alumnos.add(p13);
		alumnos.add(p14);
		alumnos.add(p15);

		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Bienvenido a la aplicacion de eleccion de voluntarios para leer");
			System.out.println("Introduzca la opcion requerida del 1 al 5: ");
			pintarOpcion();
			opcion = Integer.parseInt(sc.nextLine());
			activarOpciones(opcion);

		} while (opcion != 5);
		sc.close();

	}

	public static void pintarOpcion() {
		System.out.println("Inserte la opcion 1 para listar los alumnos y ver el Ranking.");
		System.out.println("Inserte la opcion 2 para crear un alumno.");
		System.out.println("Inserte la opcion 3 para eliminar un alumno.");
		System.out.println("Inserte la opcion 4 para buscar un voluntario");
		System.out.println("Inserte la opcion 5 para salir de la aplicacion");

	}

	private static void activarOpciones(int opcion) {
		switch (opcion) {
		case 1:
			listarAlumnos();
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
			System.out.println("Gracias por usar nuestra APP, ADIOS");
			break;
		}

	}

	private static void buscarVoluntario() {
		int cont = 0;
		int numero = (int) (Math.random() * alumnos.size());

		for (int i = 0; i < alumnos.size(); i++) {

			if (numero != i) {
				System.out.println(i + " " + alumnos.get(i));
			} else {
				System.out.println(" *** " + alumnos.get(i));
				cont ++;
			}
		} // end for

	}

	private static void eliminarAlumno() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte el nombre del alumno a eliminar: ");
		String nombre = sc.nextLine();
		alumnos.remove(nombre);

	}
/**
 * Metodo para añadir un nuevo alumno a la array
 * @return p1 un nuevo alumno
 */
	private static void crearAlumno() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte los datos para crear un nuevo Alumno: ");
		System.out.println("Inserte el nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Inserte la edad: ");
		int edad = Integer.parseInt(sc.nextLine());
		System.out.println("Inserte el sexo (recuerde h hombre, m mujer, i indefinido: ");
		char sexo = sc.nextLine().charAt(0);
		Person p1 = new Person(nombre, edad, sexo);
		alumnos.add(p1);
	}

	private static void listarAlumnos() {
		if(!alumnos.isEmpty()) {
			System.out.println("Los alumnos de la lista son: ");
			for (int i = 0; i < alumnos.size(); i++) {
				System.out.println(i + " " + alumnos.get(i));
			}
		} else {
			System.out.println("No existen alumnos en la clase");
		}
	}

}
