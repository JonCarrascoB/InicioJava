package com.formacion.basico.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.formacion.basico.Alumno;

public class DAOAlumnoVolFicheros implements IPersistible<Alumno>, Serializable {

	private static DAOAlumnoVolFicheros INSTANCE;
	private ArrayList<Alumno> lista;
	String ficheroAlumnos = "C:\\1713\\eclipse-workspace\\InicioJava\\InicioJava\\alumnos.txt";
	ObjectOutputStream oos;
	ObjectInputStream ois;
	FileReader fr;
	FileWriter fw;
	BufferedWriter bw;
	BufferedReader br;
	int id;

	/**
	 * encargado de devolver solo un objeto, patron SINGLETON
	 * 
	 * @return
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static synchronized DAOAlumnoVolFicheros getInstance() throws FileNotFoundException, IOException {

		if (INSTANCE == null) {
			INSTANCE = new DAOAlumnoVolFicheros();
		}
		return INSTANCE;
	}

	/**
	 * privado para que nadie pueda crear objetos
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private DAOAlumnoVolFicheros() {

		super();
		this.lista = new ArrayList<Alumno>();
		
		desSelizarLista();

	}

	private void desSelizarLista() {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheroAlumnos))) {

			lista = (ArrayList<Alumno>) ois.readObject();

		} catch (Exception e) {
			// e.printStackTrace(); EOF
		}

	}

	private void serializarLista() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficheroAlumnos))) {
			oos.writeObject(lista);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

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
			if (resul) {
				serializarLista();
			}

		}
		return resul;
	}

	@Override
	public boolean delete(int id) {

		boolean resul = false;
		Alumno a = getById(id);
		resul = lista.remove(a);
		if (resul) {
			serializarLista();
		}
		return resul;
	}

	@Override
	public boolean update(Alumno alumno) {
		boolean resul = false;

		if (alumno != null) {

			for (Alumno a : lista) {

				if (a.getId() == alumno.getId()) {
					// modificar
					int pos = lista.indexOf(a);
					lista.set(pos, alumno);
					resul = true;
					serializarLista();
					break;
				}
			}
		}

		return resul;
	}

}
