package com.tusevi.viajesTusevi.dtos;

import com.tusevi.viajesTusevi.modelos.Comentario;
import com.tusevi.viajesTusevi.modelos.OrdenPago;
import com.tusevi.viajesTusevi.modelos.Usuario;
import com.tusevi.viajesTusevi.modelos.Viaje;

import java.util.Set;
import java.util.stream.Collectors;

public class UsuarioDTO {
    private long id;
    private long DNI;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String celular;
    private String correo;
    private String ubicacionActual;
    private Set<Viaje> viajes;
    private Set<Comentario> comentarios;
    private Set<OrdenPago> ordenPagos;
    public UsuarioDTO(Usuario usuario){
        this.id = usuario.getId();
        this.DNI = usuario.getDNI();
        this.nombre = usuario.getNombre();
        this.apellido = usuario.getApellido();
        this.celular = usuario.getCelular();
        this.correo = usuario.getCorreo();
        //this.ubicacionActual = usuario.getUbicacionActual();
        this.viajes = usuario.getViajes();
        this.comentarios = usuario.getComentarios();
        this.ordenPagos = usuario.getOrdenPagos();
        this.contraseña = usuario.getContraseña();
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

    public String getContraseña() {
        return contraseña;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
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
}
