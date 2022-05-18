package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.model.cadastro.Pessoa;
import com.mjv.projetofinal.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	@Autowired
	private PessoaRepository pessoa;
	
	@PostMapping
	public void gravar(@RequestBody Pessoa oPessoa) {
		pessoa.save(oPessoa);
	}
	@PutMapping
	public void alterar(@RequestBody Pessoa oPessoa) {
		pessoa.save(oPessoa);
	}
	@GetMapping
	public List<Pessoa> listar(){
		return pessoa.findAll();
	}
	@DeleteMapping ("/{id}")
	public void deletar(@PathVariable ("id") Integer id) {
		pessoa.deleteById(id);
	}

}
