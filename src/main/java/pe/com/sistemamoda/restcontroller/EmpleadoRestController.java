
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
import pe.com.sistemamoda.entity.Empleado;
import pe.com.sistemamoda.service.EmpleadoService;


@RestController
@RequestMapping("/empleado")
public class EmpleadoRestController {
    @Autowired
    private EmpleadoService empleadoService;
    
    @GetMapping
    public List<Empleado> findAll(){
        return empleadoService.findAll();
    }
    
    @GetMapping("/custom")
    public List<Empleado> findAllCustom(){
        return empleadoService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Empleado> findById(@PathVariable Long id){
        return empleadoService.findById(id);
    }
    
    @PostMapping
    public Empleado add(@RequestBody Empleado e){
        return empleadoService.add(e);
    }
    
    @PutMapping("/{id}")
    public Empleado update(@PathVariable long id, @RequestBody Empleado e){
        e.setCodigo(id);
        return empleadoService.update(e);
    }
    
    @DeleteMapping("/{id}")
    public Empleado delete(@PathVariable long id){
        Empleado objempleado=new Empleado();
        objempleado.setEstado(false);
        return empleadoService.delete(Empleado.builder().codigo(id).build());
    }
    
    
            @GetMapping("/dni")
    public Empleado findByDni(@RequestBody Empleado e) {
        return empleadoService.findByDniEmp(e);
    }

    @GetMapping("/nombre")
    public Empleado findByName(@RequestBody Empleado e) {
        return empleadoService.findByNameEmp(e);
    }

    @GetMapping("/apellido")
    public Empleado findByLastName(@RequestBody Empleado e) {
        return empleadoService.findByLastnameEmp(e);
    }
}
