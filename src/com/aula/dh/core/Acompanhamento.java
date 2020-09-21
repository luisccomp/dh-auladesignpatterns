package com.aula.dh.core;

import com.aula.dh.model.TipoCarne;

public interface Acompanhamento {
	public TipoCarne getTipo();
	public int getQuantidade();
	public String getOutros();
}
