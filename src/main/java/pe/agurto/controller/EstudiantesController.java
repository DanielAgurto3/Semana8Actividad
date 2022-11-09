package pe.agurto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import pe.agurto.model.Estudiantes;
import pe.agurto.service.EstudiantesService;

@RestController
@RequestMapping("/estudiantes/v1")
public class EstudiantesController {
	
	@Autowired
	private EstudiantesService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Estudiantes>> listar(){
		return new ResponseEntity<List<Estudiantes>>(service.listar(), HttpStatus.OK) ;
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Estudiantes> obtenerPorId(@PathVariable Integer id){
		
		Estudiantes estudiantes = service.obtener(id);
		
		if( estudiantes != null) {
			return new ResponseEntity<Estudiantes>(estudiantes, HttpStatus.OK);
		}else {
			return new ResponseEntity<Estudiantes>(HttpStatus.NOT_FOUND);
		}
		
	}

}
