package com.formacion.basico;

public class Alumno extends Person implements Comparable<Alumno> {
	
	private int numVecesLeer;

	public Alumno(String nombre, int numVecesLeer) {
		super(nombre);
		this.setNumVecesLeer (numVecesLeer);
	}
	
	public Alumno(String nombre) {
		super(nombre);
		this.numVecesLeer = 0;
	}

	public int getNumVecesLeer() {
		return numVecesLeer;
	}

	public void setNumVecesLeer(int numVecesLeer) {
		this.numVecesLeer = numVecesLeer;
	}
	
	

	@Override
	public String toString() {
		return "Alumno [numVecesLeer=" + numVecesLeer + "]";
	}

	@Override
	public int compareTo(Alumno o) {
		return this.getNumVecesLeer() - this.numVecesLeer;
	}
	
	
	

}
