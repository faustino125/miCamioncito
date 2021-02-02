
package com.camioncito.demo.servicio;

import com.camioncito.demo.modelo.Vehiculo;
import com.camioncito.demo.repositorio.RepositorioVehiculo;
import com.camioncito.demo.excepcion.Excepcion;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 *
 * @author Faustino Lopez
 * @since 02/02/2021
 * @version 0.0.1
 */

@Service("servicioVehiculo")
public class ServicioVehiculo {
    
    @Resource
    private RepositorioVehiculo repositorioVehiculo;
    

    public List<Vehiculo> mostarVehiculo() {
        return this.repositorioVehiculo.findAll();
    }

    public Vehiculo buscarPorId(Integer id) {
        return this.repositorioVehiculo.findById(id).orElseThrow(() -> {
            String descripcion = String.format("No existe el id: ", id);
            return new Excepcion(HttpStatus.NOT_FOUND, descripcion);
        });
    }

    public Vehiculo agregar(DtoVehiculo.Post dto) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setNombre(dto.g);
        vehiculo.setDescripcion(dto.getDescripcion());
        this.repositorioVehiculo.save(vehiculo);
        return vehiculo;
    }
//
//    public Vehiculo actualizar(Integer id, dtoVehiculo dto) {
//        Vehiculo vehiculo = repositorioVehiculo.findById(id).orElseThrow(() -> {
//            String descripcion = String.format("No existe el id: ", id);
//            return new Excepcion(HttpStatus.NOT_FOUND, descripcion);
//        });
//        vehiculo.setNombre(dto.getNombre());
//        vehiculo.setDescripcion(dto.getDescripcion());
//        this.repositorioVehiculo.save(vehiculo);
//        return vehiculo;
//    }
}
