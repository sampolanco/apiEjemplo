package mx.sam.apiEjemplo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/*
 * Objeto Usuario de Entidad
 * @author Samuel
 * @version 1.0
 * */
@Entity
public class Usuario {


	/*
	 * id
	 * */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_usuario")
	@SequenceGenerator(name="seq_usuario", sequenceName = "seq_usuario", allocationSize=1)
	@Column(insertable=false)	
	private int id;
	/*
	 * idrol
	 * */
	private int idRol;
	/*
	 * nombre
	 * */
	private String nombre;
	/*
	 * nombre
	 * */
	private String userName;
	/*
	 * password
	 * */
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
