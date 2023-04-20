/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

@Entity(name = "Distrito")
@Table(name = "t_distrito")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Distrito implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "iddistrito")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "estado")
    private boolean estado;
}
