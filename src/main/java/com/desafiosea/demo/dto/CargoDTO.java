package com.desafiosea.demo.dto;

import com.desafiosea.demo.model.Cargo;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CargoDTO {
    private Long id;
    private String name;

    public Cargo toEntity(){
       Cargo cargo = new Cargo();
       cargo.setId(id);
       cargo.setName(name);

       return cargo;
    }
}
