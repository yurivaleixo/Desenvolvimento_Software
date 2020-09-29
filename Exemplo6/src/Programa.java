
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Programa {

  public static void main(String[] args) throws IOException {


    
    //SAÍDA 
    FileWriter arquivo = new FileWriter("c:\\_ws\\_manha\\meusnumeros.txt");
    PrintWriter gravador = new PrintWriter(arquivo);
    
    for (int i = 1; i <= 1000000; i++) {
      System.out.println("Gravando número... " + i);
      gravador.println("Número: " + i);
    }
    
    gravador.close();
    arquivo.close();

  	}

}



