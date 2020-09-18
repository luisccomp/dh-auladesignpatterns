package com.aula.dh.model;

public abstract class Hamburguer {
	
	private TipoCarne tipo;
	private int quantidade;
	private String outros;
	public Hamburguer(TipoCarne tipo, int quantidade, String outros) {
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.outros = outros;
	}
	public TipoCarne getTipo() {
		return tipo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public String getOutros() {
		return outros;
	}
	
	
	
	
}
