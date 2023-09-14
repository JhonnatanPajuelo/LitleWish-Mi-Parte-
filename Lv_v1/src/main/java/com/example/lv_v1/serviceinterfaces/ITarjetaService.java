package com.example.lv_v1.serviceinterfaces;

import com.example.lv_v1.entities.Tarjeta;

import java.util.List;

public interface ITarjetaService {
    public void insert(Tarjeta tarjeta);
    public List<Tarjeta> list();
}
