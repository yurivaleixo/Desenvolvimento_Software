package br.edu.up.dominio;

public class Aluno {
private String matricula;
private String nome;
private double nota;

//get > pegar o valor da variavel
public String getMatricula() {
	return matricula;
}
 
//set > atribuir o valor da variavel
public void setMatricula(String numero) {
	this.matricula =  numero;
	}
 
public double getNota() {
	return nota;
}

public void setNota(double nota) {
	
	if(nota < 0 | nota > 10) {
		System.out.println("Nota inválida!"+ matricula + " Atribuiu -1");
		
		
	}
	this.nota = nota;
	
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
}
