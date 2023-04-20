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
import pe.com.sistemamoda.entity.UsuarioRol;
import pe.com.sistemamoda.service.UsuarioRolService;


@RestController
@RequestMapping("/usuario-rol")
public class UsuarioRolRestController {

    @Autowired
    private UsuarioRolService servicio;

    @GetMapping
    public List<UsuarioRol> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<UsuarioRol> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<UsuarioRol> findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public UsuarioRol add(@RequestBody UsuarioRol ur) {
        return servicio.add(ur);
    }

    @PutMapping("/{id}")
    public UsuarioRol update(@PathVariable long id, @RequestBody UsuarioRol ur) {
        ur.setCodigo(id);
        return servicio.update(ur);
    }

    @DeleteMapping("/{id}")
    public UsuarioRol delete(@PathVariable long id) {
        UsuarioRol objusuariorol = new UsuarioRol();
        objusuariorol.setEstado(false);
        return servicio.delete(UsuarioRol.builder().codigo(id).build());
    }
}
