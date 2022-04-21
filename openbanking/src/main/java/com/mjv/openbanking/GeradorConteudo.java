package com.mjv.openbanking;

public class GeradorConteudo {
	/**
	 * METODO QUE GERA O CONTEUDO DO LAYOUT
	 */
	public String gerar(Movimentacao movimentacao) {

		StringBuilder sb = new StringBuilder();

		sb.append(movimentacao.getData().toString().replace("-", ""));

		String cpf = movimentacao.getCpfCnpj().replaceAll("\\D", "");
		Long cpfLong = Long.valueOf(cpf);
		String cpfFormatado = String.format("%014d", cpfLong);

		sb.append(cpfFormatado);

//		sb.append(String.format("%014d", Long.valueOf(movimentacao.getCpfCnpj().replaceAll("\\D", "")))); mesma da de cima

		String nome = movimentacao.getNomeCliente();

		if (nome.length() > 30) {
			sb.append(nome.substring(0, 30));
		} else {
			sb.append(String.format("%-30s", nome));
		}

		sb.append(String.format("%010d", Long.valueOf(movimentacao.getValor().toString().replaceAll("\\D", ""))));

		sb.append(movimentacao.getTipo().getSigla());

		if (movimentacao.getEstornada()) {
			sb.append("1");
		} else {
			sb.append("0");
		}

		return sb.toString();
	}
}