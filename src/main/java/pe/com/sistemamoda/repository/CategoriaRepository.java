
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sistemamoda.entity.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    @Query("select m from Categoria m where m.estado='1'")
    List<Categoria> findAllCustom();
}
