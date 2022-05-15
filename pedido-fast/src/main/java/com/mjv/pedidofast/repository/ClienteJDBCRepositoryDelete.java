package com.mjv.pedidofast.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mjv.pedidofast.model.cadastro.Cliente;
import com.mjv.pedidofast.util.jdbc.ConexaoUtil;

public class ClienteJDBCRepositoryDelete {
	//fazer update / delete / selecionar
	private Connection conexao;

	public ClienteJDBCRepositoryDelete() {
		conexao = ConexaoUtil.criarNovaConexao();
	}

	public void delete(Cliente cliente) {
		try {
			String SQL_DELETE = "DELETE FROM cliente WHERE id = ?";
			PreparedStatement preparedStatement = conexao.prepareStatement(SQL_DELETE);

			preparedStatement.setInt(1, cliente.getId());
			

			int row = preparedStatement.executeUpdate();

			// rows affected
			System.out.println(row); // 1
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
