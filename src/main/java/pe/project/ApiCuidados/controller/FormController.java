
package pe.project.ApiCuidados.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.project.ApiCuidados.entity.Formulario;
import pe.project.ApiCuidados.services.FormularioServices;

@RestController
@RequestMapping("api/form")
public class FormController {
    
    @Autowired
    private FormularioServices formularioServices;
    
    @PostMapping("/add")
    public ResponseEntity<Formulario> add(@RequestBody Formulario formulario){
        return new ResponseEntity<>(formularioServices.add(formulario),HttpStatus.CREATED);
    }
    @GetMapping("/list")
    public ResponseEntity<List<Formulario>> findAll(){
        return new ResponseEntity<>(formularioServices.findAll(),HttpStatus.OK);
    }

    @Query
    @GetMapping("/findByCategoriaName/{categoriaName}")
    public ResponseEntity<Formulario> findByCategoriaName (@PathVariable String categoriaName){
        return new ResponseEntity<>(formularioServices.findByCategoriaName(categoriaName),HttpStatus.OK);
    }

    @Query
    @GetMapping("/findByTipoInfoName/{tipoInfoName}")
    public ResponseEntity<Formulario>  findByTipoInfoName (String tipoInfoName){
        return new ResponseEntity<>(formularioServices.findByTipoInfoName(tipoInfoName),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Formulario> update(@RequestBody Formulario formulario){
        return new ResponseEntity<>(formularioServices.update(formulario),HttpStatus.CREATED);
    }

    @GetMapping("/findById/{idForm}")
    public ResponseEntity<Formulario> findById(@PathVariable Long idForm){
        return new ResponseEntity<>(formularioServices.findById(idForm),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idForm}")
    public void delete(@PathVariable Long idForm){
        formularioServices.delete(idForm);
    }

    
}
