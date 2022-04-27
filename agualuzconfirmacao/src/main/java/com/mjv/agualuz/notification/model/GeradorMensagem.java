package com.mjv.agualuz.notification.model;

import com.mjv.agualuz.notification.util.FormatadorUtil;

public class GeradorMensagem {
public void gerar(Contrato contrato) {
	StringBuilder sb =new StringBuilder();
	Cadastro cliente = contrato.getCliente();
	String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
	sb.append(String.format("Senhor(a) %s cpf de numero %s, ", cliente.getNome(), cpfFormatado));
	sb.append(Srti)
	//	sb.append("Senhor(a) " + cliente.getNome() + " CPF de numero " + cliente.getCpf());
	
//	System.out.println(sb.toString());

}

	

}
