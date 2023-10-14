package com.tusevi.viajesTusevi.dtos;

import com.tusevi.viajesTusevi.modelos.Comentario;
import com.tusevi.viajesTusevi.modelos.Conductor;
import com.tusevi.viajesTusevi.modelos.Usuario;
import com.tusevi.viajesTusevi.modelos.Viaje;

import java.time.LocalDateTime;

public class ComentarioDTO {
    private long id;
    private Integer calificacion;
    private String comentario;
    private LocalDateTime fecha;
    private Usuario usuario;
    private Conductor conductor;
    private Viaje viaje;
    public ComentarioDTO(Comentario comentario) {
        this.id = comentario.getId();
        this.calificacion = comentario.getCalificacion();
        this.comentario = comentario.getComentario();
        this.fecha = comentario.getFecha();
        this.usuario = comentario.getUsuario();
        this.conductor = comentario.getConductor();
        this.viaje = comentario.getViaje();
    }

    public long getId() {
        return id;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Viaje getViaje() {
        return viaje;
    }
}
