package com.camioncito.demo.repositorio;

import com.camioncito.demo.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Faustino Lopez
 * @since 02/02/2021
 * @version 0.0.1
 */
@Repository("repositorioCliente")
public interface RepositorioCliente extends JpaRepository<Cliente, Integer>{
    
}
