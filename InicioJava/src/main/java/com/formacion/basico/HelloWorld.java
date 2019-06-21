package com.formacion.basico;
import com.formacion.basico.Empleado;
import com.formacion.basico.Perro;
import com.formacion.basico.PerroPresa;
import com.formacion.basico.Person;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String nombre = "Ander";
		// System.out.println(" Hello " + nombre);

		/*
		 * Person p1 = new Person(); p1.setNombre("Manolo");
		 * System.out.println(p1.getNombre());
		 * 
		 * 
		 * Perro p2 = new Perro("Milu","Golden Terrier",2,false); Perro p3 = new
		 * Perro("Ares", "Gran Danes",10, true); Perro p4 = new Perro("Luna",
		 * "Chigagua",-1,true); Perro p5 = new Perro();
		 * 
		 * 
		 * System.out.println(p2.toString()); System.out.println(p3.toString());
		 * System.out.println(p4.toString()); System.out.println(p5.toString());
		 * 
		 * PerroPresa buba = new PerroPresa(); buba.setNombre("Buba");
		 * System.out.println(buba.toString()); buba.atacar();
		 */

		// jugadores
		Empleado emp1 = new Empleado("Luka Modric", 34, 'h', 874018.08f);
		Empleado emp2 = new Empleado("David de Gea", 29, 'h', 971131.25f);
		Empleado emp3 = new Empleado("Mohamed Salah", 27, 'h', 682157.75f);
		Empleado emp4 = new Empleado("Laure Bulleau", 21, 'm', 60000.08f);

		System.out.println("el empleado: " + emp1.getNombre() + " , " + emp1.getEdad() + " , " + emp1.getSexo()
				+ " y un salario de " + emp1.getSalario());
		System.out.println("el empleado: " + emp2.getNombre() + " , " + emp2.getEdad() + " , " + emp2.getSexo()
				+ " y un salario de " + emp2.getSalario());
		System.out.println("el empleado: " + emp3.getNombre() + " , " + emp3.getEdad() + " , " + emp3.getSexo()
				+ " y un salario de " + emp3.getSalario());
		System.out.println("el empleado: " + emp4.getNombre() + " , " + emp4.getEdad() + " , " + emp4.getSexo()
				+ " y un salario de " + emp4.getSalario());
	}

}
