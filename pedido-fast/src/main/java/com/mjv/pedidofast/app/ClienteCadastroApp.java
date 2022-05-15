package com.mjv.pedidofast.app;

import com.mjv.pedidofast.model.cadastro.Cliente;
import com.mjv.pedidofast.repository.ClienteJDBCRepositoryDelete;
import com.mjv.pedidofast.repository.ClienteJDBCRepositoryInsert;
import com.mjv.pedidofast.repository.ClienteJDBCRepositoryUpdate;

public class ClienteCadastroApp {
	public static void main(String[] args) {
		//SCANNER
		//INTERFACE GRAFICO DO SISTEMA
		//APP - API REST
		
//		Cliente gleyson = new Cliente();
//		gleyson.setCpf("68678");
//		gleyson.setNome("GLEYSON SAMPAIO");
//		gleyson.setWhatsapp(118978898L);
//		
//
//		ClienteJDBCRepositoryInsert repository = new ClienteJDBCRepositoryInsert();
//		repository.incluir(gleyson);
		
		
		Cliente cliente = new Cliente();
		cliente.setCpf("68678");
		cliente.setNome("ALEXANDRE NAZATO");
		cliente.setWhatsapp(1974652638663L);
		

		ClienteJDBCRepositoryInsert repository = new ClienteJDBCRepositoryInsert();
		repository.incluir(cliente);
		
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(1);
		cliente2.setNome("ALEXANDRE NAZATO JUNIOR");
		
		ClienteJDBCRepositoryUpdate repository2 = new ClienteJDBCRepositoryUpdate();
		repository2.update(cliente2);
		
		
		Cliente cliente3 = new Cliente();
		cliente3.setId(1);
		
		ClienteJDBCRepositoryDelete repository3 = new ClienteJDBCRepositoryDelete();
		repository3.delete(cliente3);
	}
}
