package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaDeJogo_CopadoMundo {

	public static void main(String[] args) {
		Jogo f1 = new Jogo("Servia x Holanda", 2);
		Jogo f2 = new Jogo("Alemanha x Senegal", 5);
		Jogo f3 = new Jogo("Brasil x Argentina", 6);
		Jogo f4 = new Jogo("Canada x India", 7);

		ArrayList<Jogo> jogos = new ArrayList<>();
		jogos.add(f1);
		jogos.add(f2);
		jogos.add(f3);
		jogos.add(f4);

		Collections.sort(jogos);

		jogos.sort(Comparator.comparing(Jogo::getTempo));

		System.out.println(jogos);

	}
}
