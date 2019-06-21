package com.formacion.basico;

public class Diamantes implements Iordenable {

	private int kilates;
	private String color;

	public Diamantes(int kilates, String color) {
		super();
		this.kilates = kilates;
		this.color = color;
	}

	public int getKilates() {
		return kilates;
	}

	public void setKilates(int kilates) {
		this.kilates = kilates;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Diamantes [kilates=" + kilates + ", color=" + color + "]";
	}

	@Override
	public int getValor() {

		return this.kilates;
	}

	// int kilates;

}
