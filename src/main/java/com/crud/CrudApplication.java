package com.crud;

import com.crud.Model.Pessoa;
import com.crud.repositories.PessoaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.repository")
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);

		ApplicationContext context = SpringApplication.run(CrudApplication.class, args);
		PessoaRepository pessoaRepository = context.getBean(PessoaRepository.class);
		List<Pessoa> pessoas = pessoaRepository.findAll();
		for (Pessoa pessoa : pessoas) {
			System.out.println("Id: " + pessoa.getId());
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Sobrenome: " + pessoa.getSobrenome());
			System.out.println("CPF: " + pessoa.getCpf());
			System.out.println("Email: " + pessoa.getEmail());
			System.out.println("Endereço: " + pessoa.getEndereco());
			System.out.println("Nacionalidade: " + pessoa.getNacionalidade());
			System.out.println("------------------------");
		}

	}
}
