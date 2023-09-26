package br.com.edu.Operacoes_Bancaria.entities.testes;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.edu.Operacoes_Bancaria.entities.Cliente;
import br.com.edu.Operacoes_Bancaria.entities.ContaBancaria;
import br.com.edu.Operacoes_Bancaria.entities.ContaCorrente;
import br.com.edu.Operacoes_Bancaria.repositories.ClienteRepository;
import br.com.edu.Operacoes_Bancaria.repositories.ContaBancariaRepository;

@Component
public class ClienteTeste implements ApplicationRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ContaBancariaRepository contaBancariaRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		Cliente clie1 = new Cliente("40261731866", "Flavio Nogueira", "flavio@gmail.com", data.parse("14/07/1990"));
		Cliente clie2 = new Cliente("39466633899", "Patricia Pereira", "patty@gmail.com", data.parse("31/03/1992"));
		Cliente clie3 = new Cliente("45635786822", "Wanderley Nogueira", "vando@gmail.com", data.parse("19/04/1995"));

		clienteRepository.save(clie1);
		clienteRepository.save(clie2);
		clienteRepository.save(clie3);
		
		ContaBancaria conta1 = new ContaCorrente(0570, 599191, clie1, 1000.0f, 150.0f, 5.6f, false);
		
		contaBancariaRepository.save(conta1);
		
		System.out.println(clie1);
	}

}
