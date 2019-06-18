package com.formacion.basico;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class YoutubeTest {

	Youtube youtube;
	static final String TITULO = "AC/DC";
	static final String CODIGO = "7452pl74kñ9";
	static final int REPRODUCCIONES = 789000;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		youtube = new Youtube(TITULO, CODIGO);
	}

	@After
	public void tearDown() throws Exception {
		youtube = null;
	}

	// constructor
	//(expected = Exception.class)
	@Test
	public void testYoutube() throws Exception {

		assertEquals(TITULO, youtube.getTitulo());
		assertEquals(CODIGO, youtube.getCodigo());
		assertEquals(0, youtube.getReproduciones());
		
		try {
		youtube = new Youtube (null, null);
		fail ("Constructor con Nulls");
		} catch (Exception e) {
			assertTrue(true);
		}
		

		// excepcion codigo exactamente 11
		try {
			Youtube youtube = new Youtube(TITULO, "11");
			fail("El codigo no tiene exactamente 11 caracteres");
		} catch (Exception e) {
			assertTrue(true);
		}

		// excepcion titulo menor al minimo de dos caracteres
		try {
			Youtube youtube = new Youtube(" ", CODIGO);
			fail("Titulo incorrecto");
		} catch (Exception e) {
			assertTrue(true);
		}

	}

	// getters y setters
	@Test
	public void testGetTitulo() {

		assertEquals(TITULO, youtube.getTitulo());
	}

	@Test
	public void testSetTitulo() throws Exception {
		
		//TODO probar los 5 casos
		youtube.setTitulo("");

		try {
			youtube.setTitulo("travis");
		} catch (Exception e) {
			throw new Exception("Titulo debe ser entre " + Youtube.LONGITUD_MIN_TITULO + " y " + Youtube.LONGITUD_MAX_TITULO);
		}
		assertEquals("travis", youtube.getTitulo());
	}

	@Test
	public void testGetCodigo() {

		assertEquals(CODIGO, youtube.getCodigo());
	}

	@Test 
	public void testSetCodigo() throws Exception {

		try {
			youtube.setCodigo("rtca456io74");
		} catch (Exception e) {
			throw new Exception("Longitud de codigo debe ser " + Youtube.LONGITUD_CODIGO);
		}
		assertEquals("rtca456io74", youtube.getCodigo());
	}

	@Test
	public void testGetReproduciones() {

		assertEquals(REPRODUCCIONES, youtube.getReproduciones());
	}

	@Test
	public void testSetReproduciones() {

		youtube.setReproduciones(789);
		assertEquals(789, youtube.getReproduciones());
		
		youtube.setReproduciones(-56);
		assertEquals(-56, youtube.getReproduciones());

	}

	@Ignore
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUrl() {
		assertEquals(Youtube.URL+CODIGO,Youtube.URL+youtube.getCodigo());
		
	}

}
