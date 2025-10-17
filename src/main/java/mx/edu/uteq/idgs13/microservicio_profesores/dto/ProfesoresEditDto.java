package mx.edu.uteq.idgs13.microservicio_profesores.dto;

import lombok.Data;

@Data
public class ProfesoresEditDto {
    private String nombre;
    private String email;
    private boolean activo;
}