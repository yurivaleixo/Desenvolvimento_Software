import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		//Declaração de variável inteiro +  atribuição de valor
		int numeroInteiro = 1000;
		double numeroDecimal = 17.67;
		boolean estaAberta = true;
		char umaLetra = 'A';
		char[] nome2 = {'Y', 'u', 'r', 'i'};
		
		String nome = "Yuri";
		//System.out.println(nome);
		
		//Ferramenta entrada de dados
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("informe o valor de a: ");
		int a = leitor.nextInt();
		System.out.println("Informe o valor de b: ");
		int b = leitor.nextInt();
				
		
		int c = a + b;
		
		System.out.println("Resultado: " + c);
		
	}
}
