package com.formacion.basico;

import java.util.Date;

public class Empleado extends Person {

	public final float SALARIO_MINIMO = 937.05f;

	private int numeroContribuyente;
	private int numeroEmpleado;
	private Date fechaContrato;
	private float salario;

	// se sobrecargara con el salario

	public Empleado() {
		super();
		this.numeroContribuyente = 0;
		this.numeroEmpleado = 0;
		this.fechaContrato = new Date();
		this.salario = SALARIO_MINIMO;
	}

	public Empleado(String nombre, int edad, char sexo, float salario) {
		super(nombre, edad, sexo);
		this.numeroContribuyente = 0;
		this.numeroEmpleado = 0;
		this.fechaContrato = new Date();
		this.salario = salario;

	}

	// getters y Setters
	public int getNumeroContribuyente() {
		return numeroContribuyente;
	}

	public void setNumeroContribuyente(int numeroContribuyente) {
		this.numeroContribuyente = numeroContribuyente;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {

		return super.toString() + "Empleado [numeroContribuyente=" + numeroContribuyente + ", numeroEmpleado="
				+ numeroEmpleado + ", fechaContrato=" + fechaContrato + ", salario=" + salario + "]";
	}

}
