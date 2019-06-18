package com.formacion.basico;

import java.util.ArrayList;

public class Aula {

	public static void main(String[] args) {
		// Declarar arrayList de la clase Person metiendo a los alumnos
		ArrayList<Person> alumnos = new ArrayList<Person>();
		Person p1 = new Person ("Mounir", 0,'h');
		Person p2 = new Person ("Andoni", 0,'h');
		Person p3 = new Person ("Asier", 0,'h');
		Person p4 = new Person ("Jon C", 0,'h');
		Person p5 = new Person ("Arkaitz", 0,'h');
		Person p6 = new Person ("Aritz", 0,'h');
		Person p7 = new Person ("Manuel", 0,'h');
		Person p8 = new Person ("Eduardo", 0,'h');
		Person p9 = new Person ("Eder I", 0,'h');
		Person p10 = new Person ("Eder S", 0,'h');
		Person p11 = new Person ("Gaizka", 0,'h');
		Person p12 = new Person ("Borja", 0,'h');
		Person p13 = new Person ("Veronica", 0,'h');
		Person p14 = new Person ("Jon A", 0,'h');
		Person p15 = new Person ("Jose Luis", 0,'h');
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
		
		
		
		//Declaramos el array de alumnos
		//String[] alumnos = { "Mounir", "Andoni", "Asier", "Jon C", "Arkaitz", "Aritz", "Manuel", "Eduardo", "Eder I",
				//"Eder S", "Gaizka", "Borja", "Veronica", "Jon A", "Jose Luis" };

		int numero = (int) (Math.random() * alumnos.size());
		// System.out.println("El voluntario es: " + alumnos[numero]);
		// forma rápida, sino la larga con el for:

		for (int i = 0; i < alumnos.size(); i++) {

			if (numero != i) {
				System.out.println(i + " " + alumnos.get(i));
			} else {

				// Mostrar voluntario para leer
				System.out.println(" *** " + alumnos.get(i));
			}
		} // end for

	}

}
