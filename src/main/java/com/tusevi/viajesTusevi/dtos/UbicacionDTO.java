package com.tusevi.viajesTusevi.dtos;

import com.tusevi.viajesTusevi.modelos.Ubicacion;
import com.tusevi.viajesTusevi.modelos.Vehiculo;
import com.tusevi.viajesTusevi.modelos.Viaje;

public class UbicacionDTO {
    private long id;
    private String direccion;
    private double latitud;
    private double longitud;
    private Vehiculo vehiculo;
    private Viaje viaje;
    public UbicacionDTO(Ubicacion ubicacion){
        this.id = ubicacion.getId();
        this.direccion = ubicacion.getDireccion();
        this.latitud = ubicacion.getLatitud();
        this.longitud = ubicacion.getLongitud();
        this.vehiculo = ubicacion.getVehiculo();
        this.viaje = ubicacion.getViaje();
    }

    public long getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Viaje getViaje() {
        return viaje;
    }
}
