
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
import pe.com.sistemamoda.entity.Cliente;
import pe.com.sistemamoda.service.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }
    
    @GetMapping("/custom")
    public List<Cliente> findAllCustom(){
        return clienteService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Long id){
        return clienteService.findById(id);
    }
    
    @PostMapping
    public Cliente add(@RequestBody Cliente c){
        return clienteService.add(c);
    }
    
    @PutMapping("/{id}")
    public Cliente update(@PathVariable long id, @RequestBody Cliente c){
        c.setCodigo(id);
        return clienteService.update(c);
    }
    
    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable long id){
        Cliente objcliente=new Cliente();
        objcliente.setEstado(false);
        return clienteService.delete(Cliente.builder().codigo(id).build());
    }
        @GetMapping("/dni")
    public Cliente findByDni(@RequestBody Cliente cl) {
        return clienteService.findByDni(cl);
    }

    @GetMapping("/nombre")
    public Cliente findByName(@RequestBody Cliente cl) {
        return clienteService.findByName(cl);
    }

    @GetMapping("/apellido")
    public Cliente findByLastName(@RequestBody Cliente cl) {
        return clienteService.findByLastname(cl);
    }
}
