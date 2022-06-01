package atividade6;

import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class Interface {

	public static void main(String[] args) {

		int opcao;
		String a;	
		
		
				
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
				
				String nomeArquivo = JOptionPane.showInputDialog(" Insira o nome do arquivo ");		
				
				Path criarArquivo = caminho.resolve(nomeArquivo +".txt");
				
				break;
			}
			case 2: {
				
				break;
			}
			
			case 3: {
				
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
