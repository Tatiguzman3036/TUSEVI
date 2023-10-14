package com.tusevi.viajesTusevi.modelos;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ConductorPago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(strategy = "native", name = "native")
    private long id;
    private Date fechaTransaccion;
    @ManyToOne
    @JoinColumn(name = "pago_id")
    private OrdenPago ordenPago;

    @ManyToOne
    @JoinColumn(name = "conductor_id")
    private Conductor conductor;
    public ConductorPago() {
    }

    public ConductorPago(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public OrdenPago getOrdenPago() {
        return ordenPago;
    }

    public void setOrdenPago(OrdenPago pago) {
        this.ordenPago = pago;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }
}
