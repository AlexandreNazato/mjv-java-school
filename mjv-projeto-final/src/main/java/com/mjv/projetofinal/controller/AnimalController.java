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

import com.mjv.projetofinal.model.cadastro.Animal;
import com.mjv.projetofinal.repository.AnimalRepository;

@RestController
@RequestMapping("/animal")
public class AnimalController {
	@Autowired
	private AnimalRepository animal;
	
	@PostMapping
	public void gravar(@RequestBody Animal oAnimal) {
		animal.save(oAnimal);
	}
	@PutMapping
	public void alterar(@RequestBody Animal oAnimal) {
		animal.save(oAnimal);
	}
	@GetMapping
	public List<Animal> listar(){
		return animal.findAll();
	}
	@DeleteMapping ("/{id}")
	public void deletar(@PathVariable ("id") Integer id) {
		animal.deleteById(id);
	}	
}
