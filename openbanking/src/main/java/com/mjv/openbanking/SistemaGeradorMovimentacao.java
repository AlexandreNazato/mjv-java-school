package com.mjv.openbanking;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SistemaGeradorMovimentacao {
  public static void main (String[] args) {
	Movimentacao mov1 = new Movimentacao();
	mov1.setData(LocalDate.of(2022,04,16));
	mov1.setCpfCnpj("135.217.791-18");
	mov1.setNomeCliente("RAIMUNDO NONATO LOUREIRA CASTELO BRANCO");
	mov1.setValor(new BigDecimal("1275.48"));
	mov1.setTipo(TipoMovimentacao.RECEITA);
	mov1.setEstornada(false);
	
	GeradorConteudo gc = new GeradorConteudo();
	String conteudoGerado = gc.gerar(mov1);
	
	GeradorArquivo ga = new GeradorArquivo();
	ga.escreverDisco(conteudoGerado);
}
}

