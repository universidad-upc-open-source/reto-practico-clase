package com.universidadupc.retopracticoclase.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_centro_salud")
public class CentroSalud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long codigo;
    private String nombre;
    private String tipo;
    @Column(name="calificacion_infraestructura")
    private Integer calificacionInfraestructura;
    @Column(name="calificacion_servicios")
    private Integer calificacionServicios;
    private Boolean ambulancias;

    public CentroSalud() {
    }

    public CentroSalud(
        Long codigo,
        String nombre,
        String tipo,
        Integer calificacionInfraestructura,
        Integer calificacionServicios,
        Boolean ambulancias
    ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.calificacionInfraestructura = calificacionInfraestructura;
        this.calificacionServicios = calificacionServicios;
        this.ambulancias = ambulancias;
    }

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
