package com.example.lv_v1.controllers;

import com.example.lv_v1.dtos.ProyectoDTO;
import com.example.lv_v1.dtos.TarjetaDTO;
import com.example.lv_v1.entities.Proyecto;
import com.example.lv_v1.entities.Tarjeta;
import com.example.lv_v1.serviceinterfaces.IProyectoService;
import com.example.lv_v1.serviceinterfaces.ITarjetaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {

    @Autowired
    private IProyectoService poS;

    @PostMapping
    public void Registrar(@RequestBody ProyectoDTO dto){
        ModelMapper m=new ModelMapper();
        Proyecto t=m.map(dto,Proyecto.class);
        poS.insert(t);
    }
    @GetMapping//obtener
    public List<ProyectoDTO> listar(){
        //Usamos get para obtener los
        return  poS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ProyectoDTO.class);
        }).collect(Collectors.toList());
    }
}
