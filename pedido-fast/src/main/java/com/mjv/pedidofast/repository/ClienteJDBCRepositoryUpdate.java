package com.mjv.pedidofast.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mjv.pedidofast.model.cadastro.Cliente;
import com.mjv.pedidofast.util.jdbc.ConexaoUtil;

public class ClienteJDBCRepositoryUpdate {
	//fazer update / delete / selecionar
	private Connection conexao;

	public ClienteJDBCRepositoryUpdate() {
		conexao = ConexaoUtil.criarNovaConexao();
	}

	public void update(Cliente cliente) {
		try {
			String SQL_UPDATE = "UPDATE cliente SET nome = ? WHERE id = ?";
			PreparedStatement preparedStatement = conexao.prepareStatement(SQL_UPDATE);

			preparedStatement.setString(1, cliente.getNome());
			preparedStatement.setInt(2, cliente.getId());
			

			int row = preparedStatement.executeUpdate();

			// rows affected
			System.out.println(row); // 1
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
