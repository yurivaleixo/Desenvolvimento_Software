import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Copiar caminho internet explorer
//Somar todos os valores 
//Somar os valores por grupos
//Imprimir os resultados
public class Ex5 {
	
	public static File lerArquivo(String nomeArquivo) {
		File arquivo = new File(nomeArquivo);
		return arquivo;
	}
	  
	public static void main(String[] args) throws FileNotFoundException {
		
		//ENTRADA
		File arquivo = lerArquivo("C:\\Users\\Yuri Valeixo\\eclipse-workspace\\tabulados.txt");
		Scanner leitor = new Scanner(arquivo); 
		 
		 
		//PROCESSAMEMENTO
		//Enquanto no texto tiver uma próxima linha
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] partes = linha.split(";");   
			String nomeCompleto = partes[0];  
			String sobrenome = nomeCompleto.split(" ")[1]; 
			String nota = partes[1];  
			
			//SAIDA  
			imprimir(sobrenome, nota);
			
			
		}
		
		leitor.close(); 
	}
	
	public static void imprimir(String sobrenome, String nota) { 
		System.out.println("Grupo: " + sobrenome + "\t Valor: " + nota);
		
	}
}
