
import java.util.Scanner;

public class CalcSave {
	public static void main(String[] args) {
		
		int opcoes  = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("----MENU-----");
		System.out.println("[0] - subtração");
		System.out.println("[1] - soma");
		System.out.println("[2] - multiplicação");
		System.out.println("[3] - divisão");
		System.out.println("[4] - desligar");
		System.out.println("Digite o número da opção: ");
		opcoes = ler.nextInt();

		switch (opcoes) {
		case 0:
			System.out.println("Digite primeiro valor: ");
			double sub1 = ler.nextDouble();
			System.out.println("Digite segundo valor: ");
			double sub2 = ler.nextDouble();
			double subtração = sub1+sub2;
			System.out.println("O valor da subtração é: " + subtração);
			break;
			
		case 1: 			
			System.out.println("Digite primeiro valor: ");
			double som1 = ler.nextDouble();
			System.out.println("Digite segundo valor: ");
			double som2 = ler.nextDouble();
			double soma = som1+som2;
			System.out.println("O valor da soma é: " + soma);
			break;
			
		case 2: 			
			System.out.println("Digite primeiro valor: ");
			double mult1 = ler.nextDouble();
			System.out.println("Digite segundo valor: ");
			double mult2 = ler.nextDouble();
			double mult = mult1*mult2;
			System.out.println("O valor da multiplicação é: " + mult);
			break;
			
		case 3: 			
			System.out.println("Digite primeiro valor: ");
			double div1 = ler.nextDouble();
			System.out.println("Digite segundo valor: ");
			double div2 = ler.nextDouble();
			if( div2 == 0 ) {
				System.out.println("Valor inválido");
			} else {
			double div = div1/div2;
			System.out.println("O valor da divisão é: " + div);
			break;
			}	
			
		case 4:
			System.out.println("Saindo! Tchau!");
			break;
			
			}
		ler.close();
		}
} 