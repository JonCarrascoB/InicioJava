package com.formacion.basico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.formacion.basico.modelo.DAOAlumnoArrayList;

public class AppVoluntariosDAO {

	static final int OPCION_LISTAR = 1;
	static final int OPCION_CREAR = 2;
	static final int OPCION_ELIMINAR = 3;
	static final int OPCION_BUSCARVOLUNTARIO = 4;
	static final int OPCION_EXIT = 5;

	// Declaramos los arrayList que se van a usar en este programa
	ArrayList<Alumno> lista = new ArrayList<Alumno>();
	static String ULTIMO_VOLUNTARIO;
	static int opcion = 0;
	static Scanner sc;
	static DAOAlumnoArrayList dao;

	// static HashMap<Integer, String> ranking = new HashMap <Integer, String>();

	public static void main(String[] args) {

		dao = new DAOAlumnoArrayList();
		// inicializarLista();

		// iniciamos el programa, cuyo menu se mete en un bucle hasta que el usuario
		// indica la opcion de salida

		sc = new Scanner(System.in);
		do {

			pintarOpcionYPedirOpcion();

		} while (opcion != OPCION_EXIT);
		sc.close();

	}

	

	// Metodos que son llamados en el programa

	/**
	 * Metodo para que aparezca el menu de opciones en la consola
	 */
	public static void pintarOpcionYPedirOpcion() {
		System.out.println("");
		System.out.println("***************************************************************************");
		System.out.println("**    Bienvenido a la aplicacion de eleccion de voluntarios para leer    **");
		System.out.println("**                                                                       **");
		System.out.println("***************************************************************************");
		System.out.println("**    1. Listar los alumnos segun el Ranking.                            **");
		System.out.println("**    2. Crear un alumno.                                                **");
		System.out.println("**    3. Eliminar un alumno.                                             **");
		System.out.println("**    4. Buscar un voluntario                                            **");
		System.out.println("**    5. Salir de la aplicacion                                          **");
		System.out.println("***************************************************************************");
		System.out.println("");

		try {
			opcion = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Inserte una de las opciones del menu, por favor");
			pintarOpcionYPedirOpcion();
		}
		activarOpciones(opcion);

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
			numero = (int) (Math.random() * dao.getAll().size());
			dao.getAll().get(numero).setNumVecesLeer(dao.getAll().get(numero).getNumVecesLeer() + 1);

		} while (dao.getAll().get(numero).getNombre().equals(ULTIMO_VOLUNTARIO));
		ULTIMO_VOLUNTARIO = dao.getAll().get(numero).getNombre();

		System.out.println("El alumno que es voluntario es: " + dao.getAll().get(numero).getNombre());

	}

	/**
	 * Metodo para eliminar a un alumno elegido por consola
	 */
	private static void eliminarAlumno() {

		ArrayList<Alumno> lista = (ArrayList<Alumno>) dao.getAll();
		String nombre;
		int id;
		boolean encontrado = false;
		do {
			System.out.println("Inserte el nombre del alumno a eliminar: ");
			System.out.println("Inserte el nombre: ");
			nombre = sc.nextLine();
		} while ("".equals(nombre));

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equals(nombre)) {
				id = lista.get(i).getId();

				if (dao.delete(id)) {
					System.out.println("El alumno se ha eliminado correctamente.");
				} else {
					System.out.println("***** ERROR al crear *******");
				}
				encontrado = true;
			} else {
				encontrado = false;
			}
		}
		if (!encontrado) {
			System.out.println("El alumno " + nombre + " no es miembro de este Aula.");
		}

	}

	/**
	 * Metodo para añadir un nuevo alumno a la array
	 * 
	 * @return p1 un nuevo alumno
	 */
	private static void crearAlumno() {
		String nombre;
		do {
			System.out.println("Inserte los datos para crear un nuevo Alumno: ");
			System.out.println("Inserte el nombre: ");
			nombre = sc.nextLine();
		} while ("".equals(nombre));

		Alumno alumno = new Alumno(nombre);
		alumno.setId(dao.getAll().size() + 1);

		if (dao.insert(alumno)) {
			System.out.println("El alumno ha sido creado corectamente");
		} else {
			System.out.println("***** ERROR al crear *******");
		}

	}

	/**
	 * Metodo para enlistar los alumnos segun el ranking de veces que ha salido
	 * voluntario
	 */
	private static void listarAlumnos() {

		ArrayList<Alumno> lista = (ArrayList<Alumno>) dao.getAll();
		Collections.sort(lista);

		for (Alumno alumno : lista) {
			System.out.println("El alumno " + alumno.getNombre() + " ha salido voluntario " + alumno.getNumVecesLeer()
					+ " veces.");
		}

	}

}
