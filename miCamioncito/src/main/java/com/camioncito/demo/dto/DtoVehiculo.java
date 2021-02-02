package com.camioncito.demo.dto;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Faustino Lopez
 * @since 02/02/2021
 * @version 0.0.1
 */
public interface DtoVehiculo {

    @Setter
    @Getter
    public static class Post {

        private String capacidad;
        private Integer recorrido;
        private String placa;
        private Integer altura;
        private String color;
        private Integer modelo;
        private BigDecimal depreciacion;
        private Boolean diponiblidad;
    }

    @Setter
    @Getter
    public static class Put {

        private String capacidad;
        private Integer recorrido;
        private String placa;
        private Integer altura;
        private String color;
        private Integer modelo;
        private BigDecimal depreciacion;
        private Boolean diponiblidad;
    }

    @Setter
    @Getter
    public static class Get {

        private String capacidad;
        private Integer recorrido;
        private String placa;
        private Integer altura;
        private String color;
        private Integer modelo;
        private BigDecimal depreciacion;
        private Boolean diponiblidad;
    }

    @Setter
    @Getter
    public static class Response {
        private Integer id;
        private String capacidad;
        private Integer recorrido;
        private String placa;
        private Integer altura;
        private String color;
        private Integer modelo;
        private BigDecimal depreciacion;
        private Boolean diponiblidad;
    }
}
