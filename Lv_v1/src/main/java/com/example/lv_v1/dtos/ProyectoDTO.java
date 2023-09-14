package com.example.lv_v1.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class ProyectoDTO {

    private int idProyecto;

    private String descripcion;


    private LocalDate fechaInicio;

    private LocalDate fechaFin;



    //private Puntuacion puntuacion;


    //private Solicitud solicitud;

    //private Comentario comentario;

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
