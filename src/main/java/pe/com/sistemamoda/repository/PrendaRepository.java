
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sistemamoda.entity.Prenda;



public interface PrendaRepository extends JpaRepository<Prenda, Long>{
    @Query("select p from Prenda p where p.estado='1'")
    List<Prenda> findAllCustom();
}
