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
@Entity(name = "UsuarioRol")
@Table(name = "t_usuariorol")
public class UsuarioRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idusurol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @ManyToOne
    @JoinColumn(name = "idusuario", nullable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "idrol", nullable = false)
    private Rol rol;
    @Column(name = "estusurol")
    private boolean estado;
}
