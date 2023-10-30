package com.tusevi.viajesTusevi.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class UsuarioPaso2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(strategy = "native", name = "native")
    private long id;
    private String celular;
    private long DNI;
    private String ubicacionActual;
    @OneToMany(mappedBy = "usuarioPaso2", fetch = FetchType.EAGER)
    private Set<Viaje> viajes = new HashSet<>();
    @OneToMany(mappedBy = "usuarioPaso2", fetch = FetchType.EAGER)
    private Set<Comentario> comentarios = new HashSet<>();
    @OneToMany (mappedBy = "usuarioPaso2",fetch = FetchType.EAGER)
    private Set<OrdenPago> ordenPagos = new HashSet<>();
    @OneToOne
    private Usuario usuario;
    public UsuarioPaso2() {
    }

    public UsuarioPaso2(long id, String celular, long DNI, String codigoValidacion, boolean registroCompleto) {
        this.id = id;
        this.celular = celular;
        this.DNI = DNI;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }
    public Set<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(Set<Viaje> viajes) {
        this.viajes = viajes;
    }
    public void addViajes (Viaje viaje){
        viaje.setUsuarioPaso2(this);
        viajes.add(viaje);
    }

    public Set<Comentario> getComentarios() {
        return comentarios;
    }
    public void addComentarios(Comentario comentario){
        comentario.setUsuarioPaso2(this);
        comentarios.add(comentario);
    }
    public Set<OrdenPago> getOrdenPagos() {
        return ordenPagos;
    }
    public void addPagos (OrdenPago ordenPago){
        ordenPago.setUsuarioPaso2(this);
        ordenPagos.add(ordenPago);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
