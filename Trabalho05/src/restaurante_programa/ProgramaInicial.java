package restaurante_programa;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import restaurante_menu.Bebida;
import restaurante_menu.Pedido;
import restaurante_menu.Prato;
import restaurante_menu.Vinho;


public class ProgramaInicial {
	public static void main(String[] args) {
		  
	
	List<Prato> listaPratos = Cardapio.listarPratos();
	List<Bebida> listaBebidas = Cardapio.listarBebidas();
	List<Vinho> listaVinhos = Cardapio.listarVinhos();
	     

	List<Prato> PratosSelecionados =  new ArrayList<>();
	List<Bebida> BebidasSelecionadas =  new ArrayList<>();
	List<Vinho> VinhosSelecionados =  new ArrayList<>();
	
	  
	Prato prato = new Prato();
	prato.setNome("Novo Prato");
	prato.setPre�o(10.30);

	
	//String query = "Novo";
	//Prato pratoRetornado = Cardapio.buscarPrato(query);
	
	//if(pratoRetornado == null) { 
		//System.out.println("Prato n�o encontrado!");
	//}else {
		//System.out.println("Prato: " + pratoRetornado.getNome());
	//}	 
	  
		//Cardapio.excluirPrato(pratoRetornado);

	Bebida bebida = new Bebida();
	bebida.setNome("Nova bebida");
	bebida.setPre�o(10.35);

	 
	Vinho vinho = new Vinho();
	vinho.setNome("Novo vinho");
	vinho.setPre�o(10.45);

	
	Pedido pedido = new Pedido();
	pedido.setPratos(PratosSelecionados);
	pedido.setBebidas(BebidasSelecionadas);
	pedido.setVinhos(VinhosSelecionados);
 
	Scanner leitor =  new Scanner(System.in);
	boolean desejaSelecionarItem = true;
	do {
		System.out.println("Digite  o n�mero  da op��o desejada!");
		System.out.println("0 - Sair");
		System.out.println("1 - Pratos");
		System.out.println("2 - Bebidas");
		System.out.println("3 - Vinhos");
		   
		int opcao = leitor.nextInt();
		
		switch(opcao) {
			case 0: {
				desejaSelecionarItem =  false;
				break;
			}
			case 1: {
				boolean desejaSelecionarPrato = true;
				do {
					System.out.println("Digite o n�mero  do prato  desejado!");
					System.out.println("0 - Sair");
					for (int i = 0; i < listaPratos.size(); i++) {
						Prato p = listaPratos.get(i);
						System.out.println((i+1) + ". " + p.getNome() + " " + p.getPre�o());
					}
					opcao = leitor.nextInt();
					  
					if (opcao == 0) { 
						desejaSelecionarPrato = false;
					}else if (opcao < 0 || opcao > listaPratos.size()) {
						System.out.println("-------------------------------");
						System.out.println("A op��o selecionada � inv�lida!");
						System.out.println("-------------------------------");
					}else {
						Prato pratoSelecionado = listaPratos.get(--opcao);
						PratosSelecionados.add(pratoSelecionado);
					}
				}while(desejaSelecionarPrato);
				break;
			}  
			case 2: {
				boolean desejaSelecionarBebida = true;
				do {
					System.out.println("Digite  o n�mero da bebida desejada!");
					System.out.println("0 - Sair");
					for (int i = 0; i < listaBebidas.size(); i++) {
						Bebida b = listaBebidas.get(i); 
						System.out.println((i+1) + ". " + b.getNome() + " " + b.getPre�o());	
					}
					opcao = leitor.nextInt();
					
					if (opcao == 0) {
						desejaSelecionarBebida = false;
					}else if (opcao < 0  || opcao > listaBebidas.size()) {
						System.out.println("-------------------------------");
						System.out.println("A op��o selecionada � inv�lida!");
						System.out.println("-------------------------------");
					}else {
						Bebida bebidaSelecionada = listaBebidas.get(--opcao);
						BebidasSelecionadas.add(bebidaSelecionada);
					}
				}while(desejaSelecionarBebida);
				break;
			}    
			case 3: {
				boolean desejaSelecionarVinho = true;
				do {
					System.out.println("Digite o n�mero do vinho desejada!");
					System.out.println("0 - Sair");
					for (int i = 0; i < listaVinhos.size(); i++) {
						Vinho v = listaVinhos.get(i);
						System.out.println((i+1) + ". " + v.getNome() + " " + v.getPre�o());	
					}
					opcao = leitor.nextInt();
					
					if (opcao == 0) {
						desejaSelecionarVinho = false;
					}else if (opcao < 0  || opcao > listaVinhos.size()) {
						System.out.println("-------------------------------");
						System.out.println("A op��o selecionada � inv�lida!");
						System.out.println("-------------------------------");
					}else {
						Vinho vinhoSelecionado = listaVinhos.get(--opcao);
						VinhosSelecionados.add(vinhoSelecionado);
					}
				}while(desejaSelecionarVinho);
				break;
			}
			default: {
				System.out.println("-------------------------------");
				System.out.println("A op��o selecionada � inv�lida!");
				System.out.println("-------------------------------");
			}
		 
		}
	 
	
		}while(desejaSelecionarItem);
		leitor.nextLine();
		
		System.out.println("Observa��o ou pedido!");
		pedido.setObserva��o(leitor.nextLine());
		
		
		try {
			FileWriter arquivoPedido =  new FileWriter("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informa��o\\Dev Software\\arquivos-pedidos.txt", StandardCharsets.UTF_8);
			PrintWriter gravador = new  PrintWriter(arquivoPedido);
			    
			
			gravador.println("------------------------");
			gravador.println("Pedido --> " + pedido.getCodigo());
			gravador.println("------------------------");
			     
			for (Prato p : pedido.getPratos()) {
				gravador.println(p.getNome() + ", " + p.getPre�o());
			} 
			for (Bebida b : pedido.getBebidas()) {
				gravador.println(b.getNome() + ", " + b.getPre�o());
			}
			for (Vinho v : pedido.getVinhos()) {
				gravador.println(v.getNome() + ", " + v.getPre�o());
			}
			   
			     
			gravador.println("-----------------------");
			gravador.println("Observa��o --> " + pedido.getObserva��o());
			gravador.println("-----------------------");
			gravador.println("Total: " + pedido.getTotal());
			
			gravador.close();
			arquivoPedido.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		        
		System.out.println("Programa terminado!");
		leitor.close();
	}
	
}
