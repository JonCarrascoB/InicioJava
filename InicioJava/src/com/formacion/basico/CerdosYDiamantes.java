package com.formacion.basico;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CerdosYDiamantes {

	@Test
	public void test() {
		

		ArrayList<Iordenable> lista = new ArrayList <Iordenable>();
		
		Cerdo c = new Cerdo();
		Diamantes d = new Diamantes();
		
		lista.add(c);
		lista.add(d);
		
		
		for(Iordenable elemento:lista) {
			if (elemento instanceof Diamantes) {
				Diamantes diamante = (Diamantes)elemento;
			}
			if (elemento instanceof Cerdo) {
				Cerdo cerdo = (Cerdo)elemento;
			}
		}
	}

}
