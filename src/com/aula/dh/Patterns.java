package com.aula.dh;

import com.aula.dh.core.Acompanhamento;
import com.aula.dh.core.Alface;
import com.aula.dh.core.Calabresa;
import com.aula.dh.core.HamburguerBovinoFactory;
import com.aula.dh.core.Queijo;

public class Patterns {

	public static void main(String[] args) {
		Acompanhamento hamburguer = new HamburguerBovinoFactory()
				.createHamburguer(2, "Entregar na portaria");
		
		hamburguer = new Queijo(hamburguer);
		hamburguer = new Alface(hamburguer);
		hamburguer = new Calabresa(hamburguer);
		hamburguer = new Calabresa(hamburguer);
	}
	
}
