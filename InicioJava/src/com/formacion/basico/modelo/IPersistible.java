package com.formacion.basico.modelo;

import java.util.ArrayList;
import java.util.List;

import com.formacion.basico.Alumno;

/**
 * Operaciones basicas de CRUD para POJOs
 * @author Curso
 *
 */
public interface IPersistible <P> {
	
	//Operaciones basicas para leer
	
	List<P> getAll();
	
	P getById(int id);
	
	//Operaciones basicas para crear
	
	boolean insert(P pojo);
	
	//Operaciones basicas para eliminar
	
	boolean delete(int id);
	
	//Operaciones basicas para modificar
	
	boolean update(P pojo);

}
