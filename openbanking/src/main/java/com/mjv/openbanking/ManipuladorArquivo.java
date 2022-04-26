package com.mjv.openbanking;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManipuladorArquivo {

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "/Users/alexandrenazato/Documents/GitHub/mjv-java-school/banco_central/movimentacoes";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

}
