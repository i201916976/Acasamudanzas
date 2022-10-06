package CapaEntidad;

public class Cliente {

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public Cliente(int id, String nombre, String apellido, String empresa, String ruc, String correo, String celular,
			String comentario,String fecha) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.empresa = empresa;
		this.ruc = ruc;
		this.correo = correo;
		this.celular = celular;
		this.comentario=comentario;
		this.fecha = fecha;
	}


	public Cliente() {
	
	}
	private int id;
	private String nombre;
	private String apellido;
	private String empresa;
	private String ruc;
	private String correo;
	private String celular;
	private String comentario;
	
	private String fecha;
	
	
	
	
}
