package com.tusevi.viajesTusevi.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
public class OrdenPago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(strategy = "native", name = "native")
    private long id;
    private MetodoDePago metodoDePago;
    private Integer costo;
    private EstadoDePago estadoDePago;
    private LocalDateTime fecha;

    public OrdenPago() {
    }

    public OrdenPago(MetodoDePago metodoDePago, Integer costo, EstadoDePago estadoDePago,LocalDateTime fecha) {
        this.metodoDePago = metodoDePago;
        this.costo = costo;
        this.estadoDePago = estadoDePago;
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public EstadoDePago getEstadoDePago() {
        return estadoDePago;
    }

    public void setEstadoDePago(EstadoDePago estadoDePago) {
        this.estadoDePago = estadoDePago;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
