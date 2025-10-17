package mx.edu.uteq.idgs13.microservicio_profesores.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
import java.util.List;
import lombok.Data;

@Data
@Entity
public class ProfesoresEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String email;
    private boolean activo; // Agregado para consistencia con divisiones

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "profesor_id")
    private List<ProfesoresDivisiones> divisiones;

    public ProfesoresEntity() {
    }

    public ProfesoresEntity(Long id, String nombre, String email, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.activo = activo;
    }
}