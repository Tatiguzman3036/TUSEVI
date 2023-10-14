package com.tusevi.viajesTusevi.modelos;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(strategy = "native", name = "native")
    private long id;
    private long DNI;
    private String nombre;
    private String apellido;
    private Integer celular;
    private String correo;
    private String ubicacionActual;
    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    private Set<Viaje> viajes = new HashSet<>();
    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    private Set<Comentario> comentarios = new HashSet<>();
    @OneToMany (mappedBy = "usuario",fetch = FetchType.EAGER)
    private Set<OrdenPago> ordenPagos = new HashSet<>();

    public Usuario() {
    }

    public Usuario(long DNI,String nombre, String apellido, Integer celular, String correo, String ubicacionActual) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.ubicacionActual = ubicacionActual;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUbicacionActual() {
        return ubicacionActual;
    }

    public void setUbicacionActual(String ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }

    public Set<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(Set<Viaje> viajes) {
        this.viajes = viajes;
    }
    public void addViajes (Viaje viaje){
        viaje.setUsuario(this);
        viajes.add(viaje);
    }

    public Set<Comentario> getComentarios() {
        return comentarios;
    }
    public void addComentarios(Comentario comentario){
        comentario.setUsuario(this);
        comentarios.add(comentario);
    }
    public Set<OrdenPago> getOrdenPagos() {
        return ordenPagos;
    }
    public void addPagos (OrdenPago ordenPago){
        ordenPago.setUsuario(this);
        ordenPagos.add(ordenPago);
    }
}
