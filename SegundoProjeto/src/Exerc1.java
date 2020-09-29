import java.util.Scanner;

public class Exerc1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o nome: ");
		String nome = leitor.nextLine();
		System.out.println("Seu nome é: " + nome);
		
		System.out.println("Escreva a matrícula: ");
		int mat = leitor.nextInt();
		System.out.println("\nSua matrícula  é: " + mat);

		System.out.println("Está presente?");
		boolean presente = leitor.nextBoolean();
		if(presente == true) {
			System.out.println("Sim!");
					
		}else {
			System.out.println("Não!");
		}
	
		
		
		
		
		
	}

}
