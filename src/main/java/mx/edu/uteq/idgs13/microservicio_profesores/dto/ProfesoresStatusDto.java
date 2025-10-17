package mx.edu.uteq.idgs13.microservicio_profesores.dto;

import lombok.Data;

@Data
public class ProfesoresStatusDto {
    private Long profesorId;
    private boolean activo;
}