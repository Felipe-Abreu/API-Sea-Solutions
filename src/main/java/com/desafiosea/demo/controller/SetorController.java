package com.desafiosea.demo.controller;

import com.desafiosea.demo.dto.SetorDTO;
import com.desafiosea.demo.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/setores")
public class SetorController {
    @Autowired
    private SetorService service;

    @PostMapping
    public ResponseEntity<SetorDTO> save(@RequestBody SetorDTO setorDTO){
        return ResponseEntity.ok(service.save(setorDTO));
    }

    @GetMapping
    public ResponseEntity<List<SetorDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
}
