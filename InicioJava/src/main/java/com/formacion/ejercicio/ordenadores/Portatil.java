package com.formacion.ejercicio.ordenadores;

import java.io.Serializable;

public class Portatil extends Ordenador implements Serializable {

	private String tamanyoPantalla;
	private int bateria;

	// Constructores
	public Portatil() {
		super();
		this.tamanyoPantalla = "Sin pantalla";
		this.bateria = 0;

	}

	public Portatil(String modelo, String marca, String placaBase, float cpu, int arquitectura, String tamanyoPantalla,
			int bateria) throws Exception {
		super(modelo, marca, placaBase, cpu, arquitectura);
		this.setTamanyoPantalla(tamanyoPantalla);
		this.setBateria(bateria);
	}

	// Setters y Getters
	public String getTamanyoPantalla() {
		return tamanyoPantalla;
	}

	public void setTamanyoPantalla(String tamanyoPantalla) {
		this.tamanyoPantalla = tamanyoPantalla;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) throws Exception {
		
		if(bateria < 20) {
			throw new Exception("Bateria baja, cargalo por favor");
		}
		this.bateria = bateria;
	}

	@Override
	public String toString() {
		return super.toString() + "Portatil [tamanyoPantalla=" + tamanyoPantalla + ", bateria=" + bateria + "]";
	}

}
