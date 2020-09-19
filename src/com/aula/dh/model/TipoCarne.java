package com.aula.dh.model;

public enum TipoCarne {
	
	BOVINO("bovino"),
	SUINO("suino"),
	FRANGO("frango"),
	MISTO("misto");
	
	private String carne;
	
	TipoCarne(String carne) {
		this.carne = carne;
	}

	public String getCarne() {
		return carne;
	}

}
