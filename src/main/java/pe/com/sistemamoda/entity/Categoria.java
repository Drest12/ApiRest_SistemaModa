
package pe.com.sistemamoda.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Categoria")
@Table(name="t_categoria")
public class Categoria implements Serializable{
    private static final long serialVersionUID=1L;
    
    
    @Id
    @Column(name="idcategoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nombre")
    private String nombre;
    @Column(name="estado")
    private boolean estado;
}
