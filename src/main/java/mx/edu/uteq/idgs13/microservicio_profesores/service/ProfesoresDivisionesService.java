package mx.edu.uteq.idgs13.microservicio_profesores.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uteq.idgs13.microservicio_profesores.entity.ProfesoresDivisiones;
import mx.edu.uteq.idgs13.microservicio_profesores.repository.ProfesoresDivisionesRepository;
import mx.edu.uteq.idgs13.microservicio_profesores.repository.ProfesoresRepository;

@Service
public class ProfesoresDivisionesService {
    @Autowired
    private ProfesoresRepository profesoresRepository;

    @Autowired
    private ProfesoresDivisionesRepository profesoresDivisionesRepository;

    public ProfesoresDivisiones saveWithProfesor(Long profesorId, ProfesoresDivisiones division) {
        var profesorOpt = profesoresRepository.findById(profesorId);
        if (profesorOpt.isEmpty()) {
            throw new IllegalArgumentException("Profesor no encontrado");
        }
        var profesor = profesorOpt.get();
        division = profesoresDivisionesRepository.save(division);
        profesor.getDivisiones().add(division);
        profesoresRepository.save(profesor);
        return division;
    }

    public List<ProfesoresDivisiones> findAll() {
        return profesoresDivisionesRepository.findAll();
    }

    public Optional<ProfesoresDivisiones> findById(Long id) {
        return profesoresDivisionesRepository.findById(id);
    }

    public ProfesoresDivisiones save(ProfesoresDivisiones division) {
        return profesoresDivisionesRepository.save(division);
    }

    public void deleteById(Long id) {
        profesoresDivisionesRepository.deleteById(id);
    }
}