package vo;

public class Persona {

	private String nombre;
	private String correo;
	private String documento;
	private String contra;
	private String usuario;
	private String contrase;
	private boolean editar;

	private String id;
	private String funcionalidad;
	private String descripcion;
	private String rol;
	private String tipo;
	
	
	
	public Persona() {

	}

	

	public Persona(String nombre, String correo, String documento, String contra, String usuario, boolean editar) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.documento = documento;
		this.contra = contra;
		this.usuario = usuario;
		this.editar = editar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrase() {
		return contrase;
	}

	public void setContrase(String contrase) {
		this.contrase = contrase;
	}

	public boolean isEditar() {
		return editar;
	}

	public void setEditar(boolean editar) {
		this.editar = editar;
	}






public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getFuncionalidad() {
	return funcionalidad;
}

public void setFuncionalidad(String funcionalidad) {
	this.funcionalidad = funcionalidad;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public String getRol() {
	return rol;
}

public void setRol(String rol) {
	this.rol = rol;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

}














