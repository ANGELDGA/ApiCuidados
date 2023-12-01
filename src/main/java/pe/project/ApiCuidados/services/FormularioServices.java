
package pe.project.ApiCuidados.services;

import java.util.List;
import pe.project.ApiCuidados.entity.Formulario;


public interface FormularioServices {
    public List<Formulario> findAll();

    public Formulario findById(Long idForm);

    public Formulario add(Formulario formulario);

    public Formulario findByCategoriaName (String categoriaName);

    public Formulario findByTipoInfoName (String tipoInfoName);

    public Formulario update(Formulario formulario);

    public void delete(Long idForm);
}
