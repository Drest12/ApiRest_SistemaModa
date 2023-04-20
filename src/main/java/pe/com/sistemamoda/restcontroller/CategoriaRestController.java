
package pe.com.sistemamoda.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.sistemamoda.entity.Categoria;
import pe.com.sistemamoda.service.CategoriaService;



@RestController
@RequestMapping("/categoria")
public class CategoriaRestController {
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping
    public List<Categoria> findAll(){
        return categoriaService.findAll();
    }
    
    @GetMapping("/custom")
    public List<Categoria> findAllCustom(){
        return categoriaService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable Long id){
        return categoriaService.findById(id);
    }
    
    @PostMapping
    public Categoria add(@RequestBody Categoria m){
        return categoriaService.add(m);
    }
    
    @PutMapping("/{id}")
    public Categoria update(@PathVariable long id, @RequestBody Categoria m){
        m.setCodigo(id);
        return categoriaService.update(m);
    }
    
    @DeleteMapping("/{id}")
    public Categoria delete(@PathVariable long id){
        Categoria objmarca=new Categoria();
        objmarca.setEstado(false);
        return categoriaService.delete(Categoria.builder().codigo(id).build());
    } 
}
