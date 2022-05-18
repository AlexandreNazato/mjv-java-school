package com.mjv.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetofinal.model.cadastro.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
