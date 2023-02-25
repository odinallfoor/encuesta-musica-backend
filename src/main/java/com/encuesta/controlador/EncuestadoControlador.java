package com.encuesta.controlador;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.encuesta.modelo.Encuestado;
import com.encuesta.repositorio.EncuestadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class EncuestadoControlador {

    @Autowired
    private EncuestadoRepositorio repositorio;

    /*
        Metodo para listar a todos los encuestados con sus respuestas.
     */
    @GetMapping("/encuestados")
    public List<Encuestado> listarTodosEncuestados() {
        return repositorio.findAll();
    }

    /*
        Metodo para guardar nuevos encuestados con sus respuestas.
     */
    @PostMapping("/encuestados")
    public Encuestado guardarEncuestado(@RequestBody Encuestado encuestado){
        System.out.println(encuestado);
        return repositorio.save(encuestado);
    }
}
