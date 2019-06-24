package com.formacion.basico.modelo;

import java.util.ArrayList;
import java.util.List;

import com.formacion.basico.Alumno;

public class DAOAlumnoArrayList implements IPersistible<Alumno> {

	private static DAOAlumnoArrayList INSTANCE;
	private ArrayList<Alumno> lista;

	/**
	 * encargado de devolver solo un objeto, patron SINGLETON
	 * 
	 * @return
	 */
	public static synchronized DAOAlumnoArrayList getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new DAOAlumnoArrayList();
		}
		return INSTANCE;
	}

	/**
	 * privado para que nadie pueda crear objetos
	 */
	private DAOAlumnoArrayList() {
		super();
		this.lista = new ArrayList<Alumno>();
		mockAlumnos();

	}

	private void mockAlumnos() {

		lista.add(new Alumno(1, "Mounir"));
		lista.add(new Alumno(2, "Andoni"));
		lista.add(new Alumno(3, "Asier"));
		lista.add(new Alumno(4, "Jon C"));
		lista.add(new Alumno(5, "Arkaitz"));
		lista.add(new Alumno(6, "Aritz"));
		lista.add(new Alumno(7, "Manuel"));
		lista.add(new Alumno(8, "Eduardo"));
		lista.add(new Alumno(9, "Eder I"));
		lista.add(new Alumno(10, "Eder S"));
		lista.add(new Alumno(11, "Gaizka"));
		lista.add(new Alumno(12, "Borja"));
		lista.add(new Alumno(13, "Veronica"));
		lista.add(new Alumno(14, "Jon A"));
		lista.add(new Alumno(15, "Jose Luis"));
	}

	@Override
	public List<Alumno> getAll() {
		return lista;
	}

	@Override
	public Alumno getById(int id) {
		Alumno resul = null;
		for (Alumno a : lista) {
			if (a.getId() == id) {
				resul = a;
				break;
			}
		}
		return resul;
	}

	@Override
	public boolean insert(Alumno alumno) {
		boolean resul = false;
		if (alumno != null) {
			resul = lista.add(alumno);
		}
		return resul;
	}

	@Override
	public boolean delete(int id) {

		Alumno resul = getById(id);
		return lista.remove(resul);
	}

	@Override
	public boolean update(Alumno alumno) {
		boolean resul = false;

		if (alumno != null) {
			for (Alumno a : lista) {
				if (a.getId() == alumno.getId()) {
					int pos = lista.indexOf(a);
					lista.set(pos, alumno);
					resul = true;
					break;
				}
			}
		}

		return resul;
	}

}
