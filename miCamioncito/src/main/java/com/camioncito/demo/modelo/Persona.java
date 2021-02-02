package com.camioncito.demo.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Faustino Lopez
 * @since 02/02/2021
 * @version 0.0.1
 */
@Setter
@Getter
@Entity
@Table(name = "PERSONA", schema = "CAMIONCITO")
public class Persona implements Serializable{
    
    @Id
    @Column(name = "ID_PERSONA", precision = 6, scale = 0, nullable = false, unique = true)
    private Integer id;
    
    @Column(name = "NOMBRE", length = 32)
    private String nombre;
    
    @Column(name = "APELLIDO", length = 32)
    private String apellido;
    
    @Column(name = "DIRECCION", length = 100)
    private String direccion;
    
    @Column(name = "EMAIL", length = 64)
    private String email;
    
    @Column(name = "TELEFONO", length = 12)
    private String telefono;
    
    
}
