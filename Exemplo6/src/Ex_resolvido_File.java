import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner; 


public class Ex_resolvido_File {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Users\\Yuri Valeixo\\eclipse-workspace\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		  //PROCESSAMENTO
	    int valorTotal = 0; 
	    
	    //A, B, C, D, E, F
	    int valorTotalA = 0;
	    int valorTotalB = 0;
	    int valorTotalC = 0;
	    int valorTotalD = 0;
	    int valorTotalE = 0; 
	    int valorTotalF = 0;
	    
	    //Enquanto houver linhas de texto...
	    while(leitor.hasNext()) {
	      String linha = leitor.nextLine(); 
	      String[] partes = linha.split("\t");
	      String grupo = partes[0];
	      String vlrStr = partes[1];
	      
	      //Somar todos os valores
	      int valorLinha = Integer.parseInt(vlrStr);
	      //valorTotal = valorTotal + valorLinha;
	      valorTotal += valorLinha;
	      
	      //Somar os valores por grupos
	      switch(grupo.charAt(0)) {
	        case 'A' :{
	          valorTotalA += valorLinha;
	          break;
	        }
	        case 'B' :{
	          valorTotalB += valorLinha;
	          break;
	        }      
	        case 'C' :{
	          valorTotalC += valorLinha;
	          break;
	        }      
	        case 'D' :{
	          valorTotalD += valorLinha;
	          break;
	        } 
	        case 'E' :{
	          valorTotalE += valorLinha;
	          break;
	        } 
	        case 'F' :{
	          valorTotalF += valorLinha;
	          break;
	        }      
	      }
	    }
	   
	    
	    //SAÍDA
	    //Imprimir o resultado
	    System.out.println("Valor total A: " + valorTotalA);
	    System.out.println("Valor total B: " + valorTotalB);
	    System.out.println("Valor total C: " + valorTotalC);
	    System.out.println("Valor total D" + valorTotalD);
	    System.out.println("Valor total E: " + valorTotalE);
	    System.out.println("Valor total F: " + valorTotalF); 
	    System.out.println("Valor total: " + valorTotal);
	    
	     
	    //SAÍDA
	    FileWriter arquivoSaida = new FileWriter("C:\\Users\\Yuri Valeixo\\eclipse-workspace//relatorio-de-grupos.txt");
	    PrintWriter gravador = new PrintWriter(arquivoSaida);
	    
	    System.out.println("Valor total A: " + valorTotalA);
	    gravador.println("Valor total A: " + valorTotalA);
	    System.out.println("Valor total B: " + valorTotalB);
	    gravador.println("Valor total B: " + valorTotalB);
	    System.out.println("Valor total C: " + valorTotalC);
	    gravador.println("Valor total C: " + valorTotalC);
	    System.out.println("Valor total D: " + valorTotalD);
	    gravador.println("Valor total D: " + valorTotalD);
	    System.out.println("Valor total E: " + valorTotalE);
	    gravador.println("Valor total E: " + valorTotalE);
	    System.out.println("Valor total F: " + valorTotalF);
	    gravador.println("Valor total F: " + valorTotalF);
	    
	    
	    
	    
	    gravador.close();
	    arquivoSaida.close();
	    leitor.close();

	  	}
	    
	  }
