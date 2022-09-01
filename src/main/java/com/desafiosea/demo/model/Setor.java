package com.desafiosea.demo.model;

import com.desafiosea.demo.dto.SetorDTO;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "setor")
@Data
public class Setor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "setor_id")
    private List<Cargo> cargos;

    public SetorDTO toDto(){
        SetorDTO setorDTO = new SetorDTO();
        setorDTO.setId(id);
        setorDTO.setName(name);
        setorDTO.setCargos(cargos.stream().map(Cargo::toDto).collect(Collectors.toList()));

        return setorDTO;
    }
}
