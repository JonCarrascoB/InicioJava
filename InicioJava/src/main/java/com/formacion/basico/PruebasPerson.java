package com.formacion.basico;
import java.text.DecimalFormat;

import com.formacion.basico.Empleado;
import com.formacion.basico.Person;

public class PruebasPerson {

	public static void main(String[] args) {

		/*
		 * Person p = new Person(); System.out.println(p.toString());
		 * 
		 * Person p1 = new Person("Pepe", 23, 'h'); System.out.println(p1);
		 * 
		 * Empleado e = new Empleado(); System.out.println(e);
		 */

		Empleado e1 = new Empleado("Luka Modric", 34, 'h', 874018.08f);
		Empleado e2 = new Empleado("David de Gea", 29, 'h', 971131.25f);
		Empleado e3 = new Empleado("Mohamed Salah", 27, 'h', 682157.75f);
		Empleado e4 = new Empleado("Laure Bulleau", 21, 'm', 60000.08f);

		/*
		 * System.out.println(e1); System.out.println(e2); System.out.println(e3);
		 * System.out.println(e4);
		 */

		// si se crea en forma de array
		Empleado[] futbolistas = new Empleado[4];
		// se rellena el array
		futbolistas[0] = e1;
		futbolistas[1] = e2;
		futbolistas[2] = e3;
		futbolistas[3] = e4;

		for (int i = 0; i < futbolistas.length; i++) {
			System.out.println((i + 1) + ". " + futbolistas[i].getNombre() + " con salario de "
					+ futbolistas[i].getSalario() + " euros.");
		}
		
		Empleado emp = null; //declarar fuera del for
		DecimalFormat dc = new DecimalFormat("##,###,###.## $");
		
		for (int i = 0; i < futbolistas.length; i++) {
			emp = futbolistas[i];
			System.out.println((i + 1) + ". " + emp.getNombre() + " con salario de "
					+ dc.format(emp.getSalario()));
		}
		
		//y con un foreach
		for (Empleado empleado : futbolistas) {
			System.out.println(empleado);
		}

	}

}
