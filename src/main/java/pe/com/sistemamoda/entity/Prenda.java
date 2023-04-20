
package pe.com.sistemamoda.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Prenda")
@Table(name="t_prendas")
public class Prenda implements Serializable{
    private static final long serialVersionUID=1L;
    
    
    @Id
    @Column(name="idprenda")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="precio")
    private double precio;
    @Column(name="talla")
    private String talla;
     @Column(name="cantidad")
    private double cantidad;
    @Column(name="estado")
    private boolean estado;
    
    
    @ManyToOne
    @JoinColumn(name="idcategoria", nullable=false)
    private Categoria categoria;
}
