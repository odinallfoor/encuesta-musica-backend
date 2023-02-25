package com.encuesta.repositorio;

import com.encuesta.modelo.Encuestado;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Import(Encuestado.class)
public interface EncuestadoRepositorio extends JpaRepository<Encuestado, Long> {
}