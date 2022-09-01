package com.desafiosea.demo.dto;

import com.desafiosea.demo.model.Setor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class SetorDTO {
    private Long id;
    private String name;
    List<CargoDTO> cargos;

    public Setor toEntity(){
        Setor setor = new Setor();
        setor.setName(name);
        setor.setCargos(cargos.stream().map(CargoDTO::toEntity).collect(Collectors.toList()));
        return setor;

    }
}
