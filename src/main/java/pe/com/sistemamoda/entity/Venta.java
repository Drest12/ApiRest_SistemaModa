
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
@Entity(name="Venta")
@Table(name="t_ventas")
public class Venta implements Serializable{
    private static final long serialVersionUID=1L;
    
    
    @Id
    @Column(name="idventa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "cantidad")
    private double cantidad;
    @Column(name="fecha")
    private String fecha;
    @Column(name="estado")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name="idcliente", nullable=false)
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name="idempleado", nullable=false)
    private Empleado empleado;
    
}
