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

import com.mjv.projetofinal.model.cadastro.Voluntario;
import com.mjv.projetofinal.repository.VoluntarioRepository;

@RestController
@RequestMapping("/voluntario")
public class VoluntarioController {
	@Autowired
	private VoluntarioRepository voluntario;
	
	
	@PostMapping
	public void gravar(@RequestBody Voluntario oVoluntario) {
		voluntario.save(oVoluntario);
	}
	@PutMapping
	public void alterar(@RequestBody Voluntario oVoluntario) {
		voluntario.save(oVoluntario);
	}
	@GetMapping
	public List<Voluntario> listar(){
		return voluntario.findAll();
	}
	@DeleteMapping ("/{id}")
	public void deletar(@PathVariable ("id") Integer id) {
		voluntario.deleteById(id);
	}
	
}
