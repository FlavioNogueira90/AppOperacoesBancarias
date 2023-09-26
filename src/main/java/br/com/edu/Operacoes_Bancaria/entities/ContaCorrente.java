package br.com.edu.Operacoes_Bancaria.entities;

import jakarta.persistence.Entity;

@Entity
public class ContaCorrente extends ContaBancaria {
	private static final long serialVersionUID = 1L;
	private float limiteChequeEspecial;
	private float taxaManutencao;
	private boolean talonarioCheque;
	
	
	public ContaCorrente(int agencia, int conta, Cliente cliente, float saldo, float limiteChequeEspecial, float taxaManutencao, boolean talonarioCheque) {
		super(agencia, conta, cliente, saldo);
		this.limiteChequeEspecial = limiteChequeEspecial;
		this.taxaManutencao = taxaManutencao;
		this.talonarioCheque = talonarioCheque;
	}

	
	public float getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(float limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public float getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(float taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public boolean isTalonarioCheque() {
		return talonarioCheque;
	}

	public void setTalonarioCheque(boolean talonarioCheque) {
		this.talonarioCheque = talonarioCheque;
	}

	@Override
	public String toString() {
		return "ContaCorrente [" + super.toString() + " limiteChequeEspecial=" + limiteChequeEspecial + ", taxaManutencao=" + taxaManutencao
				+ ", talonarioCheque=" + talonarioCheque + "]";
	}
	
	
	
}
