package com.tusevi.viajesTusevi.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(strategy = "native", name = "native")
    private long id;
    private String ubicacionRecogida;
    private String destino;
    private LocalDateTime fecha;
    private Integer precio;
    private EstadoViaje estado;

    public Viaje() {
    }

    public Viaje(String ubicacionRecogida, String destino, LocalDateTime fecha, Integer precio, EstadoViaje estado) {
        this.ubicacionRecogida = ubicacionRecogida;
        this.destino = destino;
        this.fecha = fecha;
        this.precio = precio;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUbicacionRecogida() {
        return ubicacionRecogida;
    }

    public void setUbicacionRecogida(String ubicacionRecogida) {
        this.ubicacionRecogida = ubicacionRecogida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public EstadoViaje getEstado() {
        return estado;
    }

    public void setEstado(EstadoViaje estado) {
        this.estado = estado;
    }
}
