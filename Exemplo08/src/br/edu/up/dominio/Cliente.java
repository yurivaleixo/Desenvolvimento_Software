package br.edu.up.dominio;

public class Cliente {

	public String cpf;
	public String nome;
	public double codigo;
	public double credito;
	
	public void setCpf(String cpf) {
		// TODO Auto-generated method stub
	this.cpf = cpf;	
		
	}

	public void setNome(String nome) {
		// TODO Auto-generated method stub
		this.nome = nome;
	}
	
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	
	public double getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	public void setCodigo(double codigo) {
		// TODO Auto-generated method stub
		this.codigo = codigo;
	}

	
	public void setCredito(double credito) {
		// TODO Auto-generated method stub
		this.credito = credito;
	}

	public double getCredito() {
		// TODO Auto-generated method stub
		return credito;
	}

	public String getCpf() {
		// TODO Auto-generated method stub
		return cpf;
	}


}
