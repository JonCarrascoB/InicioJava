package com.formacion.basico.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.formacion.basico.Alumno;

public class DAOAlumnoVolFicheros implements IPersistible<Alumno> {

	private static DAOAlumnoVolFicheros INSTANCE;
	private ArrayList<Alumno> lista;
	String ficheroAlumnos = "C:\\1713\\eclipse-workspace\\InicioJava\\InicioJava\\alumnos.txt";
	FileReader fr;
	FileWriter fw;
	BufferedWriter bw;
	BufferedReader br;

	/**
	 * encargado de devolver solo un objeto, patron SINGLETON
	 * 
	 * @return
	 */
	public static synchronized DAOAlumnoVolFicheros getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new DAOAlumnoVolFicheros();
		}
		return INSTANCE;
	}

	/**
	 * privado para que nadie pueda crear objetos
	 */
	private DAOAlumnoVolFicheros() {

		super();
		this.lista = new ArrayList<Alumno>();

		// lista.add(new Alumno(1, "Mounir"));
		// lista.add(new Alumno(2, "Andoni"));
		// lista.add(new Alumno(3, "Asier"));
		// lista.add(new Alumno(4, "Jon C"));
	}

	public List<Alumno> getAll() throws IOException {

		// debe leer la lista que se encuentra en el fichero
		fr = new FileReader(ficheroAlumnos);
		br = new BufferedReader(fr);
		String linea;
		while ((linea = br.readLine()) != null) {
			String[] alumno =  linea.split(";");
			int id = Integer.parseInt(alumno[0]);
			Alumno a = new Alumno(id,alumno[1]);
			lista.add(a);
		}
		

		return lista;
	}

	@Override
	public Alumno getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Alumno a) throws IOException {
		fw = new FileWriter (ficheroAlumnos);
		bw = new BufferedWriter(fw);
		bw.write(a.getId());
		bw.write(",");
		bw.write(a.getNombre());
		bw.write(",");
		bw.write(a.getNumVecesLeer());
		return lista.add(a);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Alumno pojo) {
		// TODO Auto-generated method stub
		return false;
	}

}
