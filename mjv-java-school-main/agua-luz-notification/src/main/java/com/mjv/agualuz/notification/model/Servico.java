package com.mjv.agualuz.notification.model;

public enum Servico {
AGUA ("Agua",137.21),
ENERGIA ("Energia",132.15);

	private String descricao;
	private Double valor;
	private Servico(String descricao, Double valor) {
		
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


}
