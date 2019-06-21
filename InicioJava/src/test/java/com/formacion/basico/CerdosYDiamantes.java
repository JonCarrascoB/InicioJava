package com.formacion.basico;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class CerdosYDiamantes {

	@Test
	public void test() {
		

		ArrayList<Iordenable> lista = new ArrayList <Iordenable>();
		
		Cerdo c1 = new Cerdo(500, "Tiberio");
		Cerdo c2 = new Cerdo(300, "Peggy");
		Diamantes d1 = new Diamantes(1000, "rojo");
		Diamantes d2 = new Diamantes(50, "verde");
		
		lista.add(d2);
		lista.add(d1);
		lista.add(c1);
		lista.add(c2);
		
		
		for(Iordenable elemento:lista) {
			
			// diamante.getColor(); aqui no se puede usar si no se ha castreado la clase
			
			if (elemento instanceof Diamantes) {
				Diamantes diamante = (Diamantes)elemento;
				diamante.getColor(); // aqui en cambio si se puede usar, ya que el objeto ya esta castreado
			}
			if (elemento instanceof Cerdo) {
				Cerdo cerdo = (Cerdo)elemento;
				cerdo.getKilos();
			}
		}
		
		Collections.sort(lista, new ComparadorCerdosDiamantes());
		
		assertEquals(d1, lista.get(0));
		assertEquals(c1, lista.get(1));
		assertEquals(c2, lista.get(2));
		assertEquals(d2, lista.get(3));
	}

}
