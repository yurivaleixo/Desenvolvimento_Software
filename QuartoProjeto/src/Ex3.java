import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double[] notas = new double[5];
		
		System.out.println("Escreva o seu nome: ");
		String nome = leitor.nextLine();
		System.out.println("Escreva a matricula: ");
		int mat = leitor.nextInt();
		 
		for (int i = 0; i < 5; i++) {
			System.out.println("Qual a sua nota?");
			 notas[i] = leitor.nextDouble();
		} 
		System.out.println("--------------RELATORIO-------------");
		System.out.println("Nome: " + nome); 
		System.out.println("Matricula: " + mat);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota" + (i + 1) + ": " + notas[i]);
 
			} 
		
		leitor.close();
	}
	
}
