package com.example.lv_v1.serviceimplements;

import com.example.lv_v1.entities.Proyecto;
import com.example.lv_v1.repositories.IPagoRepository;
import com.example.lv_v1.repositories.IProyectoRepository;
import com.example.lv_v1.serviceinterfaces.IProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoServiceImplement implements IProyectoService {
    @Autowired
    private IProyectoRepository poR;

    @Override
    public void insert(Proyecto pago) {
        poR.save(pago);
    }

    @Override
    public List<Proyecto> list() {
        return poR.findAll();
    }
}
