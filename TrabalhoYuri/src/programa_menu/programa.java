package programa_menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class programa {

	public static void main(String[] args) {
		

		List<Prato> listaDePratos = Cardapio.listarPratos();
		List<Bebida> listaDeBebidas = Cardapio.listarBebidas();
		List<Vinho> listaDeVinhos = Cardapio.listarVinhos();
		
		List<Prato> listaDePratosSelecionados = new ArrayList<>();
		List<Bebida> listaDeBebidasSelecionadas = new ArrayList<>();
		List<Vinho> listaDeVinhosSelecionados = new ArrayList<>();
		
		Prato prato = new Prato();
		prato.setNome("Novo Prato");
		prato.setPreco(10.30);
		Cardapio.incluirPrato(prato);
		
		Bebida bebida = new Bebida();
		bebida.setNome("Nova Bebida");
		bebida.setPreco(10.35);
		Cardapio.incluirBebida(bebida);
		
		
		Vinho vinho = new Vinho();
		prato.setNome("Novo Vinho");
		prato.setPreco(10.45);
		Cardapio.incluirVinho(vinho);
		
		Pedido pedido = new Pedido();
		pedido.setPratos(listaDePratosSelecionados);
		pedido.setBebidas(listaDeBebidasSelecionadas);
		pedido.setVinhos(listaDeVinhosSelecionados);
		
		
		Scanner leitor = new Scanner(System.in);
		boolean desejaSelecionarItem = true;
		do {
			System.out.println("Digite o número da opção desejada!");
			System.out.println("0 - Sair");
			System.out.println("1 - Pratos");
			System.out.println("2 - Bebidas");
			System.out.println("3 - Vinhos");
			
			int opcao = leitor.nextInt();
			
			switch(opcao) {
			case 0: {
				desejaSelecionarItem = false;
				break;
			}
			case 1: {
				boolean desejaSelecionarPrato = true;
				do {
					System.out.println("Digite o número do prato desejado!");
					System.out.println("0 - Sair");
					for (int i = 0; i < listaDePratos.size(); i++) {
						Prato p = listaDePratos.get(i);
						System.out.println((i+1) + ". " + p.getNome() + " " + p.getPreco());
						
					}
					
					opcao = leitor.nextInt();
					
					if (opcao == 0) {
						desejaSelecionarPrato = false;
					}else {
						Prato pratoSelecionado = listaDePratos.get(--opcao);
						listaDePratosSelecionados.add(pratoSelecionado);	
					}
				}while (desejaSelecionarPrato);
				break;
			}
			case 2: {
				boolean desejaSelecionarBebida = true;
				do {
					System.out.println("Digite o número  da bebida desejada!");
					System.out.println("0 - Sair");
					for (int i = 0; i < listaDeBebidas.size(); i++) {
						Bebida b = listaDeBebidas.get(i);
						System.out.println((i+1) + ". " + b.getNome() + " " + b.getPreco());
					}
					opcao = leitor.nextInt();
					
					if(opcao == 0) {
						desejaSelecionarBebida = false;
					}else if (opcao < 0 || opcao > listaDeBebidas.size()){
						System.out.println("------------------------------");
						System.out.println("A opção selecionada é inválida");
						System.out.println("------------------------------");
					}else {
						Bebida bebidaSelecionada = listaDeBebidas.get(--opcao);
						listaDeBebidasSelecionadas.add(bebidaSelecionada);
					}
				}while(desejaSelecionarBebida);
				break;
			}
			case 3: {
				boolean desejaSelecionarVinho = true;
				do {
					System.out.println("Digite  o número do vinho desejado!");
					System.out.println("0 - Sair");
					for (int i = 0; i < listaDeVinhos.size(); i++) {
						Vinho v = listaDeVinhos.get(i);
						System.out.println((i+1) + ". " + v.getNome() + " " + v.getPreco());
					}
					
					opcao = leitor.nextInt();
					
					if(opcao == 0) {
						desejaSelecionarVinho = false;
					}else if (opcao < 0 || opcao > listaDeVinhos.size()) {
						System.out.println("------------------------------");
						System.out.println("A opção selecionada é inválida");
						System.out.println("------------------------------");
					}else {
						Vinho vinhoSelecionado = listaDeVinhos.get(--opcao);
						listaDeVinhosSelecionados.add(vinhoSelecionado);
					}
				}while(desejaSelecionarVinho);
				break;
			}
			default: {
				System.out.println("------------------------------");
				System.out.println("A opção selecionada é inválida");
				System.out.println("------------------------------");
			}
		}
	
		
	}while(desejaSelecionarItem);
	leitor.nextLine();
	
	System.out.println("Observação do pedido!");
	pedido.setObservacao(leitor.nextLine());
	
	
	try {
		String nomeDoarquivo = 
	}
	

			
	
	
	
}
