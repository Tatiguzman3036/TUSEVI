package com.tusevi.viajesTusevi.repositorios;

import com.tusevi.viajesTusevi.modelos.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ViajeRepositorio extends JpaRepository<Viaje, Long> {
}
