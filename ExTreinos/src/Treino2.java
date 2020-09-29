import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Treino2 {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informação\\Dev Software\\tabulados.txt");
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
			
			int valor = Integer.parseInt(strValor);
			
			valorTotal = valorTotal + valor;
			 
			switch(grupo.charAt(0)) {
			case 'A' :{ 
				valorTotalA = valorTotalA + valor;
			}
			case 'B' :{
				valorTotalB = valorTotalB + valor;
			}
			case 'C' :{
				valorTotalC = valorTotalC + valor;
			}
			case 'D' :{
				valorTotalD = valorTotalD + valor;
			}
			case 'E' :{
				valorTotalE = valorTotalE + valor;
			}
			case 'F' :{
				valorTotalF = valorTotalF + valor;
			}
			
		}
			
		
			
			
		}	
		System.out.println("Valor total dos grupos: " + valorTotal);
		System.out.println("Valor total A " + valorTotalA);
		System.out.println("Valor total B " + valorTotalB);
		System.out.println("Valor total C " + valorTotalC);
		System.out.println("Valor total D " + valorTotalD);
		System.out.println("Valor total E " + valorTotalE);
		System.out.println("Valor total F " + valorTotalF);
		
		FileWriter arquivoSaida = new FileWriter("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informação\\Dev Software\\relatorio-treino.txt");
		PrintWriter gravador = new PrintWriter(arquivoSaida);
		
		gravador.println("Grupo A" + valorTotalA);
		gravador.println("Grupo B" + valorTotalB);
		gravador.println("Grupo C" + valorTotalC);
		gravador.println("Grupo D" + valorTotalD); 
		gravador.println("Grupo E" + valorTotalE);
		gravador.println("Grupo F" + valorTotalF);
		
		
		
		
		gravador.close();
		leitor.close();
	}
}
