package mx.sam.apiEjemplo.service.utils;

import java.util.List;


public interface Crud<T> {
	/*
	 * Buscar todos los objetos
	 * @return List
	 */
	List<T> findAll();

	/*
	 * Buscar por id
	 * @param id
	 * @return Object
	 */
	T findById(Integer id);

	/*
	 * Guardar objeto
	 * @param Object
	 * @return Object
	 */
	T save(T obj);
	
	/*
	 * Guardar objeto
	 * @param id
	 * @param Object
	 * @return Object
	 */
	T update(Integer id,T obj);
	
	/*
	 * Eliminar objeto
	 * @param Object
	 * @return boolean
	 */
	boolean delete(Integer id);
}
