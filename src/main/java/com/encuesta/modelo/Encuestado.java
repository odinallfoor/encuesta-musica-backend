package com.encuesta.modelo;

import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;

@Entity
@Table(name = "encuestados")
public class Encuestado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ENCUESTADO_ID")
    private Long encuestado_id;

    @Column(name = "email", length = 150, nullable = false, unique = true)
    private String email;

    @OneToOne
    @JoinColumn(name = "FK_ESTILO_ID", updatable = false, referencedColumnName = "estilo_id")
    private EstiloMusical estilo;

    public Encuestado() {
    }

    public Encuestado(Long encuestado_id, String email, EstiloMusical estilo) {
        super();
        //this.encuestado_id = encuestado_id;
        this.email = email;
        this.estilo = estilo;
    }

    public Long getId() {
        return encuestado_id;
    }

    public void setId(Long id) {
        this.encuestado_id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EstiloMusical getEstilo() {
        return estilo;
    }

    public void setEstilo(EstiloMusical estilo) {
        this.estilo = estilo;
    }
}
