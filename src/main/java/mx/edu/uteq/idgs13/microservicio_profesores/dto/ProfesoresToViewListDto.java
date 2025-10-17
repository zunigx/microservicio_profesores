package mx.edu.uteq.idgs13.microservicio_profesores.dto;

import java.util.List;

import lombok.Data;

@Data
public class ProfesoresToViewListDto {
    private Long profesorId;
    private String nombre;
    private String email;
    private List<Long> divisiones; // Lista de IDs de divisiones
}