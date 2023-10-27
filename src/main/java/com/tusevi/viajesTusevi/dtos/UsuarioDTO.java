package com.tusevi.viajesTusevi.dtos;

import com.tusevi.viajesTusevi.modelos.*;

import java.util.Set;

public class UsuarioDTO {
    private long id;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String correo;
    private Integer codigoValidacion; // Código de validación
    private boolean registroCompleto = false; // Indica si el registro está completo
    private UsuarioPaso2 usuarioPaso2;
    public UsuarioDTO(Usuario usuario){
        this.id = usuario.getId();
        this.nombre = usuario.getNombre();
        this.apellido = usuario.getApellido();
        this.correo = usuario.getCorreo();
        this.contraseña = usuario.getContraseña();
        this.codigoValidacion = usuario.getCodigoValidacion();
        this.registroCompleto = usuario.isRegistroCompleto();
        this.usuarioPaso2 = usuario.getUsuarioPaso2();
    }

    public long getId() {
        return id;
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
    public String getCorreo() {
        return correo;
    }
    public Integer getCodigoValidacion() {
        return codigoValidacion;
    }

    public boolean isRegistroCompleto() {
        return registroCompleto;
    }

    public UsuarioPaso2 getUsuarioPaso2() {
        return usuarioPaso2;
    }
}
