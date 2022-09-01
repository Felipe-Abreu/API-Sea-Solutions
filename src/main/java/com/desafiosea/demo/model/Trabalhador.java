package com.desafiosea.demo.model;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;

@Entity
@Data
public class Trabalhador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @CPF
    private String cpf;

    @OneToOne
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;

    @OneToOne
    @JoinColumn(name = "setor_id")
    private Setor setor;
}
