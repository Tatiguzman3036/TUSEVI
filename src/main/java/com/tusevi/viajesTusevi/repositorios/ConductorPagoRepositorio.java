package com.tusevi.viajesTusevi.repositorios;

import com.tusevi.viajesTusevi.modelos.ConductorPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ConductorPagoRepositorio extends JpaRepository<ConductorPago, Long> {
}
