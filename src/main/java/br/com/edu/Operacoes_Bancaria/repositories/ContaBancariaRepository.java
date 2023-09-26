package br.com.edu.Operacoes_Bancaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edu.Operacoes_Bancaria.entities.ContaBancaria;

public interface ContaBancariaRepository extends JpaRepository<ContaBancaria, Integer>{

}
