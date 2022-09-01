package com.desafiosea.demo.repository;

import com.desafiosea.demo.model.Setor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long> {
    Setor findByName(String name);
}
