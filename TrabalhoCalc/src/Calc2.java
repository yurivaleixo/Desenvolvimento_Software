import java.util.Scanner;

public class Calc2 {
	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		int op = 0;
		String resp = "";
		
		do {
		System.out.println("-----Selecione uma operação aritmética-----");
		System.out.println("[0] - soma");
		System.out.println("[1] - subtração");
		System.out.println("[2] - multiplicação");
		System.out.println("[3] - divisão");
		System.out.println("[4] - sair");
		System.out.println("Digite o número da opção: ");
	    op = leitor.nextInt();
 
		switch (op) {
		case 0:
			System.out.println("Digite primeiro valor: ");
			double val1 = leitor.nextDouble();
			System.out.println("Digite segundo valor: ");
			double val2 = leitor.nextDouble();
			double soma = val1+val2;
			System.out.println("O valor da soma é: " + soma);
			break;
			
		case 1: 			
			System.out.println("Digite primeiro valor: ");
			double sub1 = leitor.nextDouble();
			System.out.println("Digite segundo valor: ");
			double sub2 = leitor.nextDouble();
			double sub = sub1-sub2;
			System.out.println("O valor da subtração é: " + sub);
			break;
			
		case 2: 			
			System.out.println("Digite primeiro valor: ");
			double mult1 = leitor.nextDouble();
			System.out.println("Digite segundo valor: ");
			double mult2 = leitor.nextDouble();
			double mult = mult1*mult2;
			System.out.println("O valor da multiplicação é: " + mult);
			break;
			
		case 3: 			
			System.out.println("Digite primeiro valor: ");
			double div1 = leitor.nextDouble();
			System.out.println("Digite segundo valor: ");
			double div2 = leitor.nextDouble();
			if( div2 == 0 ) {
				System.out.println("Valor inválido");
			} else {
			double div = div1/div2;
			System.out.println("O valor da divisão é: " + div);
			break;
			}	
			
		case 4:
			System.out.println("Saindo do programa!");
			break;
			
			}
			System.out.println("Deseja continuar? sim ou não.");
			resp = leitor.next(); 
		
		}while(resp.equals("sim"));
		
		leitor.close(); 
	}
	
}
	  	
