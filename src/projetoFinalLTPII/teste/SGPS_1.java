package projetoFinalLTPII.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SGPS_1 {
	public static int cont = 0;

	// class Beneficiário
	static Beneficiario[] bn = new Beneficiario[100];

	static Beneficiario b;

	public static void main(String[] args) throws IOException {
		// Gravar no arquivo dados beneficiário
		FileWriter arq = new FileWriter("aquivo1.txt");
		PrintWriter gravarArq = new PrintWriter(arq);

		Scanner ler = new Scanner(System.in);

		// Leitura dados beneficiário
		System.out.println("=================SGPS=================");
		int i = 1;
		while (i == 1) {
			System.out.print("Insira nome beneficiairio? ");
			String nomeBenefi = ler.nextLine();
			System.out.println("Insira a idade?");
			int idade = ler.nextInt();
			System.out.println("Insira a quantidade de dependentes: ");
			int quantDepe = ler.nextInt();
			
			b = new Beneficiario();
			b.setQuantDepend(quantDepe);
			double valor = 0;

			if (b.getQuantDepend() > 0) { // Enquanto aver parentes
				int j = 0;
				String[] nomeDepe = new String[quantDepe];
				int[] idadeDepe = new int[quantDepe];

				while (b.getQuantDepend() != j) {

					System.out.println("Nome dependente " + (j + 1) + ": ");
					nomeDepe[j] = ler.nextLine();
					System.out.println("Idade: ");
					idadeDepe[j] = ler.nextInt();
					j++;

				}
				System.out.println("Insira o Valor do plano: ");
				valor = ler.nextDouble();

				bn[cont] = new Beneficiario(nomeBenefi, idade, quantDepe, nomeDepe, idadeDepe, valor);
				gravarArq.format(nomeBenefi, idade, quantDepe, nomeDepe, idadeDepe, valor);
				cont++;
			} else { // caso não tenha parentes
				String[] nomeDepe = new String[1];
				int[] idadeDepe = new int[1];

				nomeDepe[0] = "Nenhum";
				idadeDepe[0] = 0;

				System.out.println("Insira o Valor do plano: ");
				valor = ler.nextDouble();

				bn[cont] = new Beneficiario(nomeBenefi, idade, quantDepe, nomeDepe, idadeDepe, valor);
				cont++;
			}
			if (nomeBenefi.equals(nomeBenefi)) {
				break;
			}

		}
	}

}
