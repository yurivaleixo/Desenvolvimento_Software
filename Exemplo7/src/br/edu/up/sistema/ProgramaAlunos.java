package br.edu.up.sistema;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProgramaAlunos {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Users\\Yuri Valeixo\\eclipse-workspace\\alunosExcel.txt");
		Scanner leitor = new Scanner(arquivo);
		int qtdTotal = 0;
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine(); 
			String[] partes = linha.split("\t");
			String matricula = partes[0];
			String nome = partes[1];
			String nota = partes[2]; 

			
			System.out.println(matricula+"\t"+ nome + "\tNota: " + nota);
			
			
			FileWriter arquivoSaida = new FileWriter("C:\\Users\\Yuri Valeixo\\eclipse-workspace\\relatorio-alunos.txt");
		    PrintWriter gravador = new PrintWriter(arquivoSaida);
		    
			System.out.println(matricula +"\t"+ nome + "\tNota: " + nota);
			gravador.println(matricula +"\t"+ nome + "\tNota: " + nota);
		   
		    leitor.close();
			gravador.close();
			arquivoSaida.close();
		}
		
	
	}
	
}
