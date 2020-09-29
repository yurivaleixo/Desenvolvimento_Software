package Menu;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Opções.Bebida;
import Opções.Prato;
import Opções.Vinho;

public class Programa {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informação\\Dev Software\\bebidas-tabuladas.txt");
		Scanner leitor = new Scanner(new FileInputStream(arquivo));
		leitor.nextLine();
		
		File arquivo2 = new File("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informação\\Dev Software\\vinhos-tabulados.txt");
		Scanner leitor2 = new Scanner(new FileInputStream(arquivo2));
		leitor2.nextLine();
		
		File arquivo3 = new File("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informação\\Dev Software\\pratos.csv");
		Scanner leitor3 = new Scanner(new FileInputStream(arquivo3));
		leitor3.nextLine();
		
		List<Bebida> listaDeBebida = new ArrayList<>();
		List<Vinho> listaDeVinho = new ArrayList<>();
		List<Prato> listaDePrato = new ArrayList<>();
	
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] partes = linha.split("\t");
			String strPreço = partes[0];
			String nome = partes[1];
			String pontoPreço = strPreço.replace(",", ".");
			
			double preço = Double.parseDouble(pontoPreço);
			
			Bebida bebida = new Bebida();
			bebida.setNome(nome);
			bebida.setPreço(preço);
			
			 
			listaDeBebida.add(bebida);
			
			  
		}
		
		while(leitor2.hasNext()) {
			String linha = leitor2.nextLine();
			String[] partes = linha.split("\t");
			String strPreço = partes[0];
			String nome = partes[1];
			String pontoPreço = strPreço.replace(",", ".");
			
			double preço = Double.parseDouble(pontoPreço);
			
			Vinho vinho = new Vinho();
			vinho.setNome(nome);
			vinho.setPreco(preço);
			
			
			listaDeVinho.add(vinho);
			
			  
		}
		
		while(leitor3.hasNext()) {
			String linha = leitor3.nextLine();
			String[] partes = linha.split(";");
			String nome = partes[0];
			String strPreço = partes[1];
	
			
			double preço = Double.parseDouble(strPreço);
			
			Prato prato = new Prato();
			prato.setNome(nome);
			prato.setPreço(preço);
			
			   
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
					
					System.out.println(i + " - " + bebida.getNome() + " R$ " + bebida.getPreço());
					
					
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
					
					System.out.println(i + " - " + vinho.getNome() + " R$ " + vinho.getPreço());
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
					
					System.out.println(i + " - " + prato.getNome() + " R$ " + prato.getPreço());
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
		    
		    System.out.println("Deseja continuar? sim ou não.");
			resp = leitor4.next(); 
		    
		}while(resp.equals("sim"));
		
		double contaTotal = 0;
		
		for (Bebida bebida : listaEscolhaBeb) {
			System.out.println("Bebidas escolhidas --> " + bebida.getNome() + " R$ " + bebida.getPreço());
			contaTotal = contaTotal + bebida.getPreço();
		}
		
		for (Vinho vinho: listaEscolhaVin) {
			System.out.println("Vinhos escolhidos --> " + vinho.getNome() + " R$ " + vinho.getPreço());
			contaTotal = contaTotal + vinho.getPreço();
		}
		
		for (Prato prato : listaEscolhaPrat) {
			System.out.println("Prato escolhido --> " + prato.getNome() + " R$ " + prato.getPreço());
			contaTotal = contaTotal + prato.getPreço();
		}
		
		System.out.println("\nTotal bebidas --> " + " R$ " +  contaTotal);
		System.out.println("Total Vinhos --> " + " R$ " +  contaTotal);
		System.out.println("Total Pratos --> " + " R$ " +  contaTotal);
		leitor.close();
		
	}
}
