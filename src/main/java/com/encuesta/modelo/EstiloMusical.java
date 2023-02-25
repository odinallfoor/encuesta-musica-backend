package com.encuesta.modelo;

import javax.persistence.*;

@Entity
@Table(name = "estilos_musicales")
public class EstiloMusical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ESTILO_ID")
    private Long estilo_id;

    @Column(name = "estiloNombre", length = 50, nullable = false, unique = true)
    private String estiloNombre;

    @OneToOne(mappedBy = "estilo", cascade = CascadeType.ALL)
    private Encuestado encuestado;

    public EstiloMusical(){
    }

    public EstiloMusical(Long estilo_id, String estiloNombre, Encuestado encuestado) {
        super();
        //this.estilo_id = estilo_id;
        this.estiloNombre = estiloNombre;
        this.encuestado = encuestado;
    }

    public Long getId() {
        return estilo_id;
    }

    public void setId(Long id) {
        this.estilo_id = id;
    }

    public String getEstiloNombre() {
        return estiloNombre;
    }

    public void setEstiloNombre(String estiloNombre) {
        this.estiloNombre = estiloNombre;
    }

    public Encuestado getEncuestado() {
        return encuestado;
    }

    public void setEncuestado(Encuestado encuestado) {
        this.encuestado = encuestado;
    }
}
