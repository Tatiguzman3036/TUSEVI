package com.tusevi.viajesTusevi.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ConductorPago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(strategy = "native", name = "native")
    private long id;

    @ManyToOne
    @JoinColumn(name = "pago_id")
    private OrdenPago ordenPago;

    @ManyToOne
    @JoinColumn(name = "conductor_id")
    private Conductor conductor;

    private Date fechaTransaccion;

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

    public void setOrdenPago(OrdenPago ordenPago) {
        this.ordenPago = ordenPago;
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
