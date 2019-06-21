package com.formacion.exception;

import com.formacion.basico.Perro;

public class PropagacionExceptions {

	public static void main(String[] args) {
		System.out.println("Comienza Main");
		metodoA();
		
		System.out.println("Finaliza Main");
	}
	
	private static void metodoA() {
		System.out.println("Comienza metodo A");
		Perro p = new Perro();
		try {
			p.setEdad(-1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p);
		
		System.out.println("Finaliza metodo A");
	}
	
	

}
