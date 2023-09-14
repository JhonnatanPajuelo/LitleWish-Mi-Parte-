package com.example.lv_v1.repositories;

import com.example.lv_v1.entities.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITarjetaRepository extends JpaRepository<Tarjeta,Integer> {
}
