package com.mjv.agualuz.notification.repository;

import java.util.ArrayList;
import java.util.List;
import com.mjv.agualuz.notification.model.Contrato;
public class ContratoRepository {

	private List<Contrato> contratos = new ArrayList<Contrato>();

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}
	  
}
