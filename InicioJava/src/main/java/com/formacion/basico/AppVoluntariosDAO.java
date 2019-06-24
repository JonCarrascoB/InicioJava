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
	static final int OPCION_MODIFICAR = 5;
	static final int OPCION_EXIT = 6;

	static final int OPCION_UPNOMBRE = 1;
	static final int OPCION_UPEDAD = 2;
	static final int OPCION_UPALTURA = 3;
	static final int OPCION_UPPESO = 4;
	static final int OPCION_UPCOLOROJOS = 5;
	static final int OPCION_UPSEXO = 6;
	static final int OPCION_UPSALIR = 7;

	// Declaramos los arrayList que se van a usar en este programa
	ArrayList<Alumno> lista = new ArrayList<Alumno>();
	static String ULTIMO_VOLUNTARIO;
	static int opcion = 0;
	static Scanner sc;
	static DAOAlumnoArrayList dao;

	public static void main(String[] args) {

		// dao = new DAOAlumnoArrayList();

		dao = DAOAlumnoArrayList.getInstance();

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
		System.out.println("**    5. Modificar Datos del alumno                                      **");
		System.out.println("**    6. Salir de la aplicacion                                          **");
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
		case OPCION_MODIFICAR:
			modificarAlumno();
			break;
		case OPCION_EXIT:
			System.out.println("Gracias por usar nuestra APP, ADIOS");
			break;
		}

	}

	/**
	 * metodo para modificar o updatear los datos de un alumno
	 */
	private static void modificarAlumno() {

		System.out.println("");
		System.out.println("*****************************");
		System.out.println("**  Opciones a modificar   **");
		System.out.println("**                         **");
		System.out.println("**  1. Cambiar nombre      **");
		System.out.println("**  2. Cambiar edad        **");
		System.out.println("**  3. Cambiar altura      **");
		System.out.println("**  4. Cambiar peso        **");
		System.out.println("**  5. Cambiar color ojos  **");
		System.out.println("**  6. Cambiar sexo        **");
		System.out.println("**  7. Salir               **");
		System.out.println("*****************************");
		System.out.println("");

		try {
			opcion = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Inserte una de las opciones del menu, por favor");
			pintarOpcionYPedirOpcion();
		}
		activarOpcionesModificables(opcion);

	}

	/**
	 * Metodo para lanzar las opciones de update por cada variable del Alumno
	 * 
	 * @param opcion2 opcion introducida en el menu de modificaciones
	 */
	private static void activarOpcionesModificables(int opcion2) {
		switch (opcion) {
		case OPCION_UPNOMBRE:
			modificarNombre();
			break;
		case OPCION_UPEDAD:
			modificarEdad();
			break;
		case OPCION_UPALTURA:
			modificarAltura();
			break;
		case OPCION_UPPESO:
			modificarPeso();
			break;
		case OPCION_UPCOLOROJOS:
			modificarColorOjos();
			break;
		case OPCION_UPSEXO:
			modificarSexo();
			break;
		case OPCION_UPSALIR:
			break;
		}

	}

	/**
	 * metodo paramodificar el sexo del alumno
	 */
	private static void modificarSexo() {
		ArrayList<Alumno> lista = (ArrayList<Alumno>) dao.getAll();
		String nombre;
		char sexoNuevo = ' ';
		do {
			System.out.println("Inserte el nombre del Alumno en el que quiere hacer cambios: ");
			nombre = sc.nextLine();
		} while ("".equals(nombre));

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equals(nombre)) {
				System.out.println("Inserte su sexo nuevo, h para hombre, m para mujer e i para indefinido:");
				try {
					sexoNuevo = sc.nextLine().charAt(0);
				} catch (Exception e) {
					System.out.println("*** Error, introduzca un valor válido  ***");
				}
				lista.get(i).setSexo(sexoNuevo);
				dao.update(lista.get(i));
			}
		}

	}

	/**
	 * Metodo que modifica el color de los ojos
	 */
	private static void modificarColorOjos() {
		ArrayList<Alumno> lista = (ArrayList<Alumno>) dao.getAll();
		String nombre, colorOjosNuevo = "";

		do {
			System.out.println("Inserte el nombre del Alumno en el que quiere hacer cambios: ");
			nombre = sc.nextLine();
		} while ("".equals(nombre));

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equals(nombre)) {
				System.out.println("Inserte su color de ojos nuevo:");
				try {
					colorOjosNuevo = sc.nextLine();
				} catch (Exception e) {
					System.out.println("*** Error, introduzca un valor válido  ***");
				}
				lista.get(i).setOjos(colorOjosNuevo);
				dao.update(lista.get(i));
			}
		}

	}

	/**
	 * Metodo que modifica el peso de un alumno
	 */
	private static void modificarPeso() {
		ArrayList<Alumno> lista = (ArrayList<Alumno>) dao.getAll();
		String nombre;
		float pesoNuevo = 0;
		do {
			System.out.println("Inserte el nombre del Alumno en el que quiere hacer cambios: ");
			nombre = sc.nextLine();
		} while ("".equals(nombre));

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equals(nombre)) {
				System.out.println("Inserte su peso nuevo:");
				try {
					pesoNuevo = Float.parseFloat(sc.nextLine());
				} catch (Exception e) {
					System.out.println("*** Error, introduzca un valor válido  ***");
				}
				lista.get(i).setPeso(pesoNuevo);
				dao.update(lista.get(i));
			}
		}
	}

	/**
	 * Metodo que modifica la altura de un alumno
	 */
	private static void modificarAltura() {
		ArrayList<Alumno> lista = (ArrayList<Alumno>) dao.getAll();
		String nombre;
		float alturaNueva = 0;
		do {
			System.out.println("Inserte el nombre del Alumno en el que quiere hacer cambios: ");
			nombre = sc.nextLine();
		} while ("".equals(nombre));

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equals(nombre)) {
				System.out.println("Inserte su altura nueva:");
				try {
					alturaNueva = Float.parseFloat(sc.nextLine());
				} catch (Exception e) {
					System.out.println("*** Error, introduzca un valor válido  ***");
				}
				lista.get(i).setAltura(alturaNueva);
				dao.update(lista.get(i));
			}
		}

	}

	/**
	 * metodo que modifica el valor de la edad del alumno.
	 */
	private static void modificarEdad() {
		ArrayList<Alumno> lista = (ArrayList<Alumno>) dao.getAll();
		String nombre;
		int edadNueva = 0;
		do {
			System.out.println("Inserte el nombre del Alumno en el que quiere hacer cambios: ");
			nombre = sc.nextLine();
		} while ("".equals(nombre));

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equals(nombre)) {
				System.out.println("Inserte el nuevo nombre:");
				try {
					edadNueva = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("*** Error, introduzca una edad valida ***");
				}
				lista.get(i).setEdad(edadNueva);
				dao.update(lista.get(i));
			}
		}

	}

	/**
	 * metodo que modifica el nombre del alumno
	 */
	private static void modificarNombre() {

		ArrayList<Alumno> lista = (ArrayList<Alumno>) dao.getAll();
		String nombre, nombreNuevo;
		do {
			System.out.println("Inserte el nombre del Alumno en el que quiere hacer cambios: ");
			nombre = sc.nextLine();
		} while ("".equals(nombre));

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equals(nombre)) {
				System.out.println("Inserte el nuevo nombre:");
				nombreNuevo = sc.nextLine();
				lista.get(i).setNombre(nombreNuevo);
				dao.update(lista.get(i));
			}
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
	 * Metodo para anadir un nuevo alumno a la array
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

		//ArrayList<Alumno> lista = (ArrayList<Alumno>) dao.getAll();
		System.out.println("***********************************");
		System.out.println("**       Listado de Alumnos      **");
		System.out.println("***********************************");
		System.out.println("**   ID        Nombre  Nº Veces  **");
		
		
		Collections.sort(dao.getAll());
		
		for (Alumno alumno : dao.getAll()) {
			System.out.printf("%6s %14s %2s \n", alumno.getId(),alumno.getNombre(),alumno.getNumVecesLeer());
		}

	}

}
