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
@Entity(name = "DetalleVenta")
@Table(name = "t_detalleventa")
public class DetalleVenta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "idventdet")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "precio")
    private double precio;
    @Column(name = "cantidad")
    private double cantidad;
    @ManyToOne
    @JoinColumn(name = "idventa", nullable = false)
    private Venta venta;
    @ManyToOne
    @JoinColumn(name = "idprenda", nullable = false)
    private Prenda prenda;
}
