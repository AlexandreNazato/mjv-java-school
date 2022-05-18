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

import com.mjv.projetofinal.model.cadastro.Raca;
import com.mjv.projetofinal.repository.RacaRepository;

@RestController
@RequestMapping("/raca")
public class RacaController {
	@Autowired
	private RacaRepository raca;
	
	@PostMapping
	public void gravar(@RequestBody Raca oRaca) {
		raca.save(oRaca);
	}
	@PutMapping
	public void alterar(@RequestBody Raca oRaca) {
		raca.save(oRaca);
	}
	@GetMapping
	public List<Raca> listar(){
		return raca.findAll();
	}
	@DeleteMapping ("/{id}")
	public void deletar(@PathVariable ("id") Integer id) {
		raca.deleteById(id);
	}	
}
