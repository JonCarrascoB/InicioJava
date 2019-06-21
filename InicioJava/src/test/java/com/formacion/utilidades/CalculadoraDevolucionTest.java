package com.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

import com.formacion.utilidades.CalculadoraDevolucion;

public class CalculadoraDevolucionTest {

	@Test (expected = Exception.class)
	public void entregadoMenorImporteException() throws Exception {
		CalculadoraDevolucion.vueltas(100, 2);
	}
	
	@Test (expected = Exception.class)
	public void importeNegativoException() throws Exception {
		CalculadoraDevolucion.vueltas(-100, 2);
	}
	
	@Test (expected = Exception.class)
	public void entregadoNegativoException() throws Exception {
		CalculadoraDevolucion.vueltas(100, -2);
	}
	
	@Test
	public void importeExacto() throws Exception {
		int [] vueltas = CalculadoraDevolucion.vueltas(100, 100);
		
		for (int i = 0; i < CalculadoraDevolucion.BILLETES_MONEDAS.length; i++) {
			assertEquals (0, vueltas[i]);
		}
	}
	
	@Test
	public void importeNoDev() throws Exception {
		
		
		int [] vueltas = CalculadoraDevolucion.vueltas(500, 500);
		assertEquals("500",0,vueltas[0]);
		assertEquals("200",0,vueltas[1]);
		assertEquals("100",0,vueltas[2]);
		assertEquals("50",0,vueltas[3]);
		assertEquals("20",0,vueltas[4]);
		assertEquals("10",0,vueltas[5]);
		assertEquals("5",0,vueltas[6]);
		assertEquals("2",0,vueltas[7]);
		assertEquals("1",0,vueltas[8]);
		assertEquals("50 cent",0,vueltas[9]);
		assertEquals("20 cent",0,vueltas[10]);
		assertEquals("10 cent",0,vueltas[11]);
		assertEquals("5 cent",0,vueltas[12]);
		assertEquals("2 cent",0,vueltas[13]);
		assertEquals("1 cent",0,vueltas[14]);
	}
	
	@Test
	public void importeNoExacto() throws Exception {
		
		
		int [] vueltas = CalculadoraDevolucion.vueltas(500, 501);
		assertEquals("500",0,vueltas[0]);
		assertEquals("200",0,vueltas[1]);
		assertEquals("100",0,vueltas[2]);
		assertEquals("50",0,vueltas[3]);
		assertEquals("20",0,vueltas[4]);
		assertEquals("10",0,vueltas[5]);
		assertEquals("5",0,vueltas[6]);
		assertEquals("2",0,vueltas[7]);
		assertEquals("1",1,vueltas[8]);
		assertEquals("50 cent",0,vueltas[9]);
		assertEquals("20 cent",0,vueltas[10]);
		assertEquals("10 cent",0,vueltas[11]);
		assertEquals("5 cent",0,vueltas[12]);
		assertEquals("2 cent",0,vueltas[13]);
		assertEquals("1 cent",0,vueltas[14]);
	}
	
	@Test
	public void importeNoExactoDecimal() throws Exception {
		
		int [] vueltas = CalculadoraDevolucion.vueltas(438.70f,1000);
		assertEquals("500",1,vueltas[0]);
		assertEquals("200",0,vueltas[1]);
		assertEquals("100",0,vueltas[2]);
		assertEquals("50",1,vueltas[3]);
		assertEquals("20",0,vueltas[4]);
		assertEquals("10",1,vueltas[5]);
		assertEquals("5",0,vueltas[6]);
		assertEquals("2",0,vueltas[7]);
		assertEquals("1",1,vueltas[8]);
		assertEquals("50 cent",0,vueltas[9]);
		assertEquals("20 cent",1,vueltas[10]);
		assertEquals("10 cent",1,vueltas[11]);
		assertEquals("5 cent",0,vueltas[12]);
		assertEquals("2 cent",0,vueltas[13]);
		assertEquals("1 cent",0,vueltas[14]);
	}
	
	@Test
	public void importeNoExactoDecimalUno() throws Exception {
		
		int [] vueltas = CalculadoraDevolucion.vueltas(111.12f,1000);
		assertEquals("500",1,vueltas[0]);
		assertEquals("200",1,vueltas[1]);
		assertEquals("100",1,vueltas[2]);
		assertEquals("50",1,vueltas[3]);
		assertEquals("20",1,vueltas[4]);
		assertEquals("10",1,vueltas[5]);
		assertEquals("5",1,vueltas[6]);
		assertEquals("2",1,vueltas[7]);
		assertEquals("1",1,vueltas[8]);
		assertEquals("50 cent",1,vueltas[9]);
		assertEquals("20 cent",1,vueltas[10]);
		assertEquals("10 cent",1,vueltas[11]);
		assertEquals("5 cent",1,vueltas[12]);
		assertEquals("2 cent",1,vueltas[13]);
		assertEquals("1 cent",1,vueltas[14]);
	}

}
