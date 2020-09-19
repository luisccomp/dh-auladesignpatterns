package com.aula.dh.core;

import com.aula.dh.model.Hamburguer;
import com.aula.dh.model.HamburguerMisto;

public class HamburguerMistoFactory implements HamburguerFactory {

	@Override
	public Hamburguer createHamburguer(int quantidade, String observacao) {
		// TODO Auto-generated method stub
		return new HamburguerMisto(quantidade, observacao);
	}

}
