
package pe.project.ApiCuidados.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Formulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idForm;
    private String categoriaName;
    private String tipoInfoName;
    private String informacion;
    private String url;
}
