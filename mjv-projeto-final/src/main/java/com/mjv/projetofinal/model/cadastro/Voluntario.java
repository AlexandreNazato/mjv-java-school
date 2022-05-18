package com.mjv.projetofinal.model.cadastro;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "voluntario")
public class Voluntario  extends Pessoa{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String atividadeDesenvolvida;
	
	
	@Embedded
	@OneToOne(cascade = CascadeType.ALL)
//	private Pessoa pessoa;
//	public Pessoa getPessoa() {
//		return pessoa;
//	}
//	public void setPessoa(Pessoa pessoa) {
//		this.pessoa = pessoa;
//	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAtividadeDesenvolvida() {
		return atividadeDesenvolvida;
	}
	public void setAtividadeDesenvolvida(String atividadeDesenvolvida) {
		this.atividadeDesenvolvida = atividadeDesenvolvida;
	}
	
}
