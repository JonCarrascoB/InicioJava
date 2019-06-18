package com.ipartek.formacion.colecciones;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		// String [] paises = new String[3]; antes

		ArrayList<String> paises = new ArrayList<String>();

		assertTrue(paises.isEmpty());

		paises.add("Barakaldo");
		paises.add("EEUU");
		paises.add("Corea la buena");

		assertFalse(paises.isEmpty());

		// length o size
		assertEquals(3, paises.size());

		// Insertar "Kuala Lumpur" entre Barakaldo y EEUU
		paises.add(1, "Kuala Lumpur");

		assertEquals("Barakaldo", paises.get(0));
		assertEquals("Kuala Lumpur", paises.get(1));
		assertEquals("EEUU", paises.get(2));

		// Insertar "Barakaldo" de nuevo para comprobar que se pueden duplicar datos
		paises.add("Barakaldo");
		assertEquals(5, paises.size());

		assertEquals("Barakaldo", paises.get(5));

		int cont = 0;
		Iterator<String> it = paises.iterator();
		while (it.hasNext()) {
			String pais = it.next();
			if ("Barakaldo".equals(pais)) {
				cont++;
			}
		}
		assertEquals(2, cont);

		// probar a eliminar "Corea de la buena"

		assertTrue(paises.remove("Corea de la buena"));
		assertFalse(paises.remove("Corea de la buena"));

		// usar contains para saber si existe "Barakaldo" y "Corea la buena"

		assertTrue(paises.contains("Barakaldo"));
		assertFalse(paises.contains("Corea la buena"));

		// probar a eliminar todo
		paises.clear();
		assertTrue(paises.isEmpty());

		// TODO mirar como ordenar todo alfabeticamente
		paises.add("EEUU");
		paises.add("Barakaldo");
		paises.add("Corea la buena");


		// TODO sort para ordenar alfabeticamente
		Collections.sort(paises);
		assertEquals("Barakaldo", paises.get(0));
		assertEquals("Corea la buena", paises.get(1));
		assertEquals("EEUU", paises.get(2));
		
		Collections.reverse(paises);
		assertEquals("EEUU", paises.get(2));
		assertEquals("Corea la buena", paises.get(1));
		assertEquals("Barakaldo", paises.get(0));
	}

}
