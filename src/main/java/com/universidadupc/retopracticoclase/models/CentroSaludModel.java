package com.universidadupc.retopracticoclase.models;

import javax.persistence.*;

@Entity
@Table(name="tbl_centro_salud")
public class CentroSaludModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long codigo;
    private String nombre;
    private String tipo;
    private Integer calificacionInfraestructura;
    private Integer calificacionServicios;
    private Boolean ambulancias;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCalificacionInfraestructura() {
        return calificacionInfraestructura;
    }

    public void setCalificacionInfraestructura(Integer calificacionInfraestructura) {
        this.calificacionInfraestructura = calificacionInfraestructura;
    }

    public Integer getCalificacionServicios() {
        return calificacionServicios;
    }

    public void setCalificacionServicios(Integer calificacionServicios) {
        this.calificacionServicios = calificacionServicios;
    }

    public Boolean getAmbulancias() {
        return ambulancias;
    }

    public void setAmbulancias(Boolean ambulancias) {
        this.ambulancias = ambulancias;
    }
}
