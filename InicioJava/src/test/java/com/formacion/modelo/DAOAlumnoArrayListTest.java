package com.formacion.modelo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.formacion.basico.Alumno;
import com.formacion.basico.modelo.DAOAlumnoArrayList;

public class DAOAlumnoArrayListTest {
	
	static DAOAlumnoArrayList dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		dao = DAOAlumnoArrayList.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		
		//borrar objetos de la lista
		for (int i = 0; i < dao.getAll().size(); i++) {
			dao.delete(dao.getAll().get(i).getId());
		}
		dao = null;
	}

	@Test
	public void testGetInstance() {
		
		assertNotNull(dao);
	}

	@Test
	public void testGetAll() {
		
		assertEquals(0, dao.getAll().size());
		
		dao.insert(new Alumno(1, ""));
		dao.insert(new Alumno(2, ""));
		assertEquals(2, dao.getAll().size());
	}

	@Test
	public void testGetById() {
		
		Alumno alumno = new Alumno(1, "");
		dao.insert(alumno);
		assertEquals(alumno, dao.getById(1));
		
		assertNull(dao.getById(-1));
		
	}

	@Test
	public void testInsert() {
		
		Alumno alumno = new Alumno(1, "");
		assertTrue(dao.insert(alumno));
		
		assertFalse(dao.insert(null));
		
		
		
	}

	@Test
	public void testDelete() {
		assertFalse (dao.delete(1));
		
		Alumno alumno = new Alumno(1, "");
		assertTrue(dao.insert(alumno));
		assertTrue(dao.delete(1));
	}

	@Test
	public void testUpdate() {
		Alumno alumno = new Alumno(1, "Manolo");
		dao.insert(alumno);
		
		alumno.setNombre("Manola");
		assertTrue(dao.update(alumno));
		assertEquals ("Manola", dao.getById(1).getNombre());
		
		assertFalse(dao.update(null));
		assertFalse("No se puede modificar porque no existe", dao.update(new Alumno(-1, "")));
	}

}
