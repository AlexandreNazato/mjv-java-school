package com.mjv.projetofinal.model.cadastro;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tutor")
public class Tutor extends Pessoa{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String classeSocial;
	
	
	@OneToOne(cascade = CascadeType.ALL)
//	private Pessoa pessoa;
//	public Pessoa getPessoa() {
//		return pessoa;
//	}
//	public void setPessoao(Pessoa pessoa) {
//		this.pessoa = pessoa;
//	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getClasseSocial() {
		return classeSocial;
	}
	public void setClasseSocial(String classeSocial) {
		this.classeSocial = classeSocial;
	}
	
}
