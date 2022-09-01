package com.desafiosea.demo.model;

import com.desafiosea.demo.dto.CargoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cargo")
@Data
public class Cargo {//Cargo 1:1 Setor
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

    public CargoDTO toDto(){
        CargoDTO cargoDTO = new CargoDTO();
        cargoDTO.setId(id);
        cargoDTO.setName(name);
        return cargoDTO;
    }

}
