import java.util.Scanner;

public class Exerc1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o nome: ");
		String nome = leitor.nextLine();
		System.out.println("Seu nome �: " + nome);
		
		System.out.println("Escreva a matr�cula: ");
		int mat = leitor.nextInt();
		System.out.println("\nSua matr�cula  �: " + mat);

		System.out.println("Est� presente?");
		boolean presente = leitor.nextBoolean();
		if(presente == true) {
			System.out.println("Sim!");
					
		}else {
			System.out.println("N�o!");
		}
	
		
		
		
		
		
	}

}
