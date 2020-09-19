package com.aula.dh.core;

import com.aula.dh.model.Hamburguer;

public interface HamburguerFactory {

	public Hamburguer createHamburguer(int quantidade, String observacao);
	
}
