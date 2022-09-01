package com.desafiosea.demo.service;

import com.desafiosea.demo.dto.SetorDTO;

import java.util.List;

public interface SetorService {
    SetorDTO save(SetorDTO setorDTO);
    List<SetorDTO> findAll();
}
