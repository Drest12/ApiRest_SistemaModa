
package pe.com.sistemamoda.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.sistemamoda.entity.DetalleVenta;
import pe.com.sistemamoda.service.DetalleVentaService;

@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaRestController {
    @Autowired
    private DetalleVentaService carritoService;
    
    @GetMapping
    public List<DetalleVenta> findAll(){
        return carritoService.findAll();
    }
    

    
    @GetMapping("/{id}")
    public Optional<DetalleVenta> findById(@PathVariable Long id){
        return carritoService.findById(id);
    }
    
    @PostMapping
    public DetalleVenta add(@RequestBody DetalleVenta ca){
        return carritoService.add(ca);
    }
    
    @PutMapping("/{id}")
    public DetalleVenta update(@PathVariable long id, @RequestBody DetalleVenta ca){
        ca.setCodigo(id);
        return carritoService.update(ca);
    }
    
 
}
