package pe.agurto.service;

import java.util.List;


import pe.agurto.model.Estudiantes;

public interface EstudiantesService {

	List<Estudiantes> listar();
	Estudiantes obtener(Integer id);
	
}
