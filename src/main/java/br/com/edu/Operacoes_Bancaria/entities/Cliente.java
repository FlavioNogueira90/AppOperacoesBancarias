package br.com.edu.Operacoes_Bancaria.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cpf;
	private String nome;
	private String email;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataNasc;
	
	@OneToMany(mappedBy = "cliente")
	private List<ContaBancaria> contas;
	
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	

	
}
