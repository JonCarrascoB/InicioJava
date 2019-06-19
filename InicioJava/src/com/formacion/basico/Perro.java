package com.formacion.basico;

import java.io.Serializable;

public class Perro implements Serializable {
	
	 String chip; //packaged o friendly
	
	private static final long serialVersionUID = 1L;
	
	//Atributos privados para construir
	private String nombre;
	private String raza;
	private int edad;
	private boolean vacunado; //'1' esta vacunado '0' no esta vacunado
	
	// constructores
	
	public Perro(String nombre, String raza, int edad, boolean vacunado) {
		this();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.vacunado = vacunado;
	}
	
	public Perro() {
		super();
		nombre = "Sin nombre";
		raza = "Cruce";
		edad = 0;
		vacunado = false;
		}
	
	//getters y setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	/**
	 * Setteamos la edad del perro, en caso de ser < que 0 ponemos un 0
	 * @param edad int valor en años
	 * @throws Exception edad < 0
	 */
	public void setEdad(int edad) throws Exception {
		if (edad < 0) {
			//this.edad = 0;
			//throw new Exception ("La edad debe ser mayor que 0");
			throw new PerroException (PerroException.ERROR_EDAD);
		} else {
			this.edad = edad;		
		}
	}
	public boolean isVacunado(){
		return vacunado;
	}
	public void setVacunado(boolean vacunado) {
			this.vacunado = vacunado;		
	}
	
	public final void ladrar() {
		System.out.println("Guau Guau");
	}
	

	
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", vacunado=" + vacunado + "]";
	}
	
}
