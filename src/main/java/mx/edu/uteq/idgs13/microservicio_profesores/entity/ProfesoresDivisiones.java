package mx.edu.uteq.idgs13.microservicio_profesores.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Data;

@Data
@Entity
public class ProfesoresDivisiones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "division_id") // Corregido: antes era "nombre", que no tenía sentido
    private Long divisionId;

    private boolean activo; // Agregado para consistencia
}