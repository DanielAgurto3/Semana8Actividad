package pe.agurto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.agurto.model.Estudiantes;
import pe.agurto.repository.EstudantesRepository;

@Service
public class EstudiantesServiceImpl implements EstudiantesService {

	@Autowired
	private EstudantesRepository repository;
	
	@Override
	public List<Estudiantes> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Estudiantes obtener(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
