package com.aula.dh.core;

import com.aula.dh.model.Hamburguer;
import com.aula.dh.model.HamburguerBovino;

public class HamburguerBovinoFactory implements HamburguerFactory {

	@Override
	public Hamburguer createHamburguer(int quantidade, String observacao) {
		// TODO Auto-generated method stub
		return new HamburguerBovino(quantidade, observacao);
	}

}
