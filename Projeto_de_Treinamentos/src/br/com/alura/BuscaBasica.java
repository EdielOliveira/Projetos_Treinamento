package br.com.alura;

import java.util.Scanner;

public class BuscaBasica {

	public static void main(String[] args) {

		Pessoa[] pessoas = new Pessoa[4];

		pessoas[0] = new Pessoa("João");
		pessoas[1] = new Pessoa("Maria");
		pessoas[2] = new Pessoa("Pedro");
		pessoas[3] = new Pessoa("Osvaldo");

		try (Scanner scanner = new Scanner(System.in)) {
			String opcao = "";

			while (!opcao.equals("4")) {
				System.out.println("1 - Adicionar nome");
				System.out.println("2 - Procurar pessoa");
				System.out.println("3 - Creditos/Criadores");
				System.out.println("4 - Sair");
				System.out.println("? - Ajuda");

				opcao = scanner.nextLine();

				switch (opcao) {
				case "1":
					System.out.println("Digite o nome:");
					String novoNome = scanner.nextLine();
					Pessoa novaPessoa = new Pessoa(novoNome);
					pessoas = adicionaPessoa(pessoas, novaPessoa);
					System.out.println("Pessoa adicionada com sucesso!");
					break;

				case "2":
					System.out.println("Digite o nome da Pessoa: ");
					String nome = scanner.nextLine();

					boolean encontrada = false;
					for (int i = 0; i < pessoas.length; i++) {
						String nomePessoa = pessoas[i].getNome();
						if (nomePessoa.equals(nome)) {
							System.out.println("Pessoa encontrada: " + nomePessoa + " :D");
							encontrada = true;
							break;
						}
					}
					if (!encontrada) {
						System.out.println("Pessoa nao encontrada ;-;");
					}
					break;

				case "3":
					System.out.println("Ediel: Criador\r\n" + "Joao: N/A\r\n" + "Maria: N/A\r\n" + "Udiel: N/A");
					break;

				case "4":
					System.out.println("Saindo...");
					break;

				case "?":
					System.out.println("Ola, sou o botao de ajuda!\r\n" + "Basta voce selecionar um \r\n"
							+ "numero ou uma letra que \r\n" + "corresponde a uma deter-\r\n"
							+ "minada funcao, ou seja\r\n" + "1,2,3,4 ou '?'; espero ter\r\n" + "ajudado!");
				}
			}
		}
	}

	private static Pessoa[] adicionaPessoa(Pessoa[] pessoas, Pessoa novaPessoa) {
		Pessoa[] novaLista = new Pessoa[pessoas.length + 1];
		for (int i = 0; i < pessoas.length; i++) {
			novaLista[i] = pessoas[i];
		}
		novaLista[pessoas.length] = novaPessoa;
		return novaLista;
	}
}
