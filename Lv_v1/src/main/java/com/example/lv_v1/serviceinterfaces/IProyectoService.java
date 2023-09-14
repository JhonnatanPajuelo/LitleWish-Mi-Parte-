package com.example.lv_v1.serviceinterfaces;


import com.example.lv_v1.entities.Proyecto;

import java.util.List;

public interface IProyectoService {
    public void insert(Proyecto pago);
    public List<Proyecto> list();
}
