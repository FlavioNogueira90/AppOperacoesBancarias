package br.com.edu.Operacoes_Bancaria.entities;

public class ContaInvestimento extends ContaBancaria {
	
	private float taxaJuros;
	private int prazoInvestimento;
	private float valorInvestido;
	
	public ContaInvestimento(int agencia, int conta, float taxaJuros, int prazoInvestimento, float valorInvestido) {
		super(agencia, conta);
		this.taxaJuros = taxaJuros;
		this.prazoInvestimento = prazoInvestimento;
		this.valorInvestido = valorInvestido;
	}

	@Override
	public String toString() {
		return "ContaInvestimento [taxaJuros=" + taxaJuros + ", prazoInvestimento=" + prazoInvestimento
				+ ", valorInvestido=" + valorInvestido + "]";
	}
	
	
}
