package com.tusevi.viajesTusevi.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Conductor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(strategy = "native", name = "native")
    private long id;
    private long DNI;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String celular;
    private String correo;
    private Byte[] registroDeConducir;
    @OneToOne( fetch = FetchType.EAGER)
    private Comentario comentario;
    @OneToMany(mappedBy = "conductor", fetch = FetchType.EAGER)
    private Set<Viaje> viajes = new HashSet<>();
    @ManyToMany(mappedBy = "conductor")
    private Set<ConductorPago> conductorPagos = new HashSet<>();

    public Conductor() {
    }

    public Conductor(long DNI, String nombre, String apellido, String celular, String correo,String contraseña) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.contraseña = contraseña;
//        this.registroDeConducir = registroDeConducir;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Byte[] getRegistroDeConducir() {
        return registroDeConducir;
    }

    public void setRegistroDeConducir(Byte[] registroDeConducir) {
        this.registroDeConducir = registroDeConducir;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public Set<Viaje> getViajes() {
        return viajes;
    }
    public void addViajes(Viaje viaje){
        viaje.setConductor(this);
        viajes.add(viaje);
    }

    public Set<ConductorPago> getConductorPago() {
        return conductorPagos;
    }

    public void setConductorPago(Set<ConductorPago> conductorPago) {
        this.conductorPagos = conductorPago;
    }
}
