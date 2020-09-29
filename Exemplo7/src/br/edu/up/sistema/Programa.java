package br.edu.up.sistema;

import br.edu.up.dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa[] vetorDePessoas = new Pessoa[2];
		
		//Entrada 
		Pessoa pessoa1 =  new Pessoa(); 
		pessoa1.nome = "Gustavo";
		pessoa1.cpf = "12345";     
		pessoa1.telefone = "999999999";
		pessoa1.idade = 42;
		vetorDePessoas[0] = pessoa1;
		
		Pessoa pessoa2 = new Pessoa(); 
		pessoa2.nome = "Felipe";
		pessoa2.cpf = "453535";
		pessoa2.telefone = "888888888";
		pessoa2.idade = 15;
		
		vetorDePessoas[1] = pessoa2;
		
		//Saida
		for (int i = 0; i < vetorDePessoas.length; i++) {
			Pessoa coco = vetorDePessoas[i]; 
			System.out.println("Nome: " + coco.nome);
			System.out.println("CPF" + coco.cpf);
			System.out.println("Telefone: " + coco.telefone);
			System.out.println("idade: " + coco.idade);
		}
		
	}

}
