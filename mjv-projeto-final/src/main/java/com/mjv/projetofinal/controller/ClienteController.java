package com.mjv.projetofinal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")

public class ClienteController {

	@postMapping
	
	public void gravar(Cliente cliente) {
		
	}
}
