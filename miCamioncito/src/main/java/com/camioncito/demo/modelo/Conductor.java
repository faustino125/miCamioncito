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
@Table(name = "CONDUCTOR", schema = "CAMIONCITO")
public class Conductor extends Persona implements Serializable {

    @Id
    @Column(name = "ID_CONDUCTOR", unique = true, nullable = false, precision = 6, scale = 0)
    private Integer id;

    @Column(name = "SALARIO")
    private BigDecimal salario;

    @Column(name = "DISPONIBILIDAD")
    private Boolean disponibilidad;
}
