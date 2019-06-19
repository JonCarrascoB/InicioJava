package com.formacion.basico;

import java.util.ArrayList;

public class Aula {

	public static void main(String[] args) {
		// Declarar arrayList de la clase Person metiendo a los alumnos
		ArrayList<Person> alumnos = new ArrayList<Person>();
		alumnos.add(new Person("Mounir"));
		alumnos.add(new Person("Andoni"));
		alumnos.add(new Person("Asier"));
		alumnos.add(new Person("Jon C"));
		alumnos.add(new Person("Arkaitz"));
		alumnos.add(new Person("Aritz"));
		alumnos.add(new Person("Manuel"));
		alumnos.add(new Person("Eduardo"));
		alumnos.add(new Person("Eder I"));
		alumnos.add(new Person("Eder S"));
		alumnos.add(new Person("Gaizka"));
		alumnos.add(new Person("Borja"));
		alumnos.add(new Person("Veronica"));
		alumnos.add(new Person("Jon A"));
		alumnos.add(new Person("Jose Luis"));
		
		
		//Declaramos el array de alumnos
		//String[] alumnos = { "Mounir", "Andoni", "Asier", "Jon C", "Arkaitz", "Aritz", "Manuel", "Eduardo", "Eder I",
				//"Eder S", "Gaizka", "Borja", "Veronica", "Jon A", "Jose Luis" };

		int numero = (int) (Math.random() * alumnos.size());
		
		System.out.println("El voluntario es " + alumnos.get(numero).getNombre());
		
		// System.out.println("El voluntario es: " + alumnos[numero]);
		// forma rápida, sino la larga con el for:

		for (int i = 0; i < alumnos.size(); i++) {

			if (numero != i) {
				System.out.println(i + " " + alumnos.get(i).getNombre());
			} else {

				// Mostrar voluntario para leer
				System.out.println(" *** " + alumnos.get(i)); //String
			}
		} // end for

	}

}
