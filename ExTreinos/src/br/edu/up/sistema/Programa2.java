package br.edu.up.sistema;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import br.edu.up.dominio.Aluno;

public class Programa2 {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informação\\Dev Software\\alunos.csv");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		int cont = 0;
		int qteAlunos = 70;
		int qteAprovados = 0;
		int qteReprovados = 0;
		double maiorNota = 0;
		double menorNota = 10;
		double somaNota = 0;
		double mediaNota = 0;

		
		Aluno[] vetorAlunos = new Aluno[70];
		
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] partes = linha.split(";");
			String matricula = partes[0];
			String nome = partes[1];
			String strNota = partes[2];
			String ponto = strNota.replace(",", ".");
			
			double nota = Double.parseDouble(ponto);
			
			Aluno aluno = new Aluno();
			aluno.matricula = matricula; 
			aluno.nome = nome; 
			aluno.nota = nota;
			
			
			vetorAlunos[cont] = aluno;
			cont++;
			
		}
		
		for (int i = 0; i < vetorAlunos.length; i++) {
			Aluno aluno = vetorAlunos[i];
			
			if(aluno.nota >= 6) {
				qteAprovados = qteAprovados + 1;
			}else {
				qteReprovados = qteReprovados + 1;
			}
			
			if(aluno.nota >= maiorNota) {
				maiorNota = aluno.nota;
			}
			
			if(aluno.nota <= menorNota ) {
				menorNota = aluno.nota;
			}
			
			somaNota = somaNota + aluno.nota;
		}
		
		mediaNota = somaNota/qteAlunos;

		System.out.println("Quantidade de alunos é: " + qteAlunos); 
		System.out.println("Quantidade de aprovados é: " + qteAprovados);
		System.out.println("Quantidade de reprovados é: " + qteReprovados);
		System.out.println("A maior nota é: " + maiorNota);
		System.out.println("A menor nota é: " + menorNota);
		System.out.println("A média é: " + mediaNota);
		 
		
		
		FileWriter arquivoSaida = new FileWriter("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informação\\Dev Software\\tabulados-treino.txt");
		PrintWriter gravador = new PrintWriter(arquivoSaida);
		//Falta fazer gravador
		
	}
}
