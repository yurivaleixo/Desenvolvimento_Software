package Menu;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Op��es.Bebida;
import Op��es.Prato;
import Op��es.Vinho;

public class Programa {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informa��o\\Dev Software\\bebidas-tabuladas.txt");
		Scanner leitor = new Scanner(new FileInputStream(arquivo));
		leitor.nextLine();
		
		File arquivo2 = new File("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informa��o\\Dev Software\\vinhos-tabulados.txt");
		Scanner leitor2 = new Scanner(new FileInputStream(arquivo2));
		leitor2.nextLine();
		
		File arquivo3 = new File("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informa��o\\Dev Software\\pratos.csv");
		Scanner leitor3 = new Scanner(new FileInputStream(arquivo3));
		leitor3.nextLine();
		
		List<Bebida> listaDeBebida = new ArrayList<>();
		List<Vinho> listaDeVinho = new ArrayList<>();
		List<Prato> listaDePrato = new ArrayList<>();
	
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] partes = linha.split("\t");
			String strPre�o = partes[0];
			String nome = partes[1];
			String pontoPre�o = strPre�o.replace(",", ".");
			
			double pre�o = Double.parseDouble(pontoPre�o);
			
			Bebida bebida = new Bebida();
			bebida.setNome(nome);
			bebida.setPre�o(pre�o);
			
			 
			listaDeBebida.add(bebida);
			
			  
		}
		
		while(leitor2.hasNext()) {
			String linha = leitor2.nextLine();
			String[] partes = linha.split("\t");
			String strPre�o = partes[0];
			String nome = partes[1];
			String pontoPre�o = strPre�o.replace(",", ".");
			
			double pre�o = Double.parseDouble(pontoPre�o);
			
			Vinho vinho = new Vinho();
			vinho.setNome(nome);
			vinho.setPreco(pre�o);
			
			
			listaDeVinho.add(vinho);
			
			  
		}
		
		while(leitor3.hasNext()) {
			String linha = leitor3.nextLine();
			String[] partes = linha.split(";");
			String nome = partes[0];
			String strPre�o = partes[1];
	
			
			double pre�o = Double.parseDouble(strPre�o);
			
			Prato prato = new Prato();
			prato.setNome(nome);
			prato.setPre�o(pre�o);
			
			   
			listaDePrato.add(prato);
			
			  
		}
		Scanner leitor4 =  new Scanner(System.in);
		
		
		int op = 0;
		String resp = "";
		int beb = 0;
		Bebida escolhida = new Bebida();
		Vinho escolhido = new Vinho();
		Prato escolhidoPrat = new Prato();
		List<Bebida> listaEscolhaBeb = new ArrayList <>();
		List<Vinho> listaEscolhaVin = new ArrayList <>();
		List<Prato> listaEscolhaPrat = new ArrayList <>();
		
		do {
			System.out.println("-----Selecione o item que deseja-----");
			System.out.println("[0] - Bebida");
			System.out.println("[1] - Vinho");
			System.out.println("[2] - Prato");
		    op = leitor4.nextInt();
		    
		    switch(op) {
		    case 0:
		    	System.out.println("----Lista de bebidas----");
		    	
				for (int i = 0; i < listaDeBebida.size(); i++) {
					
					Bebida bebida = listaDeBebida.get(i);
					
					System.out.println(i + " - " + bebida.getNome() + " R$ " + bebida.getPre�o());
					
					
				}
				
				System.out.println("Selecione a bebida que deseja!");
				beb = leitor4.nextInt();
				
				for (int i = 0; i < listaDeBebida.size(); i++) {
					
					Bebida bebida = listaDeBebida.get(i);
				
				if(beb == i){
					bebida = listaDeBebida.get(i);
					escolhida = bebida;
					}
					
					
				}
				
				listaEscolhaBeb.add(escolhida);
		    	break;
		    
		    case 1:
		    	for (int i = 0; i < listaDeVinho.size(); i++) {
					
					Vinho vinho = listaDeVinho.get(i);
					
					System.out.println(i + " - " + vinho.getNome() + " R$ " + vinho.getPre�o());
				} 
		    	
		    	System.out.println("Selecione o vinho que deseja!");
				beb = leitor4.nextInt();
				
				for (int i = 0; i < listaDeVinho.size(); i++) {
					
					Vinho vinho = listaDeVinho.get(i);
				
				if(beb == i){
					vinho = listaDeVinho.get(i);
					escolhido = vinho;
					}
					
					
				}
				
				listaEscolhaVin.add(escolhido);
		    	break;
		    
		    case 2:
		    	for (int i = 0; i < listaDePrato.size(); i++) {
					
					Prato prato = listaDePrato.get(i);
					
					System.out.println(i + " - " + prato.getNome() + " R$ " + prato.getPre�o());
				}
		    	
		    	System.out.println("Selecione o prato que deseja!");
				beb = leitor4.nextInt();
				
				for (int i = 0; i < listaDePrato.size(); i++) {
					
					Prato prato = listaDePrato.get(i);
				
				if(beb == i){
					prato = listaDePrato.get(i);
					escolhidoPrat = prato;
					}
					
					
				}
				
				listaEscolhaPrat.add(escolhidoPrat);
		    	break;
		    	 
		    } 
		    
		    System.out.println("Deseja continuar? sim ou n�o.");
			resp = leitor4.next(); 
		    
		}while(resp.equals("sim"));
		
		double contaTotal = 0;
		
		for (Bebida bebida : listaEscolhaBeb) {
			System.out.println("Bebidas escolhidas --> " + bebida.getNome() + " R$ " + bebida.getPre�o());
			contaTotal = contaTotal + bebida.getPre�o();
		}
		
		for (Vinho vinho: listaEscolhaVin) {
			System.out.println("Vinhos escolhidos --> " + vinho.getNome() + " R$ " + vinho.getPre�o());
			contaTotal = contaTotal + vinho.getPre�o();
		}
		
		for (Prato prato : listaEscolhaPrat) {
			System.out.println("Prato escolhido --> " + prato.getNome() + " R$ " + prato.getPre�o());
			contaTotal = contaTotal + prato.getPre�o();
		}
		
		System.out.println("\nTotal bebidas --> " + " R$ " +  contaTotal);
		System.out.println("Total Vinhos --> " + " R$ " +  contaTotal);
		System.out.println("Total Pratos --> " + " R$ " +  contaTotal);
		leitor.close();
		
	}
}
