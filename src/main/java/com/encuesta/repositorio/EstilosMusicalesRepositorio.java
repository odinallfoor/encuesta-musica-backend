package com.encuesta.repositorio;

import com.encuesta.modelo.EstiloMusical;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Import(EstiloMusical.class)
public interface EstilosMusicalesRepositorio extends JpaRepository<EstiloMusical, Long> {
}