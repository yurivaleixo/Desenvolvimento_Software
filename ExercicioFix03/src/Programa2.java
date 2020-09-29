
import java.util.Scanner;

public class Programa2 {
	public static void main(String[] args) {
		Scanner leitor =  new Scanner(System.in);
		
		System.out.println("Informe a matricula: ");
		int mat = leitor.nextInt();
		leitor.nextLine();	
		
		System.out.println("Informe o nome: ");
		String nome = leitor.nextLine();
		
		
		double[] notas = new double[5];
		double[] pesos =  {0.05, 0.05, 0.2, 0.2, 0.5};
		
		 
		int contador = 0;
		do {
			
		System.out.println("Informe a " + (contador + 1) + "a nota: ");
		double nota = leitor.nextDouble();
		
		if (nota >= 0 && nota <= 10) {
			notas[contador] = nota;
			contador++;
			}
		} while(contador < 5);
		
		
		System.out.println("-------------RELATÓRIO--------------");
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + mat);
		
		double nFinal = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota: " + (i + 1) + ": " + notas[i]);
			nFinal = nFinal + (notas[i] * pesos[i]);
			
		}
		
		//double[] pesos = {0.05, 0.05, 0.2, 0.2, 0.5};
		
		//double nFinal = (notas[0] * pesos[0]) + (notas[1] * pesos[0]) + (notas[2] * pesos[2])
				//(notas[3] * pesos[3]) + (notas[4] * pesos[4]);
		
		
		System.out.println("Nota final: " + nFinal);
		if (nFinal >= 6) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		
		leitor.close();
	}

}
