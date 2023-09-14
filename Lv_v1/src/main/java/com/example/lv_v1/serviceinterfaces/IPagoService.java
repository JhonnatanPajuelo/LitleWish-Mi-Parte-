package com.example.lv_v1.serviceinterfaces;

import com.example.lv_v1.entities.Pago;

import java.util.List;

public interface IPagoService {
    public void insert(Pago pago);
    public List<Pago>list();
}
