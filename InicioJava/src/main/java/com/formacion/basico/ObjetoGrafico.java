package com.formacion.basico;

public abstract class ObjetoGrafico {
	
	//atributos
	
	//constructores
	
	//getters y setters

	public void mover(int x, int y) {
		System.out.println("Movemos el objeto a su nueva posicion");
	}
	
	public abstract void dibujar(String color); // prototipo
}
