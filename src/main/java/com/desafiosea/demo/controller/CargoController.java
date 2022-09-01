package com.desafiosea.demo.controller;

import com.desafiosea.demo.dto.CargoDTO;
import com.desafiosea.demo.model.Cargo;
import com.desafiosea.demo.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoController {
    @Autowired
    private CargoService cargoService;

    @PostMapping
    public ResponseEntity<CargoDTO> save(@RequestBody CargoDTO cargoDTO){
        return ResponseEntity.ok(cargoService.save(cargoDTO));
    }

    @GetMapping
    public ResponseEntity<List<CargoDTO>> findAll(){
        return ResponseEntity.ok(cargoService.findAll());
    }

}
