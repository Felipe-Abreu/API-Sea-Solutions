package com.desafiosea.demo.service.impl;

import com.desafiosea.demo.dto.SetorDTO;
import com.desafiosea.demo.exceptions.BadRequestException;
import com.desafiosea.demo.model.Setor;
import com.desafiosea.demo.repository.SetorRepository;
import com.desafiosea.demo.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class SetorServiceImpl implements SetorService {
    @Autowired
    private SetorRepository setorRepository;

    @Override
    public SetorDTO save(SetorDTO setorDTO) {
        if(Objects.nonNull(setorRepository.findByName(setorDTO.getName()))){
           throw new BadRequestException("Nome duplicado!");
        }
        return setorRepository.save(setorDTO.toEntity()).toDto();
    }

    @Override
    public List<SetorDTO> findAll() {
        return setorRepository.findAll().stream().map(Setor::toDto).collect(Collectors.toList());
    }
}
