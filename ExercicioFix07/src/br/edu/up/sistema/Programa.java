package br.edu.up.sistema;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import br.edu.up.dominio.Aluno;

public class Programa {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informação\\Dev Software\\alunos.csv");
		Scanner leitor =  new Scanner(arquivo); 
		leitor.nextLine();
		
		int qteDeAlunos =  70;
		Aluno[] vetorDeAlunos =  new Aluno[70];
		
		int contador = 0;
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
			
			
			vetorDeAlunos[contador] = aluno;
			contador++;
			
		}
		 
		
		//Processamento
		//qtde de alunos
		//qtde de aprovados: (nota >= 6)
		//qtde de reprovados: (total - aprovados)
		//menor nota:  menor = 1000 ... (notaAluno < menor)
		//maior nota maior = -1 ...(notaAluno >  maior)
		//media geral: qtDeAluno / somaDasNotas
		int qtdeAprovados = 0;
		int qtdeReprovados = 0;
	
		
		double menorNota = 1000;
		double maiorNota = -1;
		double somaDasNotas = 0;
		
		for (int i = 0; i < vetorDeAlunos.length; i++) {
			Aluno aluno = vetorDeAlunos[i];
			
			somaDasNotas = somaDasNotas + aluno.nota;
			
			if(aluno.nota < menorNota) {
				menorNota = aluno.nota;
			}
			 
			if(aluno.nota > maiorNota) {
				maiorNota = aluno.nota; 
			}
			
			if(aluno.nota >= 6) {
				qtdeAprovados = qtdeAprovados + 1;
			}else {
				qtdeReprovados = qtdeReprovados +1;
			}
		}
			
		double mediaGeral = somaDasNotas / qteDeAlunos;
		
		System.out.println("Qtde de alunos: " + qteDeAlunos);
		System.out.println("Qtde de aprovados: " + qtdeAprovados);
		System.out.println("Qtde de reprovados: " + qtdeReprovados);
		System.out.println("Menor nota: " + menorNota);
		System.out.println("Maior nota: " + maiorNota);
		System.out.println("Media geral: " + mediaGeral);
		
		FileWriter arquivoSaida = new FileWriter("C:\\Users\\Yuri Valeixo\\eclipse-workspace\\relatorio-alunos.txt");
		PrintWriter gravador =  new PrintWriter(arquivoSaida);
		
		gravador.println("Qtde de alunos: " + qteDeAlunos);
		gravador.println("Qtde de aprovados: " + qtdeAprovados);
		gravador.println("Qtde de reprovados: " + qtdeReprovados);
		gravador.println("Menor Nota: " + menorNota);
		gravador.println("Maior nota: " + maiorNota);
		gravador.println("Média geral: " + mediaGeral);
		
		
		
		
		
		arquivoSaida.close();
		leitor.close();
	}
}
