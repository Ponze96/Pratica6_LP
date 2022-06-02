package atividade6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class Interface {

	public static void main(String[] args) throws IOException {

		int opcao;
		String a;	
		String nomeArquivo = "";
		Path criarArquivo = null;
		
				
		do {
			
			
			a= JOptionPane.showInputDialog(" 1- Definir caminho e nome de Arquivo TXT para gravação\r\n"
					+ "\r\n"
					+ "2- Cadastrar Projeto\r\n"
					+ "\r\n"
					+ "3- Abrir Arquivo do Projeto\r\n"
					+ "\r\n"
					+ "4- Sair");
			
			opcao = Integer.parseInt(a);
			
			switch (opcao) {
			case 1: {
				String nomePasta = JOptionPane.showInputDialog(" Insira o nome da pasta ");
				
				Path caminho = Paths.get("C:", nomePasta);
				
				nomeArquivo = JOptionPane.showInputDialog(" Insira o nome do arquivo ");		
				
				criarArquivo = caminho.resolve(nomeArquivo +".txt");
				
				break;
			}
			case 2: {
				
				ManipuladorArquivo.escritor(criarArquivo.toString());
				
				
				break;
			}
			
			case 3: {
				
				ManipuladorArquivo.leitor(criarArquivo.toString());
				
				break;
			}
			
			case 4: {
				JOptionPane.showMessageDialog(null," Encerrado ");
				break;
			}	
			
			default:
				throw new IllegalArgumentException("Valor invalido: ");
			}
						
		
		}while(opcao !=4);
	}

}
