package com.example.lv_v1.serviceimplements;

import com.example.lv_v1.entities.Pago;
import com.example.lv_v1.repositories.IPagoRepository;
import com.example.lv_v1.serviceinterfaces.IPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PagoServiceImplement implements IPagoService {
    @Autowired
    private IPagoRepository pR;


    @Override
    public void insert(Pago pago) {
        pR.save(pago);
    }

    @Override
    public List<Pago> list() {
        return pR.findAll();
    }
}
