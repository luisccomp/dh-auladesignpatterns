package com.aula.dh.core;

import com.aula.dh.model.TipoCarne;

public class AcompanhamentoHamburguer implements Acompanhamento {

	private Acompanhamento hamburguer;

	public AcompanhamentoHamburguer(Acompanhamento acompanhamento) {
		super();
		this.hamburguer = acompanhamento;
	}

	@Override
	public TipoCarne getTipo() {
		// TODO Auto-generated method stub
		return hamburguer.getTipo();
	}

	@Override
	public int getQuantidade() {
		// TODO Auto-generated method stub
		return hamburguer.getQuantidade();
	}

	@Override
	public String getOutros() {
		// TODO Auto-generated method stub
		return hamburguer.getOutros();
	}
	
}
