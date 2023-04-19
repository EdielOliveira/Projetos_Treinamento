package br.com.alura;

import java.util.ArrayList;

public class Produtos implements Comparable<Produtos> {
	private String cor;
	private String tamanho;
	private double valor;

	public Produtos(String cor, String tamanho, double valor) {

		this.cor = cor;
		this.tamanho = tamanho;
		this.valor = valor;
	}

	public String getCor() {
		return cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public double getValor() {
		return valor;
	}

	public int getValorTotal(ArrayList<Produtos> produtos) {
		int valorTotal = 0;
		for (Produtos p : produtos) {
			valorTotal += p.getValor();
		}
		return valorTotal;
	}

	public int compareTo(Produtos outroProdutos) {

		return this.cor.compareTo(outroProdutos.cor);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "-> Blusa: " + this.cor + ", tamanho: " + this.tamanho + ", R$: " + this.valor;
	}

}
