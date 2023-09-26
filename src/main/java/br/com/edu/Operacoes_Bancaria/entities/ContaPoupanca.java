package br.com.edu.Operacoes_Bancaria.entities;

import java.util.Date;

import jakarta.persistence.Entity;
@Entity
public class ContaPoupanca extends ContaBancaria {
	private static final long serialVersionUID = 1L;
	private float taxaRendimento;
	private Date aniversarioConta;
	private int limiteSaqueMensal;

	public ContaPoupanca(int agencia, int conta, Cliente cliente, float saldo, float taxaRendimento, Date aniversarioConta, int limiteSaqueMensal) {
		super(agencia, conta, cliente, saldo);
		this.taxaRendimento = taxaRendimento;
		this.aniversarioConta = aniversarioConta;
		this.limiteSaqueMensal = limiteSaqueMensal;
	}
	

	public float getTaxaRendimento() {
		return taxaRendimento;
	}


	public void setTaxaRendimento(float taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}


	public Date getAniversarioConta() {
		return aniversarioConta;
	}


	public void setAniversarioConta(Date aniversarioConta) {
		this.aniversarioConta = aniversarioConta;
	}


	public int getLimiteSaqueMensal() {
		return limiteSaqueMensal;
	}


	public void setLimiteSaqueMensal(int limiteSaqueMensal) {
		this.limiteSaqueMensal = limiteSaqueMensal;
	}


	@Override
	public String toString() {
		return "ContaPoupanca [taxaRendimento=" + taxaRendimento + ", aniversarioConta=" + aniversarioConta
				+ ", limiteSaqueMensal=" + limiteSaqueMensal + "]";
	}

	
}
