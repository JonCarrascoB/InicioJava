package com.formacion.ejercicio.ordenadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class MenuOrdenador {

	static final int OPCION_CREAR = 1;
	static final int OPCION_RESUMEN = 2;
	static final int OPCION_SALIR = 3;

	static final int OPCION_PORTATIL = 1;
	static final int OPCION_SOBREMESA = 2;
	static final int OPCION_VOLVER = 3;

	static Scanner sc;
	static int opcion;
	static ArrayList<Ordenador> ordenadores = new ArrayList<Ordenador>();

	public static void main(String[] args) throws Exception {

		sc = new Scanner(System.in);
		do {
			dibujarMenu();
		} while (opcion != OPCION_SALIR);

	}

	private static void dibujarMenu() throws Exception {
		System.out.println("");
		System.out.println("*******************************");
		System.out.println("**   Crea tu ordenador       **");
		System.out.println("**                           **");
		System.out.println("**  Eliga una opcion:        **");
		System.out.println("**  1. Crear un ordenador    **");
		System.out.println("**  2. Resumen de creados    **");
		System.out.println("**  3. Salir                 **");
		System.out.println("*******************************");
		System.out.println("");

		try {
			opcion = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Inserte una de las opciones del menu, por favor");
			dibujarMenu();
		}
		activarOpcion(opcion);

	}

	private static void activarOpcion(int opcion2) throws Exception {
		switch (opcion) {
		case OPCION_CREAR:
			crearOrdenador();
			break;
		case OPCION_RESUMEN:
			resumenCreados();
			break;
		case OPCION_SALIR:
			pedirEscritura();
			System.out.println("Gracias por crear su ordenador con nosotros, ADIOS");
			break;
		}

	}

	private static void pedirEscritura() {

		System.out.println("Quiere usted que se escriba el resumen, responda Si o No");
		String respuesta = sc.nextLine();
		if(respuesta.equals("Si")) {
			grabarDatos();
		}
		
	}

	private static void grabarDatos() {
		// TODO Auto-generated method stub
		
	}

	private static void resumenCreados() {

		System.out.println("**********************************************************************************");
		System.out.println("**                Lista de ordenadores creados                                  **");
		System.out.println("**********************************************************************************");
		System.out.println("** Modelo   Marca   Placa Base   CPU   Arquitectura   Tamaño Pantalla   Bateria **");

		// Collection.sort(ordenadores);

		for (Ordenador elemento : ordenadores) {
			if (elemento instanceof Ordenador) {
				Ordenador ordenador = (Ordenador) elemento;
				System.out.printf("%4s %13s %21s %34s %40s %55s %73s \n", ordenador.getModelo(), ordenador.getMarca(),
						ordenador.getPlacaBase(), ordenador.getCpu(), ordenador.getArquitectura());
			}
			if (elemento instanceof Portatil) {
				Portatil portatil = (Portatil) elemento;
				System.out.printf("%4s %13s %21s %34s %40s %55s %73s \n", portatil.getModelo(), portatil.getMarca(),
						portatil.getPlacaBase(), portatil.getCpu(), portatil.getArquitectura(),
						portatil.getTamanyoPantalla(), portatil.getBateria());
			}

		}

	}

	private static void crearOrdenador() throws Exception {

		System.out.println("Que quieres crear: ");
		System.out.println("1. Crear Portatil");
		System.out.println("2. Crear Ordenador de Sobremesa");
		System.out.println("3. Volver");

		try {
			opcion = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Inserte una de las opciones del menu, por favor");
			crearOrdenador();
		}

		switch (opcion) {
		case OPCION_PORTATIL:
			crearPortatil();
			break;
		case OPCION_SOBREMESA:
			crearSobremesa();
			break;
		case OPCION_VOLVER:
			break;
		}

	}

	private static void crearSobremesa() {
		System.out.println("Introduzca el modelo del ordenador: ");
		String nombre = sc.nextLine();
		System.out.println("Introduzca la marca del ordenador: ");
		String marca = sc.nextLine();
		System.out.println("Introduzca la placa base: ");
		String placaBase = sc.nextLine();
		System.out.println("Introduzca el valor de la CPU: ");
		float cpu = Float.parseFloat(sc.nextLine());
		System.out.println("Introduzca la arquitectura: ");
		int arquitectura = Integer.parseInt(sc.nextLine());
		Ordenador o = new Ordenador(nombre, marca, placaBase, cpu, arquitectura);
		ordenadores.add(o);

	}

	private static void crearPortatil() throws Exception {
		System.out.println("Introduzca el modelo del ordenador: ");
		String modelo = sc.nextLine();
		System.out.println("Introduzca la marca del ordenador: ");
		String marca = sc.nextLine();
		System.out.println("Introduzca la placa base: ");
		String placaBase = sc.nextLine();
		System.out.println("Introduzca el valor de la CPU: ");
		float cpu = Float.parseFloat(sc.nextLine());
		System.out.println("Introduzca la arquitectura: ");
		int arquitectura = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca el tamanyo de pantalla: ");
		String tamanyo = sc.nextLine();
		System.out.println("Introduzca la bateria: ");
		int bateria = Integer.parseInt(sc.nextLine());
		Portatil p = new Portatil(modelo, marca, placaBase, cpu, arquitectura, tamanyo, bateria);
		ordenadores.add(p);
	}

}
