package com.desafiosea.demo.repository;

import com.desafiosea.demo.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {
    Cargo findByName(String name);
}
