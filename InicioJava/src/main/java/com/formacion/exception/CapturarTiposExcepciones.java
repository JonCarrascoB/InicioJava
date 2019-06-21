package com.formacion.exception;

import com.formacion.basico.Perro;
import com.formacion.basico.PerroException;

/**
 * Se pueden capturar más de un tipo de excepciones, siempre la ultima en capturar que sea Exception 
 * que es la mas generica
 * @author Curso
 *
 */

public class CapturarTiposExcepciones {
	
	public static void main(String[] args) {
		
		try {
			
			//Perro p = null;  //Para la excepcion NullPointer
			Perro p = new Perro();
			Perro p2 = new Perro();
			
			Perro [] canes = new Perro[2]; //Para la ArrayIndex...
			canes [0] = p;
			canes [1] = p2;
			for (int i = 0; i < 4; i++) {
				System.out.println(canes[i].getNombre());
			}
			
			//p.setEdad(-1); //Para la excepcion PerroException
			//p.toString();
			//System.out.println(p);
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Se ha salido fuera del array");
			
		//} catch (PerroException e) {
			System.out.println("Perro Exception null");
			
		} catch (NullPointerException e) {
			System.out.println("Exception NULL");
			
		} catch (Exception e) {
			System.out.println("Excepcion generica, siempre la ultima");
			e.printStackTrace();
		}
		
	}
	

}
