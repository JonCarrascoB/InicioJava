package com.formacion.ejercicio.ordenadores;

import java.io.Serializable;

public class Ordenador implements Comparable<Ordenador>, Serializable {
	
	private final int ARQUITECTURA_32 = 32;
	private final int ARQUITECTURA_64 = 64;

	//Atributos
	
	private String modelo;
	private String marca;
	private String placaBase;
	private float cpu;
	private int arquitectura;
	
	
	//Constructores
	public Ordenador(String modelo, String marca, String placaBase, float cpu, int arquitectura) {
		this();
		this.setModelo(modelo);
		this.setMarca(marca);
		this.setPlacaBase(placaBase);
		this.setCpu(cpu);
		this.setArquitectura(arquitectura);
	}
	
	public Ordenador() {
		super();
		this.modelo = "nuevo";
		this.marca = "sin marca";
		this.placaBase = "vacio";
		this.cpu = 256;
		this.arquitectura = 32;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getPlacaBase() {
		return placaBase;
	}

	public void setPlacaBase(String placaBase) {
		this.placaBase = placaBase;
	}


	public float getCpu() {
		return cpu;
	}


	public void setCpu(float cpu) {
		this.cpu = cpu;
	}


	public int getArquitectura() {
		return arquitectura;
	}


	public void setArquitectura(int arquitectura) {
		this.arquitectura = arquitectura;
	}


	@Override
	public String toString() {
		return "Ordenador [modelo=" + modelo + ", marca=" + marca + ", placaBase=" + placaBase + ", cpu=" + cpu
				+ ", arquitectura=" + arquitectura + "]";
	}

	@Override
	public int compareTo(Ordenador o) {
		return (int) (o.cpu - this.cpu);
	}

}
