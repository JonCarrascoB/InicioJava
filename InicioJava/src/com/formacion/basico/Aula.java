package com.formacion.basico;

public class Aula {

	public static void main(String[] args) {
		// Declarar array con nombre alumnos
		String[] alumnos = { "Mounir", "Andoni", "Asier", "Jon C", "Arkaitz", "Aritz", "Manuel", "Eduardo", "Eder I",
				"Eder S", "Gaizka", "Borja", "Veronica", "Jon A", "Jose Luis" };

		int numero = (int) (Math.random() * alumnos.length);
		// System.out.println("El voluntario es: " + alumnos[numero]);
		// forma rápida, sino la larga con el for:

		for (int i = 0; i < alumnos.length; i++) {

			if (numero != i) {
				System.out.println(i + " " + alumnos[i]);
			} else {

				// Mostrar voluntario para leer
				System.out.println(" *** " + alumnos[i]);
			}
		} // end for

	}

}
