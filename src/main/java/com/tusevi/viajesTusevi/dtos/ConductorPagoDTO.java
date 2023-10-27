package com.tusevi.viajesTusevi.dtos;

import com.tusevi.viajesTusevi.modelos.Conductor;
import com.tusevi.viajesTusevi.modelos.ConductorPago;
import com.tusevi.viajesTusevi.modelos.OrdenPago;

import java.util.Date;
import java.util.Set;

public class ConductorPagoDTO {
    private long id;
    private Date fechaTransaccion;
    private OrdenPago ordenPago;
    private Conductor conductor;
    public ConductorPagoDTO(ConductorPago conductorPago){
        this.id = conductorPago.getId();
        this.fechaTransaccion = conductorPago.getFechaTransaccion();
        this.ordenPago = conductorPago.getOrdenPago();
        this.conductor = conductorPago.getConductor();
    }

    public long getId() {
        return id;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public OrdenPago getOrdenPago() {
        return ordenPago;
    }

    public Conductor getConductor() {
        return conductor;
    }
}
