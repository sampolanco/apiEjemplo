package mx.sam.apiEjemplo.dto;


/*
 * Objeto Trabajador de Entidad
 * @author UsuarioDTO
 * @version 1.0
 * */
public class UsuarioDTO {
	
	/*
	 * id
	 * */
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
