package com.mjv.openbanking;

import java.math.BigDecimal;
import java.time.LocalDate;

//lombok
public class Movimentacao {
	
	LocalDate data;
	BigDecimal valor;
	String cpfCnpj;
	String nomeCliente;
	TipoMovimentacao tipo;
	Boolean estornada;
	
	
	
	
	// Metodos Gets e sets
	
	
	/**
	 * @return the data
	 */
	public LocalDate getData() {
		return data;
	}
	/**
	 * @param localDateTime the data to set
	 */
	public void setData(LocalDate localDate) {
		this.data = localDate;
	}
	
	
	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	/**
	 * @return the cpfCnpj
	 */
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	/**
	 * @param cpfCnpj the cpfCnpj to set
	 */
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	/**
	 * @return the nomeCliente
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}
	/**
	 * @param nomeCliente the nomeCliente to set
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	/**
	 * @return the tipo
	 */
	public TipoMovimentacao getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the estornada
	 */
	public Boolean getEstornada() {
		return estornada;
	}
	/**
	 * @param estornada the estornada to set
	 */
	public void setEstornada(Boolean estornada) {
		this.estornada = estornada;
	}
	
	public String toString() {
		return "Movimentacao [data=" + data + ", valor=" + valor + ", cpfCnpj=" + cpfCnpj + ", nomeCliente="
				+ nomeCliente + ", tipo=" + tipo + ", estornada=" + estornada + "]";
	}
	
	

}
