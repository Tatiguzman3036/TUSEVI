package com.tusevi.viajesTusevi.repositorios;

import com.tusevi.viajesTusevi.modelos.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VehiculoRepositorio extends JpaRepository<Vehiculo,Long> {
}
