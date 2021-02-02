package com.camioncito.demo.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "VEHICULO", schema = "CAMIONCITO")
public class Vehiculo implements Serializable{
    
    @Id
    @Column(name = "ID_VEHICULO", nullable = false, unique = true, precision = 6, scale = 0)
    private Integer id;
    
    @Column(name = "CAPACIDAD", length = 32)
    private String capacidad;
    
    @Column(name = "RECORRIDO")
    private Integer recorrido;
    
    @Column(name = "PLACA")
    private String placa;
    
    @Column(name = "ALTURA")
    private Integer altura;
    
    @Column(name = "COLOR", length = 16)
    private String color;
    
    @Column(name = "MODELO", length = 32)
    private Integer modelo;
    
    @Column(name = "DEPRECIACION")
    private BigDecimal depreciacion;
    
    @Column(name = "DISPONIBLIDAD")
    private Boolean diponiblidad;
    
}
