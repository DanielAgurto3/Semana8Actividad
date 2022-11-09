package pe.agurto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudiantes")
public class Estudiantes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idestudiante;
	
	private String nombre;
	
	private String apellido;
	
	private String seccion;

	public Integer getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(Integer idestudiante) {
		this.idestudiante = idestudiante;
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

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	

}
