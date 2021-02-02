package com.camioncito.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.camioncito.demo.modelo.Conductor;
/**
 *
 * @author Faustino Lopez
 * @since 02/02/2021
 * @version 0.0.1
 */
@Repository("RepositorioConductor")
public interface RepositorioConductor extends JpaRepository<Conductor, Integer>{
    
}
