package com.tusevi.viajesTusevi.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(strategy = "native", name = "native")
    private long id;
    private String matricula;
    private String modelo;
    private TipoVehiculo tipoVehiculo;
    private String color;
    private Byte[] cedulaAzul;
    private Byte[] seguro;
    @OneToMany(mappedBy = "vehiculo", fetch = FetchType.EAGER)
    private Set<Viaje> viajes = new HashSet<>();
    @OneToOne(fetch = FetchType.EAGER)
    private Conductor conductor;
    @OneToOne(fetch = FetchType.EAGER)
    private Ubicacion ubicacion;
    public Vehiculo() {
    }

    public Vehiculo(String matricula, String modelo, TipoVehiculo tipoVehiculo, String color, Byte[] cedulaAzul, Byte[] seguro) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.color = color;
        this.cedulaAzul = cedulaAzul;
        this.seguro = seguro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Byte[] getCedulaAzul() {
        return cedulaAzul;
    }

    public void setCedulaAzul(Byte[] cedulaAzul) {
        this.cedulaAzul = cedulaAzul;
    }

    public Byte[] getSeguro() {
        return seguro;
    }

    public void setSeguro(Byte[] seguro) {
        this.seguro = seguro;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Set<Viaje> getViajes() {
        return viajes;
    }

    public void addViajes(Viaje viaje) {
        viaje.setVehiculo(this);
        viajes.add(viaje);
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
}
