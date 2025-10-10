package mx.edu.uteq.idgs13.microservicio_profesores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.edu.uteq.idgs13.microservicio_profesores.entity.ProfesoresEntity;

public interface ProfesoresRepository extends JpaRepository<ProfesoresEntity, Long> {

}
