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
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private DAOAlumnoVolFicheros() throws FileNotFoundException, IOException {

		super();
		this.lista = new ArrayList<Alumno>();
		serializarLista();
		desSelizarLista();
		
		oos.writeObject(new Alumno(1, "Mounir"));
		oos.writeObject(new Alumno(2, "Andoni"));
		oos.writeObject(new Alumno(3, "Asier"));
		oos.writeObject(new Alumno(4, "Jon C"));
		oos.flush();
		
		oos.close();
	}

	private void desSelizarLista() {
		
		try {
			lista = (ArrayList<Alumno>) ois.readObject();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	private void serializarLista() {
		oos= new ObjectOutputStream(new FileOutputStream(ficheroAlumnos));
		oos = writeObject(lista);
		oos.flush();
		oos.close();
		
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
	public boolean insert(Alumno a) {
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
	public boolean update(Alumno a) {
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
