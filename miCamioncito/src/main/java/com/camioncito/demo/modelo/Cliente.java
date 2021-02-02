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
@Table(name = "CLIENTE", schema = "CAMIONCITO")
public class Cliente extends Persona implements Serializable{
    
    @Id
    @Column(name = "ID_CLIENTE", unique = true, nullable = false, precision = 6, scale = 0)
    private Integer id;
    
    @Column(name = "PORCENTAJE")
    private Integer porcentaje;
    
    @Column(name = "RECEPCION", length = 100)
    private String recepcion;
    
    @Column(name = "ENTEGA", length = 100)
    private String entrega;
    
    @Column(name = "CARGA")
    private String carga;
    
}
