package com.formacion.basico;

public class Cerdo implements Iordenable {

	private int kilos;
	private String nombre;

	public Cerdo(int kilos, String nombre) {
		super();
		this.kilos = kilos;
		this.nombre = nombre;
	}

	public int getKilos() {
		return kilos;
	}

	public void setKilos(int kilos) {
		this.kilos = kilos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cerdo [kilos=" + kilos + ", nombre=" + nombre + "]";
	}

	@Override
	public int getValor() {
		
		return this.kilos;
	}

	// int kilos;
}
