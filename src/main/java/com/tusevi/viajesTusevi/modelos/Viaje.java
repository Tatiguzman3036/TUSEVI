package com.tusevi.viajesTusevi.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(strategy = "native", name = "native")
    private long id;
    private String ubicacionRecogida;
    private String destino;
    private LocalDateTime fecha;
    private Integer precio;
    private EstadoViaje estado;
    @OneToOne(fetch = FetchType.EAGER)
    private Comentario comentario;
    @OneToOne(mappedBy ="viaje",fetch = FetchType.EAGER)
    private Ubicacion ubicacion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "usuario_id")
    private UsuarioPaso2 usuarioPaso2;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "conductor_id")
    private Conductor conductor;
    public Viaje() {
    }

    public Viaje(String ubicacionRecogida, String destino, LocalDateTime fecha, Integer precio, EstadoViaje estado) {
        this.ubicacionRecogida = ubicacionRecogida;
        this.destino = destino;
        this.fecha = fecha;
        this.precio = precio;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUbicacionRecogida() {
        return ubicacionRecogida;
    }

    public void setUbicacionRecogida(String ubicacionRecogida) {
        this.ubicacionRecogida = ubicacionRecogida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public EstadoViaje getEstado() {
        return estado;
    }

    public void setEstado(EstadoViaje estado) {
        this.estado = estado;
    }

    public UsuarioPaso2 getUsuarioPaso2() {
        return usuarioPaso2;
    }

    public void setUsuarioPaso2(UsuarioPaso2 usuarioPaso2) {
        this.usuarioPaso2 = usuarioPaso2;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
