
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sistemamoda.entity.UsuarioRol;

public interface UsuarioRolRepository extends JpaRepository<UsuarioRol, Long> {

    @Query("select ur from UsuarioRol ur where ur.estado='1'")
    List<UsuarioRol> findAllCustom();
}
