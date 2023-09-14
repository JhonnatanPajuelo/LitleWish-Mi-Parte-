package com.example.lv_v1.entities;

import javax.persistence.*;

@Entity
@Table(name = "Tarjeta")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjeta;
    @Column(name = "numeroTarjeta",nullable = false)
    private int numeroTarjeta;
    @Column(name = "fechaexp",nullable = false,length = 50)
    private String fechaexp;
    @Column(name = "nombre",length = 50,nullable = false)
    private String nombre;
    @Column(name = "apellido",length = 50,nullable = false)
    private String apellido;
    @Column(name = "cvv",nullable = false)
    private int cvv;

    public Tarjeta() {
    }

    public Tarjeta(int idTarjeta, int numeroTarjeta, String fechaexp, String nombre, String apellido, int cvv) {
        this.idTarjeta = idTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaexp = fechaexp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cvv = cvv;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaexp() {
        return fechaexp;
    }

    public void setFechaexp(String fechaexp) {
        this.fechaexp = fechaexp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
