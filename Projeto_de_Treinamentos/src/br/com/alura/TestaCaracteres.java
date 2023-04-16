package br.com.alura;

import java.util.ArrayList;

public class TestaCaracteres {
	public static void main(String[] args) {

		String produto1 = "Butijao Eletrolux";
		String produto2 = "Butijao Consagaz";
		String produto3 = "Butijao Liquigaz";

		ArrayList<String> Produtos = new ArrayList<>();
		Produtos.add(produto1);
		Produtos.add(produto2);
		Produtos.add(produto3);

		String preço1 = "105";
		String preço2 = "110";
		String preço3 = "120";

		ArrayList<String> Preços = new ArrayList<>();
		Preços.add(preço1);
		Preços.add(preço2);
		Preços.add(preço3);

		for (@SuppressWarnings("unused")
		String produto : Produtos) {

			String Primeiropreço = Preços.get(0);

			String PrimeiroProduto = Produtos.get(0);
			System.out.println("O Primeiro Produto Proposto Pelo Nosso Site e: -> [" + PrimeiroProduto + ", R$"
					+ Primeiropreço + " ]");

			System.out.println("Produto: " + Produtos);

		}

	}
}
