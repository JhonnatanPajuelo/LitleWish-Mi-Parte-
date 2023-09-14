package com.example.lv_v1.repositories;

import com.example.lv_v1.entities.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface IPagoRepository extends JpaRepository<Pago, Integer> {

}
