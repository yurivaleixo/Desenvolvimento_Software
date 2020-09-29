import java.util.Scanner;

public class Ex3pt2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[] notas = new int[5];
		
		System.out.println("Qual o seu nome? ");
		String nome = leitor.nextLine();
		
		System.out.println("Qual a sua matricula? ");
		int mat = leitor.nextInt();
		
	
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite suas notas de 0 à 10: ");
			notas[i] = leitor.nextInt();
		} 
		
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + mat);
		
		int contador = 0;
		do {  
			System.out.println("Nota: " + notas[contador]);
			contador++;
		}while(contador < 5);  
		
		leitor.close();
	}
}