package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestaArrayList {
	public static void main(String[] args) {

		Produtos P1 = new Produtos("Preta", "G", 35);
		Produtos P2 = new Produtos("Branca", "M", 20);
		Produtos P3 = new Produtos("Cinza", "P", 25);
		Produtos P4 = new Produtos("Verde", "GG", 55);

		ArrayList<Produtos> produto = new ArrayList<>();

		produto.add(P1);
		produto.add(P2);
		produto.add(P3);
		produto.add(P4);

		Collections.sort(produto);

		int total = 0; // variável para armazenar o total de preços

		for (Produtos p : produto) { // iterando pelos elementos da lista de produtos
			total += p.getValor(); // adicionando o preço do produto atual ao total
		}

		for (Produtos produtos : produto) {
			System.out.println(produtos);
		}

		System.out.println("-> Valor Total: " + total);

	}
}