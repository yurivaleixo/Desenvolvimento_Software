import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual opera��o aritm�tica deseja?");
		String opcao = leitor.nextLine(); 
		

		if(opcao.equals("+")) { 
			System.out.println("Digite o valor 1: ");
			double val1 = leitor.nextDouble();
			System.out.println("Digite o valor 2: ");
			double val2 = leitor.nextDouble(); 
			double soma = val1+val2;
			System.out.println("O valor da soma �: " + soma);
			
		}
		
		if(opcao.equals("-")) {
			System.out.println("Digite o valor 1: ");
			double val1 = leitor.nextDouble();
			System.out.println("Digite o valor 2: ");
			double val2 = leitor.nextDouble(); 
			double sub = val1-val2;
			System.out.println("O valor da subutra��o �: " + sub);
			
		
		}
		
		if(opcao.equals("*")) {
			System.out.println("Digite o valor 1: ");
			double val1 = leitor.nextDouble();
			System.out.println("Digite o valor 2: ");
			double val2 = leitor.nextDouble(); 
			double mult = val1*val2;
			System.out.println("O valor da multiplica��o �: " + mult);
			
		
		}
		if(opcao.equals("/")) { 
			System.out.println("Digite o valor 1: ");
			double val1 = leitor.nextDouble(); 
			System.out.println("Digite o valor 2: ");
			double val2 = leitor.nextDouble(); 
			if(val2 == 0) {
				System.out.println("N�o pode dividir por 0");
			} 
			double div = val1/val2;
			System.out.println("O valor da divis�o �: " + div);
		
		}
		
		leitor.close();
	
	}	


}
	

