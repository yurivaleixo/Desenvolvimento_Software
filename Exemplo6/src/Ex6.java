
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex6 {

  public static void main(String[] args) throws IOException {


    
    //SAÍDA
    FileWriter arquivo = new FileWriter("C:\\Users\\Yuri Valeixo\\eclipse-workspace//relatorio-de-grupos.txt");
    PrintWriter gravador = new PrintWriter(arquivo);
    
    for (int i = 1; i <= 10; i++) { 
      System.out.println("Gravando número... " + i);
      gravador.println("Número: " + i);
    }
    
    gravador.close();
    arquivo.close(); 

  	}

}



