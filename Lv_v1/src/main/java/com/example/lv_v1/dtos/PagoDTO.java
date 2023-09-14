package com.example.lv_v1.dtos;

import com.example.lv_v1.entities.Tarjeta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PagoDTO {
    private int idPago;
    private int monto;
    private LocalDate fecha;
    private Tarjeta tarjeta;

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
