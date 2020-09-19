package com.aula.dh.core;

import com.aula.dh.model.Hamburguer;
import com.aula.dh.model.HamburguerBovino;
import com.aula.dh.model.HamburguerFrango;
import com.aula.dh.model.TipoCarne;

public class Hamburgueria {
	
	public Hamburguer pedido(String carne, int quantidadeCarne, String observacao) {
		TipoCarne tipoCarne = TipoCarne.valueOf(carne.toLowerCase());
		
		switch (tipoCarne) {
		case BOVINO:
			return new HamburguerBovino(quantidadeCarne, observacao);
		case FRANGO:
			return new HamburguerFrango(quantidadeCarne, observacao);
		default:
			return null;
		}
	}

}
