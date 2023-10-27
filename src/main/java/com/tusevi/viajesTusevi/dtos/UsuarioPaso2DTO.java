package com.tusevi.viajesTusevi.dtos;

import com.tusevi.viajesTusevi.modelos.*;

import java.util.HashSet;
import java.util.Set;

public class UsuarioPaso2DTO {
    private long id;
    private String celular;
    private long DNI;
    private String ubicacionActual;
    private Set<Viaje> viajes;
    private Set<Comentario> comentarios;
    private Set<OrdenPago> ordenPagos;
    private Usuario usuario;

    public UsuarioPaso2DTO() {
    }
    public UsuarioPaso2DTO(UsuarioPaso2 usuarioPaso2){
        this.id = usuarioPaso2.getDNI();
        this.celular = usuarioPaso2.getCelular();
        this.DNI = usuarioPaso2.getDNI();
        this.viajes = usuarioPaso2.getViajes();
        this.comentarios = usuarioPaso2.getComentarios();
        this.ordenPagos = usuarioPaso2.getOrdenPagos();
        this.usuario = usuarioPaso2.getUsuario();
    }

    public long getId() {
        return id;
    }

    public String getCelular() {
        return celular;
    }

    public long getDNI() {
        return DNI;
    }

    public String getUbicacionActual() {
        return ubicacionActual;
    }

    public Set<Viaje> getViajes() {
        return viajes;
    }

    public Set<Comentario> getComentarios() {
        return comentarios;
    }

    public Set<OrdenPago> getOrdenPagos() {
        return ordenPagos;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
