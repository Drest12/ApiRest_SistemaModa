
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
import pe.com.sistemamoda.entity.Rol;
import pe.com.sistemamoda.service.RolService;

@RestController
@RequestMapping("/rol")
public class RolRestController {
    @Autowired
    private RolService rolService;
    
    @GetMapping
    public List<Rol> findAll(){
        return rolService.findAll();
    }
    
    @GetMapping("/custom")
    public List<Rol> findAllCustom(){
        return rolService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Rol> findById(@PathVariable Long id){
        return rolService.findById(id);
    }
    
    @PostMapping
    public Rol add(@RequestBody Rol r){
        return rolService.add(r);
    }
    
    @PutMapping("/{id}")
    public Rol update(@PathVariable long id, @RequestBody Rol r){
        r.setCodigo(id);
        return rolService.update(r);
    }
    
    @DeleteMapping("/{id}")
    public Rol delete(@PathVariable long id){
        Rol objrol=new Rol();
        objrol.setEstado(false);
        return rolService.delete(Rol.builder().codigo(id).build());
    }
}
