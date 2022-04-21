package com.mjv.openbanking;

public enum TipoMovimentacao {
	RECEITA ("R"),
	DISPESA ("D");
	
	private String sigla;
	private TipoMovimentacao (String sigla) {
		this.sigla = sigla;
	}
	public String getSigla() {
		return sigla;
	}

}
