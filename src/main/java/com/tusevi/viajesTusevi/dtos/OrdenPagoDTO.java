package com.tusevi.viajesTusevi.dtos;

import com.tusevi.viajesTusevi.modelos.*;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class OrdenPagoDTO {
    private long id;
    private MetodoDePago metodoDePago;
    private Integer costo;
    private EstadoDePago estadoDePago;
    private LocalDateTime fecha;
    private Usuario usuario;
    private Set<ConductorPago> conductorPagos;
    public OrdenPagoDTO(OrdenPago ordenPago){
        this.id = ordenPago.getId();
        this.metodoDePago = ordenPago.getMetodoDePago();
        this.costo = ordenPago.getCosto();
        this.estadoDePago =ordenPago.getEstadoDePago();
        this.fecha = ordenPago.getFecha();
        this.usuario = ordenPago.getUsuario();
        this.conductorPagos = ordenPago.getConductorPagos();
    }

    public long getId() {
        return id;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public Integer getCosto() {
        return costo;
    }

    public EstadoDePago getEstadoDePago() {
        return estadoDePago;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Set<ConductorPago> getConductorPagos() {
        return conductorPagos;
    }
}
