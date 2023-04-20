
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.sistemamoda.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("select u from Usuario u where u.estado='1'")
    List<Usuario> findAllCustom();
    @Query("select u from Usuario u where u.usuario=:usu and u.clave=:cla")
    List<Usuario> login(@Param("usu")String usuario,@Param("cla")String clave);
}
