package com.tusevi.viajesTusevi.modelos;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class OrdenPago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(strategy = "native", name = "native")
    private long id;
    private MetodoDePago metodoDePago;
    private Integer costo;
    private EstadoDePago estadoDePago;
    private LocalDateTime fecha;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @OneToMany(mappedBy = "pagos")
    private Set<ConductorPago> conductorPagos = new HashSet<>();

    public OrdenPago() {
    }

    public OrdenPago(MetodoDePago metodoDePago, Integer costo, EstadoDePago estadoDePago,LocalDateTime fecha) {
        this.metodoDePago = metodoDePago;
        this.costo = costo;
        this.estadoDePago = estadoDePago;
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public EstadoDePago getEstadoDePago() {
        return estadoDePago;
    }

    public void setEstadoDePago(EstadoDePago estadoDePago) {
        this.estadoDePago = estadoDePago;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<ConductorPago> getConductorPagos() {
        return conductorPagos;
    }

    public void addConductorPago(ConductorPago conductorPago){
        conductorPago.setOrdenPago(this);
        conductorPagos.add(conductorPago);
    }
}
