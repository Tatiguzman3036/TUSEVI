package com.tusevi.viajesTusevi.repositorios;

import com.tusevi.viajesTusevi.modelos.OrdenPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrdenPagoRepositorio extends JpaRepository<OrdenPago, Long> {
}
