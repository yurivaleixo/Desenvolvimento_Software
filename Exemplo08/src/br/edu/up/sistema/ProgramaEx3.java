package br.edu.up.sistema;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.dominio.Cliente;

public class ProgramaEx3 {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Users\\Yuri Valeixo\\Documents\\Sistemas de Informação\\Dev Software\\clientes.csv");
		Scanner leitor = new Scanner(new FileInputStream(arquivo));
		leitor.nextLine(); 
		
		List<Cliente> listaDeCliente =  new ArrayList<>();
		List<Cliente> duplicados = new ArrayList <>();
		
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] partes = linha.split(";");
			String cpf = partes[0];
			String nome = partes[1];
			String strCodigo = partes[2];
			String strCredito = partes[3];
			String strPonto = strCredito.replace(",", "."); 
			  
			double codigo = Double.parseDouble(strCodigo);
			double credito = Double.parseDouble(strPonto);
			  
			
			Cliente cliente = new Cliente();
			cliente.setCpf(cpf); 
			cliente.setNome(nome);
			cliente.setCodigo(codigo); 
			cliente.setCredito(credito); 
			
			
			listaDeCliente.add(cliente);
			
		}
		 
		 
		  
		double maisAntigo = 10000;
		double maiorCredito = 0;
		double somaCredito = 0;
		Cliente clienteMaisAntigo = new Cliente();
		Cliente clienteMaiorCredito = new Cliente();
		
		 
		   
		for (int i = 0; i < listaDeCliente.size(); i++) {
			
			Cliente cliente = listaDeCliente.get(i);
			
			for (int j = i + 1 ; j < listaDeCliente.size(); j++) {
				  
				Cliente cliente2 = listaDeCliente.get(j);
				
				if(cliente.getCodigo() == cliente2.getCodigo()) {
					duplicados.add(cliente);
					   
				}  
				       
			}
			
			if(cliente.getCodigo() < maisAntigo) {
				maisAntigo = cliente.getCodigo();
				clienteMaisAntigo = cliente;
			} 
			  
			if(cliente.getCredito() > maiorCredito) {
				maiorCredito = cliente.getCredito();
				clienteMaiorCredito = cliente;
			}
			   
		      
			somaCredito = somaCredito + cliente.getCredito();
			 
		}	
		 
		System.out.println("Cliente mais antigo: " + clienteMaisAntigo.getNome() + " --> " + clienteMaisAntigo.getCodigo()); 
		System.out.println("Maior credito: " + clienteMaiorCredito.getNome() + " --> " + clienteMaiorCredito.getCredito());
		System.out.println("Quantidade de clientes duplicados: " + duplicados.size());
		for (Cliente cliente : duplicados) {
			System.out.println("Clientes duplicado: " + cliente.getNome());
			    
		}
		System.out.println("Crédito total: " + somaCredito);
		 
		leitor.close();
	}
 
}
