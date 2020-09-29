import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExGravador {
	public static void main(String[] args) throws IOException {
		File arquivo =  new File("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informação\\Dev Software\\tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		 
		int valorTotal = 0;
		int valorTotalA = 0;
		int valorTotalB = 0; 
		int valorTotalC = 0; 
		int valorTotalD = 0;
		int valorTotalE = 0;
		int valorTotalF = 0;
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] partes = linha.split("\t");
			String grupo = partes[0];
			String strValor = partes[1];
			
			int valorLinha = Integer.parseInt(strValor);
			
			valorTotal = valorTotal + valorLinha;
			
			switch(grupo.charAt(0)) {
				case 'A' :{ 
					valorTotalA = valorTotalA + valorLinha;
					break;
				}
				
				case 'B' :{
					valorTotalB = valorTotalB + valorLinha;
					break;
				}
				
				case 'C' :{
					valorTotalC = valorTotalC + valorLinha;
					break;
				}
				
				case 'D' :{
					valorTotalD = valorTotalD + valorLinha;
					break; 
				}
				case 'E' :{
					valorTotalE = valorTotalE + valorLinha;
					break;
				}
				
				case 'F' :{
					valorTotalF = valorTotalF + valorLinha;
					break;
			}
			
		}
		
		
		}
		System.out.println("valor total de todos: " + valorTotal);
		System.out.println("valor total de A é: " + valorTotalA);
		System.out.println("valor total de B é: " + valorTotalB);
		System.out.println("valor total de C é: " + valorTotalC);
		System.out.println("valor total de D é: " + valorTotalD);
		System.out.println("valor total de E é: " + valorTotalE);
		System.out.println("valor total de F é: " + valorTotalF);
		 
		FileWriter arquivoSaida = new FileWriter("C:\\Users\\Yuri Valeixo\\eclipse-workspace\\relatorio-treino2.txt");
		PrintWriter gravador = new PrintWriter(arquivoSaida);
		 
		gravador.println("Valor total A: " + valorTotalA);
		gravador.println("Valor total B: " + valorTotalB);
		gravador.println("Valor total C: " + valorTotalC);
		gravador.println("Valor total D: " + valorTotalD);
		gravador.println("Valor total E: " + valorTotalE);
		gravador.println("Valor total F: " + valorTotalF);
		
		leitor.close();
		gravador.close();
		arquivoSaida.close();
	
	}
}
