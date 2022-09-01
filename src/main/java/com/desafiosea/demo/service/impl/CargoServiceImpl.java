package com.desafiosea.demo.service.impl;

import com.desafiosea.demo.dto.CargoDTO;
import com.desafiosea.demo.exceptions.BadRequestException;
import com.desafiosea.demo.model.Cargo;
import com.desafiosea.demo.repository.CargoRepository;
import com.desafiosea.demo.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CargoServiceImpl implements CargoService {
    @Autowired
    private CargoRepository cargoRepository;

    @Override
    public CargoDTO save(CargoDTO cargoDTO) {
        if(Objects.nonNull(cargoRepository.findByName(cargoDTO.getName()))){
            throw new BadRequestException("Nome duplicado!");
        }
        return cargoRepository.save(cargoDTO.toEntity()).toDto();
    }

    @Override
    public List<CargoDTO> findAll() {
        return cargoRepository.findAll().stream().map(Cargo::toDto).collect(Collectors.toList());
    }
}
