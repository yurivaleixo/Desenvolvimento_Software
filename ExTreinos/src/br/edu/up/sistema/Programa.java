package br.edu.up.sistema;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import br.edu.up.dominio.Aluno;

public class Programa {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informação\\Dev Software\\alunos.csv");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		int qteAlunos = 70;
		Aluno[] vetorDeAlunos = new Aluno[70];
		int cont = 0;
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] partes = linha.split(";");
			String matricula = partes[0];
			String nome = partes[1];
			String strNota = partes[2];
			String strPonto = strNota.replace(",", ".");
			
			double nota = Double.parseDouble(strPonto);
			
			Aluno aluno = new Aluno();
			aluno.matricula = matricula;
			aluno.nome = nome;
			aluno.nota = nota;
			
			vetorDeAlunos[cont] = aluno;
			cont++;
			
			
		}
		
		int qteAprovados = 0;
		int qteReprovados = 0;
		double maiorNota = 0;
		double menorNota = 10;
		double somaTotal = 0;
		
		for (int i = 0; i < vetorDeAlunos.length; i++) {
			Aluno aluno = vetorDeAlunos[i];
			
			if(aluno.nota >= maiorNota) {
				 maiorNota = aluno.nota;
			} 
			
			if(aluno.nota <= menorNota) { 
				menorNota = aluno.nota;
			}
			
			if(aluno.nota >= 6) {
				qteAprovados = qteAprovados + 1;
			} else { 
				qteReprovados = qteReprovados + 1;			}
			
			
			somaTotal = somaTotal + aluno.nota;
			
			
		}
			
		double media = somaTotal/qteAlunos; 
		
		System.out.println("A quantidade de alunos e: " + qteAlunos); 
		System.out.println("A maior nota e: " + maiorNota); 
		System.out.println("A menor nota e: " + menorNota); 
		System.out.println("A quantidade de aprovados e: " + qteAprovados); 
		System.out.println("A quantidade de reprovados e: " + qteReprovados); 
		System.out.println("A media e: " + media); 
		
		
		FileWriter arquivoSaida = new FileWriter("C:\\Users\\Yuri Valeixo\\eclipse-workspace\\relatorio-treino2.txt");
		PrintWriter gravador = new PrintWriter(arquivoSaida);
		
		
		gravador.println("A quantidade de alunos e: " + qteAlunos);
		gravador.println("A maior nota e: " + maiorNota); 
		gravador.println("A menor nota e: " + menorNota); 
		gravador.println("A quantidade de aprovados e: " + qteAprovados); 
		gravador.println("A quantidade de reprovados e: " + qteReprovados); 
		gravador.println("A media e: " + media); 
		
		leitor.close();
		gravador.close();
	}
}
