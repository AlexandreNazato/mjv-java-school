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

import com.mjv.projetofinal.model.cadastro.Veterinario;
import com.mjv.projetofinal.repository.VeterinarioRepository;

@RestController
@RequestMapping("/veterinario")
public class VeterinarioController {
	@Autowired
	private VeterinarioRepository veterinario;
	
	@PostMapping
	public void gravar(@RequestBody Veterinario oVeterinario) {
		veterinario.save(oVeterinario);
	}
	@PutMapping
	public void alterar(@RequestBody Veterinario oVeterinario) {
		veterinario.save(oVeterinario);
	}
	@GetMapping
	public List<Veterinario> listar(){
		return veterinario.findAll();
	}
	@DeleteMapping ("/{id}")
	public void deletar(@PathVariable ("id") Integer id) {
		veterinario.deleteById(id);
	}
	
}
