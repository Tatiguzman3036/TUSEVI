package com.tusevi.viajesTusevi.repositorios;

import com.tusevi.viajesTusevi.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {
}
