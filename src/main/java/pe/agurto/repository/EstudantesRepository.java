package pe.agurto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.agurto.model.Estudiantes;

@Repository
public interface EstudantesRepository extends JpaRepository<Estudiantes, Integer>{

}
