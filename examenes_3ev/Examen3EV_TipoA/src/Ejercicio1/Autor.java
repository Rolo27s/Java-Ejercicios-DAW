package Ejercicio1;

import java.util.Objects;

public class Autor {
	private String nombre;
	private String apellidos;
	private Integer anhoNacimiento;
	
	public Autor(String nombre, String apellidos, Integer fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anhoNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getFechaNacimiento() {
		return anhoNacimiento;
	}

	public void setFechaNacimiento(Integer fechaNacimiento) {
		this.anhoNacimiento = fechaNacimiento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, anhoNacimiento, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(anhoNacimiento, other.anhoNacimiento)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + anhoNacimiento + "]";
	}

}
