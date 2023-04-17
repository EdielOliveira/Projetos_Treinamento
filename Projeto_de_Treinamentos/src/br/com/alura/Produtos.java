package br.com.alura;

import java.util.ArrayList;

public class Produtos implements Comparable<Produtos>{
	private String tamanho;
	private String cor;
	private int valor;


	public Produtos(String tamanho, String cor, int valor) {
		this.tamanho = tamanho;
		this.cor = cor;
		this.valor = valor;
	}

	public String getCor() {
		return cor;
	}

	public String getTamanho() {
		return tamanho;
	}
	public int getValor() {
		return valor;
	}
	public int getValorTotal(ArrayList<Produtos> produtos) {
		int valorTotal = 0;
		for (Produtos p : produtos) { // para cada aula quero fazer que Tempo Total vale ele mesmo mais aula.getTempo
			valorTotal += p.getValor();
		}
		return valorTotal;
	}
		
	@Override
	public String toString() {
		return "\r\n" + "->Blusa: " + this.tamanho + " ,tamanho: " + this.cor + ", R$ " + this.valor + "";
	}
	public int compareTo(Produtos outroProdutos) {
		return this.tamanho.compareTo(outroProdutos.tamanho);
		
	}
}
