import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner leitor =  new Scanner(System.in);
		
		System.out.println("Informe a matricula: ");
		int mat = leitor.nextInt();
		leitor.nextLine();	
		
		System.out.println("Informe o nome: ");
		String nome = leitor.nextLine();
		
		
		double[] notas = new double[5];
		
		
		int contador = 0;
		do {
		System.out.println("Informe a " + (contador + 1) + "a nota: ");
		double nota = leitor.nextDouble();
		
		if (nota >= 0 && nota <= 10) {
			notas[contador] = nota;
			contador++;
			}
		} while(contador < 5);
		
		
		System.out.println("-------------RELATÓRIO--------------");
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + mat);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota: " + (i + 1) + ": " + notas[i]);
			
		}
		
		leitor.close();
		
	}

}
