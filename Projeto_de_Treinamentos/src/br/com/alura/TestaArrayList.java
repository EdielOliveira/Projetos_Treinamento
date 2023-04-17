package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestaArrayList {
	public static void main(String[] args) {

		Produtos P1 = new Produtos("Azul", "G", 35);
		Produtos P2 = new Produtos("Amarela", "P", 25);
		Produtos P3 = new Produtos("Verde", "M", 30);
		Produtos P4 = new Produtos("Preta", "GG", 50);

		ArrayList<Produtos> produto = new ArrayList<>();

		produto.add(P1);
		produto.add(P2);
		produto.add(P3);
		produto.add(P4);

		Collections.sort(produto);
		System.out.println(produto);

		int total = 0; // variável para armazenar o total de preços

		for (Produtos p : produto) { // iterando pelos elementos da lista de produtos
			total += p.getValor(); // adicionando o preço do produto atual ao total
		}

		System.out.println("R$: " + total + " no total :D");

	}

}
