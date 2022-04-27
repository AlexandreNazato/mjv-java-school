package com.mjv.agualuz.notification.model;

import java.time.LocalDateTime;

public class SistemaAguaLuzNotification {

	public SistemaAguaLuzNotification() {
	Contrato contrato = new Contrato();
	contrato.setDataHora(LocalDateTime.of(2022, 2,21,16,0));
	contrato.setNumeroProtocolo(2022025687L);
	contrato.setServico("Agua");
	contrato.setValor(127.33);
	
	Cadastro cliente = new Cadastro();
	cliente.setEndereco(endereco);
	
	cliente.setCpf("234.765.987-27");
	cliente.setNome("Gleison Sampaio");
	Endereco endereco = new Endereco();
	endereco.setBairro("Santo Antonio");
	endereco.setCidade("São Paulo");
	endereco.setEstado("SP");
	endereco.setLogradouro("Rua das Marias");
	endereco.setNumero("243");
	endereco.setComplemento("Bloco C");
	
	
	
	GeradorMensagem gm =new
	
	
	}

}
