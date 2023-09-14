package com.example.lv_v1.serviceimplements;


import com.example.lv_v1.entities.Tarjeta;
import com.example.lv_v1.repositories.ITarjetaRepository;
import com.example.lv_v1.serviceinterfaces.ITarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TarjetaServiceimplement implements ITarjetaService {
    @Autowired
    private ITarjetaRepository tR;
    @Override
    public void insert(Tarjeta tarjeta) {
        tR.save(tarjeta);
    }

    @Override
    public List<Tarjeta> list() {
        return tR.findAll();
    }
}
