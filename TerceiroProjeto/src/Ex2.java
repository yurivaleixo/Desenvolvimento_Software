import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {
			
			String[] nomes = new String [5];
			System.out.println("Qual o seu nome?");
			for (int i = 0; i < nomes.length; i++) {
				nomes[i] = leitor.nextLine();
			}
			
			int[] mats = new int[5];
			System.out.println("Qual sua matricula?");
			for (int i = 0; i < mats.length; i++) {
				mats[i] = leitor.nextInt();
			}
			
			boolean[] logicos = new boolean[5];
			System.out.println("Esta presente? Sim ou não?");
			for (int i = 0; i < logicos.length; i++) {
				logicos[i] = leitor.nextBoolean();
			}
			
			for (int i = 0; i < nomes.length; i++) {
				System.out.println("Nomes :" + nomes[i]);
			}
			
			for (int i = 0; i < mats.length; i++) {
				System.out.println("Matriculas: " + mats[i]);
			}
			for (int i = 0; i < logicos.length; i++) {
				if (logicos[i] == true) {
				System.out.println("Sim!");
				
				} else {
					System.out.println("Não!");
				}
				
				leitor.close();
			}
		}
	}
}
