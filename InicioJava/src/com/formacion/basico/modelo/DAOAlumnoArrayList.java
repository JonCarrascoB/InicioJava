package com.formacion.basico.modelo;

import java.util.ArrayList;
import java.util.List;

import com.formacion.basico.Alumno;

public class DAOAlumnoArrayList implements IPersistible<Alumno> {

	private ArrayList<Alumno> lista;

	public DAOAlumnoArrayList() {
		super();
		this.lista = new ArrayList<Alumno>();
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
	
		return lista.add(alumno);
		
	}

	@Override
	public boolean delete(int id) {
		Alumno resul = null;
		for(Alumno a: lista) {
			if(a.getId() == id) {
				resul = a;
				break;
			}
		}
		return lista.remove(resul);
	}

	@Override
	public boolean update(Alumno alumno) {
		
		lista.remove(alumno);
		return lista.add(alumno);
	}

}
