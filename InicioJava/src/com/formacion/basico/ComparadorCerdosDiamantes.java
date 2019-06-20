package com.formacion.basico;

import java.util.Comparator;

public class ComparadorCerdosDiamantes implements Comparator <Iordenable> {

	@Override
	public int compare(Iordenable o1, Iordenable o2) {
		
		return o2.getValor()-o1.getValor();
	}

}
