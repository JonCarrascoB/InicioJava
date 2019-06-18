package com.formacion.basico;

public class Person {

	// Crear un constructor donde la persona por defecto el nombre es anonimo, edad
	// 18, altura 0, peso 0, ojos marrones, sexo i
	// Sobre cargar el constructor para tener una persona indicando el nombre la
	// edad y el sexo

	// Atributos
	private String nombre;
	private int edad;
	private float altura; // 1.70cm
	private float peso; // 89.8 Kg
	private String ojos; // color
	private char sexo; // 'h' hombre, 'm' mujer,'i' indefinido

	// Constructores
	public Person() {
		super(); // java.lang.object
		this.nombre = "anonimo";
		this.edad = 18;
		this.altura = 0;
		this.peso = 0;
		this.ojos = "marrones";
		this.sexo = 'i';
	}

	public Person(String nombre, int edad, char sexo) {
		this();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null) {
			this.nombre = "sin nombre";
		} else {
			this.nombre = nombre;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getOjos() {
		return ojos;
	}

	public void setOjos(String ojos) {
		this.ojos = ojos;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String saludar() {
		return "Hola me llamo " + nombre;
	}

	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", ojos="
				+ ojos + ", sexo=" + sexo + "]";
	}

}
