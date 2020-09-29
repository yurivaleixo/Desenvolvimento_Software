package restaurante_programa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import restaurante_menu.Bebida;
import restaurante_menu.Prato;
import restaurante_menu.Vinho;

public class Cardapio {
	
	private static String arquivoPratos = "C:\\Users\\Yuri Valeixo\\Downloads\\pratos.csv";
	private static String arquivoBebidas = "C:\\Users\\Yuri Valeixo\\Downloads\\bebidas-tabuladas.txt";
	private static String arquivoVinhos = "C:\\Users\\Yuri Valeixo\\Downloads\\vinhos-tabulados.txt";
	 
	private	 static List<Prato> pratos;
	static {
		carregarPratos();
	}
	 
	public static List<Prato> listarPratos(){
		return pratos;
	}
	
	private static List<Prato> carregarPratos(){
		
		List<Prato> lista = new ArrayList<>();
		 
		try {
		File arquivo = new File(arquivoPratos);
		Scanner leitor =  new Scanner(new FileInputStream(arquivo), "UTF-8");
		leitor.nextLine();
		 
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] partes = linha.split(";");
			
			String nome = partes[0];
			double preço = Double.parseDouble(partes[1]);
		
			 
			
			Prato prato = new Prato();
			prato.setNome(nome);
			prato.setPreço(preço);
			
			lista.add(prato);
			 
		}
		
		leitor.close();
		
	}catch (FileNotFoundException e) {
		System.out.println("Arquivo não encontrado!");
		
	}
		pratos = lista;
		return lista;
		
	}
	

	public static List<Bebida> listarBebidas() {
		
		List<Bebida> lista = new ArrayList<>();
		
		try {
		File arquivo = new File(arquivoBebidas);
		Scanner leitor =  new Scanner(new FileInputStream(arquivo), "UTF-8");
		leitor.nextLine();
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] partes = linha.split("\t");
			
			String nome = partes[1];
			double preço = Double.parseDouble(partes[0].replace(",", "."));
			
			Bebida bebida = new Bebida();
			bebida.setNome(nome);
			bebida.setPreço(preço);
			
			lista.add(bebida);
		}
		
		leitor.close();
		
	}catch (FileNotFoundException e) {
		System.out.println("Arquivo não encontrado!");
	}
		return lista;
	}

	public static List<Vinho> listarVinhos() {
		
		List<Vinho> lista = new ArrayList<>();
		
		try {
		File arquivo = new File(arquivoVinhos);
		Scanner leitor =  new Scanner(new FileInputStream(arquivo), "UTF-8");
		leitor.nextLine();
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] partes = linha.split("\t");
			
			String nome = partes[1];
			double preço = Double.parseDouble(partes[0].replace(",", "."));
			
			Vinho vinho = new Vinho();
			vinho.setNome(nome);
			vinho.setPreço(preço);
			
			lista.add(vinho);
		}
		  
		leitor.close();
		
	}catch (FileNotFoundException e) {
		System.out.println("Arquivo não encontrado!");
	}
		return lista;
	}

	public static void incluirPrato(Prato prato) {
		try {
			FileWriter arquivo = new FileWriter(arquivoPratos, true);
			PrintWriter gravador = new PrintWriter(arquivo);
			gravador.println(prato.getNome() + ";" + prato.getPreço());
			gravador.close();
			arquivo.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	 
 
	public static void incluirBebida(Bebida bebida) {
		try {
			FileWriter arquivo = new FileWriter(arquivoBebidas, true);
			PrintWriter gravador = new PrintWriter(arquivo);
			String str = String.valueOf(bebida.getPreço()).replace(".", ",");
			gravador.println(str + "\t" + bebida.getNome());
			gravador.close();
			arquivo.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		 

	public static void incluirVinho(Vinho vinho) {
		try {
			FileWriter arquivo = new FileWriter(arquivoVinhos, true);
			PrintWriter gravador = new PrintWriter(arquivo);
			gravador.println(vinho.getPreço() + "\t" + vinho.getNome());
			gravador.close();
			arquivo.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static Prato buscarPrato(String query) {
		
		List<Prato> pratos = Cardapio.listarPratos();
		
		Prato pratoEncontrado = null;
		
		for (Prato prato : pratos) {
			
			if (prato.getNome().contains(query)) {
				pratoEncontrado = prato;
				break;
			}
			 
		}
		return pratoEncontrado;
	}
 
	  
 
	public static void atualizarPrato(Prato prato) {
		
		try {
			List<Prato> pratos = Cardapio.listarPratos();
			
			for (Prato p : pratos) {
				
				if (p.getNome().equals(prato.getNome())) {
						p.setPreço(prato.getPreço());
				}
			}
			
			FileWriter arquivo = new FileWriter(arquivoPratos);
			PrintWriter gravador = new PrintWriter(arquivo);
			
			gravador.println("NOME;PREÇO");
			for (Prato p : pratos) {
				gravador.println(p.getNome() + ";" + p.getPreço());
			}
			gravador.close();
			arquivo.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}	

	public static void excluirPrato(Prato pratoRetornado) {	
		
		List<Prato> pratos = Cardapio.listarPratos();
		pratos.remove(pratoRetornado);
		
		try {
			
			FileWriter arquivo = new FileWriter(arquivoPratos);		
			PrintWriter gravador = new PrintWriter(arquivo);
			
			gravador.println("NOME;PREÇO");
			for (Prato p : pratos) {
				gravador.println(p.getNome() + ";" + p.getPreço());
			}
			gravador.close();
			arquivo.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}


}
