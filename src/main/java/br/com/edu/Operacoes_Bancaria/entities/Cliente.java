package br.com.edu.Operacoes_Bancaria.entities;

import java.util.Date;

public class Cliente {

	private String cpf;
	private String nome;
	private String email;
	private Date dataNasc;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String cpf, String nome, String email, Date dataNasc) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", dataNasc=" + dataNasc + "]";
	}

	
}
