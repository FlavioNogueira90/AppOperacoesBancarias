package br.com.edu.Operacoes_Bancaria.entities;

public abstract class ContaBancaria {

	private int agencia;
	private int conta;
	
	public ContaBancaria(int agencia, int conta) {
		super();
		this.agencia = agencia;
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "ContaBancaria [agencia=" + agencia + ", conta=" + conta + "]";
	}
	
	
}
