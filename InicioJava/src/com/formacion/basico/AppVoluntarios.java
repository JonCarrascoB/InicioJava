package com.formacion.basico;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AppVoluntarios {

	static final int OPCION_LISTAR = 1;
	static final int OPCION_CREAR = 2;
	static final int OPCION_ELIMINAR = 3;
	static final int OPCION_BUSCARVOLUNTARIO = 4;
	static final int OPCION_EXIT = 5;

	// Declaramos los arrayList que se van a usar en este programa
	static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	static String ULTIMO_VOLUNTARIO;

	// static HashMap<Integer, String> ranking = new HashMap <Integer, String>();

	public static void main(String[] args) {

		// Insertamos a todos los alumnos de base en el arraylist Alumnos
		alumnos.add(new Alumno("Mounir"));
		alumnos.add(new Alumno("Andoni"));
		alumnos.add(new Alumno("Asier"));
		alumnos.add(new Alumno("Jon C"));
		alumnos.add(new Alumno("Arkaitz"));
		alumnos.add(new Alumno("Aritz"));
		alumnos.add(new Alumno("Manuel"));
		alumnos.add(new Alumno("Eduardo"));
		alumnos.add(new Alumno("Eder I"));
		alumnos.add(new Alumno("Eder S"));
		alumnos.add(new Alumno("Gaizka"));
		alumnos.add(new Alumno("Borja"));
		alumnos.add(new Alumno("Veronica"));
		alumnos.add(new Alumno("Jon A"));
		alumnos.add(new Alumno("Jose Luis"));

		// iniciamos el programa, cuyo menu se mete en un bucle hasta que el usuario
		// indica la opcion de salida
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {

			pintarOpcion();
			opcion = Integer.parseInt(sc.nextLine());
			activarOpciones(opcion);

		} while (opcion != 5);
		sc.close();

	}

	// Metodos que son llamados en el programa

	/**
	 * Metodo para que aparezca el menu de opciones en la consola
	 */
	public static void pintarOpcion() {
		System.out.println("***************************************************************************");
		System.out.println("**    Bienvenido a la aplicacion de eleccion de voluntarios para leer    **");
		System.out.println("**            Introduzca la opcion requerida del 1 al 5:                 **");
		System.out.println("***************************************************************************");
		System.out.println("**    Inserte la opcion 1 para listar los alumnos segun el Ranking.      **");
		System.out.println("**    Inserte la opcion 2 para crear un alumno.                          **");
		System.out.println("**    Inserte la opcion 3 para eliminar un alumno.                       **");
		System.out.println("**    Inserte la opcion 4 para buscar un voluntario                      **");
		System.out.println("**    Inserte la opcion 5 para salir de la aplicacion                    **");
		System.out.println("***************************************************************************");

	}

	/**
	 * Metodo para hacer que se lancen las opciones elegidas por el usuario
	 * 
	 * @param opcion de las que se presentan en pantalla
	 * @see pintarOpcion()
	 */
	private static void activarOpciones(int opcion) {
		switch (opcion) {
		case OPCION_LISTAR:
			listarAlumnos();
			break;
		case OPCION_CREAR:
			crearAlumno();
			break;
		case OPCION_ELIMINAR:
			eliminarAlumno();
			break;
		case OPCION_BUSCARVOLUNTARIO:
			buscarVoluntario();
			break;
		case OPCION_EXIT:
			System.out.println("Gracias por usar nuestra APP, ADIOS");
			break;
		}

	}

	/**
	 * Metodo para que salga el alumno voluntario de forma random
	 */
	private static void buscarVoluntario() {
		int numero = 0;

		do {
			numero = (int) (Math.random() * alumnos.size());
			alumnos.get(numero).setNumVecesLeer(alumnos.get(numero).getNumVecesLeer() + 1);

		} while (alumnos.get(numero).getNombre().equals(ULTIMO_VOLUNTARIO));
		ULTIMO_VOLUNTARIO = alumnos.get(numero).getNombre();

		System.out.println("El alumno que es voluntario es: " + alumnos.get(numero).getNombre());

	}

	/**
	 * Metodo para eliminar a un alumno elegido por consola
	 */
	private static void eliminarAlumno() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte el nombre del alumno a eliminar: ");
		String nombre = sc.nextLine();
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNombre().equals(nombre)) {
				alumnos.remove(nombre);
				System.out.println("El alumno se ha eliminado correctamente.");
			} else {
				System.out.println("El alumno " + nombre + " no es miembro de este Aula.");
			}
		}

	}

	/**
	 * Metodo para añadir un nuevo alumno a la array
	 * 
	 * @return p1 un nuevo alumno
	 */
	private static void crearAlumno() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte los datos para crear un nuevo Alumno: ");
		System.out.println("Inserte el nombre: ");
		String nombre = sc.nextLine();

		if (!alumnos.contains(nombre)) {
			alumnos.add(new Alumno(nombre));
			System.out.println("El alumno se ha creado corectamente.");
		} else {
			System.out.println("El alumno " + nombre + " ya pertenece a esta Aula");
		}

	}

	/**
	 * Metodo para enlistar los alumnos segun el ranking de veces que ha salido
	 * voluntario
	 */
	private static void listarAlumnos() {

		Collections.sort(alumnos);
		
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println((i+1)+"El alumno " + alumnos.get(i).getNombre() + " ha salido voluntario "+ alumnos.get(i).getNumVecesLeer() + " veces.");
		}
		
	/*public int compare(Alumno a1) {
		return new Integer(a1.getNumVecesLeer()).compareTo(new Integer(a2.getNumVecesLeer()));
	}*/

	// System.out.println("El alumno " + alumnos.getNombre() + " ha salido
	// voluntario "
	// + alumnos.getNumVecesLeer() + " veces.");

	/*
	 * for (int i = 1; i < alumnos.size(); i++) { compareTo(alumnos[i]);
	 * alumnos.sort(alumnos.get(i - 1).compareTo(alumnos.get(i));
	 * alumnos.sort(o1,o2) -> ; alumnos.get(i - 1).compareTo(alumnos.get(i));
	 */

}

}
