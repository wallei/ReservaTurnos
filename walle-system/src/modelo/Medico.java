package modelo;

public class Medico {
	@Override
	public String toString() {
		return "Medico [id_medico=" + id_medico + ", nombre=" + nombre + ", apellido=" + apellido + ", especialidad="
				+ especialidad + "]";
	}


	private int id_medico;
	private String nombre;
	private String apellido;
	private String especialidad;
	
	
	public Medico(int id_medico, String nombre, String apellido, String especialidad) {
		this.id_medico = id_medico;
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
	}


	public int getId_medico() {
		return id_medico;
	}


	public void setId_medico(int id_medico) {
		this.id_medico = id_medico;
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

	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	

	

}
