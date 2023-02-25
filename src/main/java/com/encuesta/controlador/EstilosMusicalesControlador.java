package com.encuesta.controlador;

import com.encuesta.modelo.EstiloMusical;
import com.encuesta.repositorio.EstilosMusicalesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200/")
public class EstilosMusicalesControlador {

    @Autowired
    private EstilosMusicalesRepositorio eMRepositorio;

    /*
        Metodo para listar a todos los estilos musicales registrados.
     */
    @GetMapping("/estilosMusicales")
    public List<EstiloMusical> listarTodosEstilosMusicales(){
        return eMRepositorio.findAll();
    }
}
