/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camioncito.demo.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author Faustino Lopez
 * @since 02/02/2021
 * @version 0.0.1
 */

public class Excepcion extends ResponseStatusException{
    
    public Excepcion(HttpStatus estadoHttp, String descripcion) {
        super(estadoHttp, descripcion);
    }

    public Excepcion(HttpStatus estadoHttp, String descripcion, Throwable causa) {
        super(estadoHttp, descripcion, causa);
    }
    
    
    
}
