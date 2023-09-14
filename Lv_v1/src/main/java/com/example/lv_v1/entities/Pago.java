package com.example.lv_v1.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name = "Pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    @Column(name = "monto")
    private int monto;
    @Column(name = "fecha")
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "idtarjeta")
    private Tarjeta tarjeta;

    public Pago(){

    }

    public Pago(int idPago, int monto, LocalDate fecha, Tarjeta tarjeta) {
        this.idPago = idPago;
        this.monto = monto;
        this.fecha = fecha;
        this.tarjeta = tarjeta;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
}
