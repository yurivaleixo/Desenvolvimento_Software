import java.util.Scanner;

public class Calc2 {
	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		int op = 0;
		String resp = "";
		
		do {
		System.out.println("-----Selecione uma opera��o aritm�tica-----");
		System.out.println("[0] - soma");
		System.out.println("[1] - subtra��o");
		System.out.println("[2] - multiplica��o");
		System.out.println("[3] - divis�o");
		System.out.println("[4] - sair");
		System.out.println("Digite o n�mero da op��o: ");
	    op = leitor.nextInt();
 
		switch (op) {
		case 0:
			System.out.println("Digite primeiro valor: ");
			double val1 = leitor.nextDouble();
			System.out.println("Digite segundo valor: ");
			double val2 = leitor.nextDouble();
			double soma = val1+val2;
			System.out.println("O valor da soma �: " + soma);
			break;
			
		case 1: 			
			System.out.println("Digite primeiro valor: ");
			double sub1 = leitor.nextDouble();
			System.out.println("Digite segundo valor: ");
			double sub2 = leitor.nextDouble();
			double sub = sub1-sub2;
			System.out.println("O valor da subtra��o �: " + sub);
			break;
			
		case 2: 			
			System.out.println("Digite primeiro valor: ");
			double mult1 = leitor.nextDouble();
			System.out.println("Digite segundo valor: ");
			double mult2 = leitor.nextDouble();
			double mult = mult1*mult2;
			System.out.println("O valor da multiplica��o �: " + mult);
			break;
			
		case 3: 			
			System.out.println("Digite primeiro valor: ");
			double div1 = leitor.nextDouble();
			System.out.println("Digite segundo valor: ");
			double div2 = leitor.nextDouble();
			if( div2 == 0 ) {
				System.out.println("Valor inv�lido");
			} else {
			double div = div1/div2;
			System.out.println("O valor da divis�o �: " + div);
			break;
			}	
			
		case 4:
			System.out.println("Saindo do programa!");
			break;
			
			}
			System.out.println("Deseja continuar? sim ou n�o.");
			resp = leitor.next(); 
		
		}while(resp.equals("sim"));
		
		leitor.close(); 
	}
	
}
	  	
