
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Programa {

  public static void main(String[] args) throws IOException {


    
    //SA�DA 
    FileWriter arquivo = new FileWriter("c:\\_ws\\_manha\\meusnumeros.txt");
    PrintWriter gravador = new PrintWriter(arquivo);
    
    for (int i = 1; i <= 1000000; i++) {
      System.out.println("Gravando n�mero... " + i);
      gravador.println("N�mero: " + i);
    }
    
    gravador.close();
    arquivo.close();

  	}

}



