
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {
	
	public static File lerArquivo(String nomeArquivo) {
		File arquivo = new File(nomeArquivo);
		return arquivo;
	} 
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//ENTRADA
		File arquivo = lerArquivo("C:\\Users\\Yuri Valeixo\\eclipse-workspace\\nomes.txt"); 
		Scanner leitor = new Scanner(arquivo);
		 
		
		//PROCESSAMEMENTO
		//Enquanto no texto tiver uma próxima linha
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] partes = linha.split(";");   
			String sobrenome = partes[1]; 
			String nomeComposto = partes[2];
			String nota = partes[1];     
			
			//SAIDA
			imprimir(sobrenome, nota, nomeComposto);
			
			
		}
		
		leitor.close(); 
	}
	
	public static void imprimir(String sobrenome, String nota, String nomeComposto) { 
		System.out.println(sobrenome +" " + nomeComposto +  "\tNota: " + nota);
		
	}
}
