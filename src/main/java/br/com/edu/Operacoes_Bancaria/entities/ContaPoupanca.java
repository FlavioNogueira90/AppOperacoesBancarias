package br.com.edu.Operacoes_Bancaria.entities;

import java.util.Date;

public class ContaPoupanca extends ContaBancaria {
	
	private float taxaRendimento;
	private Date aniversarioConta;
	private int limiteSaqueMensal;

	public ContaPoupanca(int agencia, int conta, float taxaRendimento, Date aniversarioConta, int limiteSaqueMensal) {
		super(agencia, conta);
		this.taxaRendimento = taxaRendimento;
		this.aniversarioConta = aniversarioConta;
		this.limiteSaqueMensal = limiteSaqueMensal;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [taxaRendimento=" + taxaRendimento + ", aniversarioConta=" + aniversarioConta
				+ ", limiteSaqueMensal=" + limiteSaqueMensal + "]";
	}

	
}
