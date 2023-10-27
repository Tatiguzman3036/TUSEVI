package com.tusevi.viajesTusevi.dtos;

import com.tusevi.viajesTusevi.modelos.Comentario;
import com.tusevi.viajesTusevi.modelos.Conductor;
import com.tusevi.viajesTusevi.modelos.ConductorPago;
import com.tusevi.viajesTusevi.modelos.Viaje;

import java.util.Set;

public class ConductorDTO {
    private long id;
    private long DNI;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
//    private Byte[] registroDeConducir;
    private Comentario comentario;
    private Set<Viaje> viajes;
    private Set<ConductorPago> conductorPago;
    private String contraseña;
    public ConductorDTO (Conductor conductor){
        this.id = conductor.getId();
        this.DNI = conductor.getDNI();
        this.nombre = conductor.getNombre();
        this.apellido = conductor.getApellido();
        this.celular = conductor.getCelular();
        this.correo = conductor.getCorreo();
//        this.registroDeConducir = conductor.getRegistroDeConducir();
        this.comentario = conductor.getComentario();
        this.viajes = conductor.getViajes();
        this.conductorPago = conductor.getConductorPago();
        this.contraseña = conductor.getContraseña();

    }

    public long getId() {
        return id;
    }

    public long getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

//    public Byte[] getRegistroDeConducir() {
//        return registroDeConducir;
//    }

    public Comentario getComentario() {
        return comentario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Set<Viaje> getViajes() {
        return viajes;
    }

    public Set<ConductorPago> getConductorPago() {
        return conductorPago;
    }
}
