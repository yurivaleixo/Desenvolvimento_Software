import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class treino {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Users\\Yuri Valeixo\\eclipse-workspace\\nomes.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		String[] vetorNome = new String[5];
		int cont = 0;
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] partes = linha.split(";");
			String nome = partes[0];
			String nomeComposto = partes[1];
			String nomeSobrenome = partes[2];
			String nota = partes[3]; 
	
			FileWriter arquivoSaida = new FileWriter("C:\\Users\\Yuri Valeixo\\eclipse-workspace\\relatorio-treino.txt");
			PrintWriter gravador =  new PrintWriter(arquivoSaida);
			
			
			gravador.println("Nome: " + nome); 
	
			
			gravador.close();
		

		}
		

	}
	
}
