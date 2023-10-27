package com.tusevi.viajesTusevi.dtos;

import com.tusevi.viajesTusevi.modelos.*;

import java.time.LocalDateTime;

public class ViajeDTO {
    private long id;
    private String ubicacionRecogida;
    private String destino;
    private LocalDateTime fecha;
    private Integer precio;
    private EstadoViaje estado;
    private Comentario comentario;
    private Ubicacion ubicacion;
    private Vehiculo vehiculo;
    private UsuarioPaso2 usuarioPaso2;
    private Conductor conductor;
    public ViajeDTO(Viaje viaje){
        this.id = viaje.getId();
        this.ubicacionRecogida = viaje.getUbicacionRecogida();
        this.destino = viaje.getDestino();
        this.fecha = viaje.getFecha();
        this.precio = viaje.getPrecio();
        this.estado = viaje.getEstado();
        this.comentario = viaje.getComentario();
        this.ubicacion = viaje.getUbicacion();
        this.vehiculo = viaje.getVehiculo();
        this.usuarioPaso2 = viaje.getUsuarioPaso2();
        this.conductor = viaje.getConductor();
    }

    public long getId() {
        return id;
    }

    public String getUbicacionRecogida() {
        return ubicacionRecogida;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Integer getPrecio() {
        return precio;
    }

    public EstadoViaje getEstado() {
        return estado;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public UsuarioPaso2 getUsuarioPaso2() {
        return usuarioPaso2;
    }

    public Conductor getConductor() {
        return conductor;
    }
}
