package com.mjv.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetofinal.model.cadastro.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
