package br.com.edu.Operacoes_Bancaria.entities;

public class ContaCorrente extends ContaBancaria {

	private float limiteChequeEspecial;
	private float taxaManutencao;
	private boolean talonarioCheque;
	
	
	public ContaCorrente(int agencia, int conta, float limiteChequeEspecial, float taxaManutencao, boolean talonarioCheque) {
		super(agencia, conta);
		this.limiteChequeEspecial = limiteChequeEspecial;
		this.taxaManutencao = taxaManutencao;
		this.talonarioCheque = talonarioCheque;
	}


	@Override
	public String toString() {
		return "ContaCorrente [" + super.toString() + " limiteChequeEspecial=" + limiteChequeEspecial + ", taxaManutencao=" + taxaManutencao
				+ ", talonarioCheque=" + talonarioCheque + "]";
	}
	
	
	
}
