
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
import pe.com.sistemamoda.entity.Prenda;
import pe.com.sistemamoda.service.PrendaService;

@RestController
@RequestMapping("/prenda")
public class PrendaRestController {
   @Autowired
    private PrendaService prendaService;
    
    @GetMapping
    public List<Prenda> findAll(){
        return prendaService.findAll();
    }
    
    @GetMapping("/custom")
    public List<Prenda> findAllCustom(){
        return prendaService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Prenda> findById(@PathVariable Long id){
        return prendaService.findById(id);
    }
    
    @PostMapping
    public Prenda add(@RequestBody Prenda p){
        return prendaService.add(p);
    }
    
    @PutMapping("/{id}")
    public Prenda update(@PathVariable long id, @RequestBody Prenda p){
        p.setCodigo(id);
        return prendaService.update(p);
    }
    
    @DeleteMapping("/{id}")
    public Prenda delete(@PathVariable long id){
        Prenda objprenda=new Prenda();
        objprenda.setEstado(false);
        return prendaService.delete(Prenda.builder().codigo(id).build());
    } 
}
