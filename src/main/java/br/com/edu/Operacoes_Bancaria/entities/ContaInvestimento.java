package br.com.edu.Operacoes_Bancaria.entities;

import jakarta.persistence.Entity;

@Entity
public class ContaInvestimento extends ContaBancaria {
	private static final long serialVersionUID = 1L;
	private float taxaJuros;
	private int prazoInvestimento;
	private float valorInvestido;
	
	public ContaInvestimento(int agencia, int conta, Cliente cliente,float saldo, float taxaJuros, int prazoInvestimento, float valorInvestido) {
		super(agencia, conta, cliente, saldo);
		this.taxaJuros = taxaJuros;
		this.prazoInvestimento = prazoInvestimento;
		this.valorInvestido = valorInvestido;
	}
	

	public float getTaxaJuros() {
		return taxaJuros;
	}


	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}


	public int getPrazoInvestimento() {
		return prazoInvestimento;
	}


	public void setPrazoInvestimento(int prazoInvestimento) {
		this.prazoInvestimento = prazoInvestimento;
	}


	public float getValorInvestido() {
		return valorInvestido;
	}


	public void setValorInvestido(float valorInvestido) {
		this.valorInvestido = valorInvestido;
	}


	@Override
	public String toString() {
		return "ContaInvestimento [taxaJuros=" + taxaJuros + ", prazoInvestimento=" + prazoInvestimento
				+ ", valorInvestido=" + valorInvestido + "]";
	}
	
	
}
