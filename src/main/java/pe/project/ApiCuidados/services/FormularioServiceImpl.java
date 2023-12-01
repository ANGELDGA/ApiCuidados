
package pe.project.ApiCuidados.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import pe.project.ApiCuidados.dao.CuidadoRepository;
import pe.project.ApiCuidados.entity.Formulario;

@Service
public class FormularioServiceImpl implements FormularioServices{

    @Autowired
    private CuidadoRepository cuidadoRepository;
    
    @Override
    public List<Formulario> findAll() {

        return cuidadoRepository.findAll();
    }

    @Override
    public Formulario findById(Long idForm) {
        return cuidadoRepository.findById(idForm).get();
    }

    @Override
    public Formulario add(Formulario formulario) {

        return cuidadoRepository.save(formulario);
    }

    @Query
    @Override
    public Formulario findByCategoriaName(String categoriaName) {
        return cuidadoRepository.findByCategoriaName(categoriaName);
    }

    @Query
    @Override
    public Formulario findByTipoInfoName(String tipoInfoName) {
        return cuidadoRepository.findByTipoInfoName(tipoInfoName);
    }

    @Override
    public Formulario update(Formulario formulario) {
        var cuidadoBD = cuidadoRepository.findById(formulario.getIdForm()).get();
        cuidadoBD.setIdForm(formulario.getIdForm());
        cuidadoBD.setCategoriaName(formulario.getCategoriaName());
        cuidadoBD.setTipoInfoName(formulario.getTipoInfoName());
        cuidadoBD.setInformacion(formulario.getInformacion());
        cuidadoBD.setUrl(formulario.getUrl());

        return cuidadoRepository.save(cuidadoBD);
    }

    @Override
    public void delete(Long idForm) {
        var cuidadoBD = cuidadoRepository.findById(idForm).get();
        cuidadoRepository.delete(cuidadoBD);
    }

}
