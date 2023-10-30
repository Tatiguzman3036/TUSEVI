package com.tusevi.viajesTusevi.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(strategy = "native", name = "native")
    private long id;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String correo;
    private Integer codigoValidacion; // Código de validación
    private boolean registroCompleto = false; // Indica si el registro está completo
    @OneToOne
    private UsuarioPaso2 usuarioPaso2;
    public Usuario() {
    }

    public Usuario(long DNI,String nombre, String apellido,String correo,String contraseña,Integer codigoValidacion,boolean registroCompleto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña =contraseña;
        this.codigoValidacion = codigoValidacion;
        this.registroCompleto = registroCompleto;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getCodigoValidacion() {
        return codigoValidacion;
    }

    public void setCodigoValidacion(Integer codigoValidacion) {
        this.codigoValidacion = codigoValidacion;
    }

    public boolean isRegistroCompleto() {
        return registroCompleto;
    }

    public void setRegistroCompleto(boolean registroCompleto) {
        this.registroCompleto = registroCompleto;
    }

    public UsuarioPaso2 getUsuarioPaso2() {
        return usuarioPaso2;
    }

    public void setUsuarioPaso2(UsuarioPaso2 usuarioPaso2) {
        this.usuarioPaso2 = usuarioPaso2;
    }
}
