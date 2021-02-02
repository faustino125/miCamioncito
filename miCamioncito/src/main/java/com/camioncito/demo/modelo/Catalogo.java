package com.camioncito.demo.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(onlyExplicitlyIncluded = false)
@Entity
@Table(name = "CATALOGO", schema = "CAMIONCITO")
public class Catalogo implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @Column(name = "ID_CATALOGO", unique = true, nullable = false, precision = 6, scale = 0)
    private Integer id;

    @Column(name = "NOMBRE", length = 50)
    private String nombre;

    @Column(name = "DESCRIPCION", length = 100)
    private String descripcion;

    @Column(name = "CATEGORIA", length = 32)
    private String categoria;
}
