package com.camioncito.demo.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "VIAJE", schema = "CAMIONCITO")
public class Viaje implements Serializable {

    @Id
    @Column(name = "ID_VIAJE", unique = true, nullable = false, precision = 6, scale = 0)
    private Integer Id;

    @Column(name = "FECHA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fecha;

    @Column(name = "DISTANCIA_RECORRIDO")
    private Integer distancia_recorrido;

    @Column(name = "TIEMPO")
    @Temporal(TemporalType.TIME)
    private Date tiempo;

    @Column(name = "VIATICOS")
    private BigDecimal viaticos;

    @Column(name = "GASTOS_ADICIONALES")
    private BigDecimal gastos_adicionales;

}
