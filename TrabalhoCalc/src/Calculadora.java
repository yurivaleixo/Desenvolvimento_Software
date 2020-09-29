import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual operação aritmética deseja?");
		String opcao = leitor.nextLine(); 
		

		if(opcao.equals("+")) { 
			System.out.println("Digite o valor 1: ");
			double val1 = leitor.nextDouble();
			System.out.println("Digite o valor 2: ");
			double val2 = leitor.nextDouble(); 
			double soma = val1+val2;
			System.out.println("O valor da soma é: " + soma);
			
		}
		
		if(opcao.equals("-")) {
			System.out.println("Digite o valor 1: ");
			double val1 = leitor.nextDouble();
			System.out.println("Digite o valor 2: ");
			double val2 = leitor.nextDouble(); 
			double sub = val1-val2;
			System.out.println("O valor da subutração é: " + sub);
			
		
		}
		
		if(opcao.equals("*")) {
			System.out.println("Digite o valor 1: ");
			double val1 = leitor.nextDouble();
			System.out.println("Digite o valor 2: ");
			double val2 = leitor.nextDouble(); 
			double mult = val1*val2;
			System.out.println("O valor da multiplicação é: " + mult);
			
		
		}
		if(opcao.equals("/")) { 
			System.out.println("Digite o valor 1: ");
			double val1 = leitor.nextDouble(); 
			System.out.println("Digite o valor 2: ");
			double val2 = leitor.nextDouble(); 
			if(val2 == 0) {
				System.out.println("Não pode dividir por 0");
			} 
			double div = val1/val2;
			System.out.println("O valor da divisão é: " + div);
		
		}
		
		leitor.close();
	
	}	


}
	

