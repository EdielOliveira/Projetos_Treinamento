package br.com.alura;

public class Jogo implements Comparable<Jogo> {

	private String titulo;
	private int tempo;

	public Jogo(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public String toString() {
		return "Jogo : " + this.titulo + this.tempo + " gols somados com as selecoes \r\n";

	}

	@Override
	public int compareTo(Jogo outroJogo) {
		return this.titulo.compareTo(outroJogo.titulo);
	}
}
