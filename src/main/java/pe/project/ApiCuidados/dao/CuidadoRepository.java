
package pe.project.ApiCuidados.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.project.ApiCuidados.entity.Formulario;


public interface CuidadoRepository extends JpaRepository<Formulario, Long>{
    Formulario findByCategoriaName (String categoriaName);
    Formulario findByTipoInfoName (String tipoInfoName);
}
