package com.example.lv_v1.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProyecto;
    @Column(name = "descripcion",nullable = false,length = 50)
    private String descripcion;

    @Column(name="fechaInicio", nullable = false)
    private LocalDate fechaInicio;
    @Column(name="fechaFin", nullable = false)
    private LocalDate fechaFin;


    //@OneToOne
    //@JoinColumn(name = "idPuntuacion")
    //private Puntuacion puntuacion;

    //@ManyToOne
    //@JoinColumn(name = "idSolicitud")
    //private Solicitud solicitud;
    //@OneToOne
    //@JoinColumn(name = "idComentario")
    //private Comentario comentario;


    public Proyecto() {
    }

    public Proyecto(int idProyecto, String descripcion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idProyecto = idProyecto;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

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
