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
	
	/**
	 * Listado de P
	 * @return List<p>, si no hay datos lista inacializada
	 */
	List<P> getAll();
	
	/**
	 * Recupera P por su identificador
	 * @param id int identificador
	 * @return P, si no existe null
	 */
	P getById(int id);
	
	//Operaciones basicas para crear
	
	/**
	 * Crea un nuevo registro
	 * @param pojo
	 * @return true si inserta, false lo contrario
	 */
	boolean insert(P pojo);
	
	//Operaciones basicas para eliminar
	
	/**
	 * Elimina un registro
	 * @param id int identificador
	 * @return true si elimina, false lo contrario
	 */
	boolean delete(int id);
	
	//Operaciones basicas para modificar
	
	/**
	 * Modifica un registro
	 * @param pojo
	 * @return true si modifica, false lo contrario
	 */
	boolean update(P pojo);

}
