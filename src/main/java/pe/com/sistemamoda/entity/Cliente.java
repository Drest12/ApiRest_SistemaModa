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
@Entity(name = "Cliente")
@Table(name = "t_cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "idcliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "dni")
    private String dni;
     @Column(name = "genero")
    private String genero;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "correo")
    private String correo;
    @Column(name = "estado")
    private boolean estado;
    
     @ManyToOne
    @JoinColumn(name="iddistrito", nullable=false)
    private Distrito distrito;
    
}
