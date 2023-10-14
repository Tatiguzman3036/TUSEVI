package com.tusevi.viajesTusevi.repositorios;

import com.tusevi.viajesTusevi.modelos.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UbicacionRepositorio extends JpaRepository<Ubicacion,Long> {
}
