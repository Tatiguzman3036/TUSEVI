package com.tusevi.viajesTusevi.dtos;

import com.tusevi.viajesTusevi.modelos.*;

import java.time.LocalDateTime;

public class ComentarioDTO {
    private long id;
    private Integer calificacion;
    private String comentario;
    private LocalDateTime fecha;
    private UsuarioPaso2 usuarioPaso2;
    private Conductor conductor;
    private Viaje viaje;
    public ComentarioDTO(Comentario comentario) {
        this.id = comentario.getId();
        this.calificacion = comentario.getCalificacion();
        this.comentario = comentario.getComentario();
        this.fecha = comentario.getFecha();
        this.usuarioPaso2 = comentario.getUsuarioPaso2();
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

    public UsuarioPaso2 getUsuarioPaso2() {
        return usuarioPaso2;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Viaje getViaje() {
        return viaje;
    }
}
