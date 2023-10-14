package com.tusevi.viajesTusevi.repositorios;

import com.tusevi.viajesTusevi.modelos.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ConductorRepositorio extends JpaRepository<Conductor, Long> {
}
