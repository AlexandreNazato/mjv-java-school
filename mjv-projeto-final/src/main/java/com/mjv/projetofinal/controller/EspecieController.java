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

import com.mjv.projetofinal.model.cadastro.Especie;
import com.mjv.projetofinal.repository.EspecieRepository;

@RestController
@RequestMapping("/especie")
public class EspecieController {
	@Autowired
	private EspecieRepository especie;
	
	@PostMapping
	public void gravar(@RequestBody Especie oEspecie) {
		especie.save(oEspecie);
	}
	@PutMapping
	public void alterar(@RequestBody Especie oEspecie) {
		especie.save(oEspecie);
	}
	@GetMapping
	public List<Especie> listar(){
		return especie.findAll();
	}
	@DeleteMapping ("/{id}")
	public void deletar(@PathVariable ("id") Integer id) {
		especie.deleteById(id);
	}	
}
