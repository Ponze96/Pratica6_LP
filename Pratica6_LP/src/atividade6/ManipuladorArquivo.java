package atividade6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManipuladorArquivo {

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public static void escritor(String path) throws IOException {
		BufferedWriter escrever = new BufferedWriter(new FileWriter(path));
		ArrayList<String> itens = new ArrayList();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o titulo: ");
		String titulo = in.nextLine();
		System.out.println("Digite um objetivo: ");
		String objetivo = in.nextLine();
		System.out.println("Digite o endereço completo: ");
		String enderecoCompleto = in.nextLine();
		System.out.println("Digite a data de inicio: ");
		String dataInicio = in.nextLine();
		System.out.println("Digite o status: ");
		String status = in.nextLine();
		
		itens.add(titulo+";" +objetivo+ ";" + enderecoCompleto + ";" + dataInicio + ";" + status);
		escrever.append(itens.toString());

		escrever.close();
		System.out.println("Criado com sucesso");
		
	}
}

