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

import com.mjv.projetofinal.model.cadastro.Tutor;
import com.mjv.projetofinal.repository.TutorRepository;

@RestController
@RequestMapping("/tutor")
public class TutorController {
	@Autowired
	private TutorRepository tutor;
	
	@PostMapping
	public void gravar(@RequestBody Tutor oTutor) {
		tutor.save(oTutor);
	}
	@PutMapping
	public void alterar(@RequestBody Tutor oTutor) {
		tutor.save(oTutor);
	}
	@GetMapping
	public List<Tutor> listar(){
		return tutor.findAll();
	}
	@DeleteMapping ("/{id}")
	public void deletar(@PathVariable ("id") Integer id) {
		tutor.deleteById(id);
	}
}
