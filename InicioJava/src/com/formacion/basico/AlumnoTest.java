package com.formacion.basico;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class AlumnoTest {

	@Test
	public void testSortNumVecesLeer() {

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

		Alumno a = new Alumno("Pepe");
		a.setNumVecesLeer(0);
		alumnos.add(a);

		Alumno b = new Alumno("Manoli");
		b.setNumVecesLeer(2);
		alumnos.add(b);

		Alumno c = new Alumno("Antton");
		c.setNumVecesLeer(20);
		alumnos.add(c);

		// ordenar
		Collections.sort(alumnos);

		assertEquals("Antton", alumnos.get(0).getNombre());
		assertEquals("Manoli", alumnos.get(1).getNombre());
		assertEquals("Pepe", alumnos.get(2).getNombre());

	}

	@Test
	public void testSortNombre() {

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

		Alumno a = new Alumno("Zapatero");
		a.setNumVecesLeer(0);
		alumnos.add(a);

		Alumno b = new Alumno("Anastasia");
		b.setNumVecesLeer(2);
		alumnos.add(b);

		Alumno c = new Alumno("Burrito");
		c.setNumVecesLeer(20);
		alumnos.add(c);

		// ordenar
		Collections.sort(alumnos, new ComparatorNombre());

		assertEquals("Anastasia", alumnos.get(0).getNombre());
		assertEquals("Burrito", alumnos.get(1).getNombre());
		assertEquals("Zapatero", alumnos.get(2).getNombre());

	}

}
