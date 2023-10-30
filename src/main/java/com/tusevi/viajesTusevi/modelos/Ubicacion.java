package com.tusevi.viajesTusevi.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Ubicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(strategy = "native", name = "native")
    private long id;
    private String direccion;
    private double latitud;
    private double longitud;
    @OneToOne(fetch = FetchType.EAGER)
    private Vehiculo vehiculo;
    @OneToOne(fetch = FetchType.EAGER)
    private Viaje viaje;

    public Ubicacion() {
    }

    public Ubicacion(String direccion, double latitud,double longitud) {
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
}
