package br.com.edu.Operacoes_Bancaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edu.Operacoes_Bancaria.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
