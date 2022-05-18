package com.mjv.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetofinal.model.cadastro.Animal;
import com.mjv.projetofinal.model.cadastro.Raca;

public interface RacaRepository extends JpaRepository<Raca, Integer> {

	void save(Animal oRaca);

}
