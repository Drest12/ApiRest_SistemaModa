package pe.com.sistemamoda.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.sistemamoda.entity.Usuario;
import pe.com.sistemamoda.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {

    @Autowired
    private UsuarioService servicio;

    @GetMapping("/custom")
    public List<Usuario> findAllCustom() {
        return servicio.findAllCustom();
    }

    @PostMapping("/login")
    public boolean login(@RequestBody Usuario u) {

        return servicio.login(u);
    }
}
