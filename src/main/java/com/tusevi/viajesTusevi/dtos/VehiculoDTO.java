package com.tusevi.viajesTusevi.dtos;

import com.tusevi.viajesTusevi.modelos.*;

import java.util.Set;

public class VehiculoDTO {
    private long id;
    private String matricula;
    private String modelo;
    private TipoVehiculo tipoVehiculo;
    private String color;
    private Ubicacion ubicacionActual;
    private Byte[] cedulaAzul;
    private Byte[] seguro;
    private Set<Viaje> viajes;
    private Conductor conductor;
    private Ubicacion ubicacion;
    public VehiculoDTO(Vehiculo vehiculo){
        this.id = vehiculo.getId();
        this.matricula = vehiculo.getMatricula();
        this.modelo = vehiculo.getModelo();
        this.tipoVehiculo = vehiculo.getTipoVehiculo();
        this.color = vehiculo.getColor();
        this.ubicacionActual = vehiculo.getUbicacionActual();
        this.cedulaAzul = vehiculo.getCedulaAzul();
        this.seguro = vehiculo.getSeguro();
        this.viajes = vehiculo.getViajes();
        this.conductor = vehiculo.getConductor();
        this.ubicacion = vehiculo.getUbicacion();
    }

    public long getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getColor() {
        return color;
    }

    public Ubicacion getUbicacionActual() {
        return ubicacionActual;
    }

    public Byte[] getCedulaAzul() {
        return cedulaAzul;
    }

    public Byte[] getSeguro() {
        return seguro;
    }

    public Set<Viaje> getViajes() {
        return viajes;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
