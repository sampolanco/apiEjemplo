package mx.sam.apiEjemplo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/*
 * Objeto Rol de Entidad
 * @author Samuel
 * @version 1.0
 * */
@Entity
public class Rol {

	/*
	 * id
	 * */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_rol")
	@SequenceGenerator(name="seq_rol", sequenceName = "seq_rol", allocationSize=1)
	@Column(insertable=false)	
	Integer id;
	String descripcion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
