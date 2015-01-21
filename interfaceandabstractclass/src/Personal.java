
public abstract class Personal implements empresa {
	
	
	
	protected Integer idpersonal;
	protected String nombre;
	protected String apellido;
	protected String correo;
	protected Integer edad;
	
	public void trabajar(){
		System.out.println("Los trabajadores trabajan en la empresa");
	}
	
	public Personal (){
	}
	
	public Integer getIdpersonal() {
		
		return idpersonal;
	}
	public void setIdpersonal(Integer idpersonal) {
		this.idpersonal = idpersonal;
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	

}
