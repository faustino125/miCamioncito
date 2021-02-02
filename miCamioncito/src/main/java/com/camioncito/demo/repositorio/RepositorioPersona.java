
package com.camioncito.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.camioncito.demo.modelo.Persona;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Faustino Lopez
 * @since 02/02/2021
 * @version 0.0.1
 */
@Repository("repositorioPersona")
public interface RepositorioPersona extends JpaRepository<Persona, Integer>{
    
}
