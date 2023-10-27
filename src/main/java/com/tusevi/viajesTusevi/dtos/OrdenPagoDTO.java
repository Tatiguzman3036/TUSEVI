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
    private UsuarioPaso2 usuarioPaso2;
    private Set<ConductorPago> conductorPagos;
    public OrdenPagoDTO(OrdenPago ordenPago){
        this.id = ordenPago.getId();
        this.metodoDePago = ordenPago.getMetodoDePago();
        this.costo = ordenPago.getCosto();
        this.estadoDePago =ordenPago.getEstadoDePago();
        this.fecha = ordenPago.getFecha();
        this.usuarioPaso2 = ordenPago.getUsuarioPaso2();
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

    public UsuarioPaso2 getUsuarioPaso2() {
        return usuarioPaso2;
    }

    public Set<ConductorPago> getConductorPagos() {
        return conductorPagos;
    }
}
