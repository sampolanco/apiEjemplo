package mx.sam.apiEjemplo.model.builder;

import org.springframework.util.Assert;

import mx.sam.apiEjemplo.dto.UsuarioDTO;
import mx.sam.apiEjemplo.model.Usuario;



public class UsuarioBuilder {
Usuario result;
	
	/*
	 * Constructor
	 * @param Usuario
	 * */
	public UsuarioBuilder(Usuario obj){
		Assert.notNull(obj, "obj");
		this.result=obj;
	}
	
	/*
	 * Setea los datos del objeto DTO a un objeto de entidad
	 * @param obj
	 * @return Usuario
	 * */
	public Usuario setDTO(UsuarioDTO obj) {
		result.setIdRol(obj.getIdRol());
		result.setNombre(obj.getNombre());
		result.setPassword(obj.getPassword());
		return result;
	}
	
	/*
	 * Setea el id
	 * @param id
	 * @return Usuario
	 * */
	public Usuario setId(Integer id) {
		result.setId(id);
		return result;
	}
	
	/*
	 * Regresa el objeto de entidad
	 * @return Usuario
	 * */
	public Usuario build() {
		return result;
	}
}
