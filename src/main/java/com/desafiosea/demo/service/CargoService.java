package com.desafiosea.demo.service;

import com.desafiosea.demo.dto.CargoDTO;
import com.desafiosea.demo.model.Cargo;

import java.util.List;

public interface CargoService {
    CargoDTO save(CargoDTO cargoDTO);

    List<CargoDTO> findAll();
}
