package com.tusevi.viajesTusevi.repositorios;

import com.tusevi.viajesTusevi.modelos.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ComentarioRepositorio extends JpaRepository<Comentario, Long> {
}
