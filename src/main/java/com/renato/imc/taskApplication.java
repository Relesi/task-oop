package com.renato.imc;

import com.renato.imc.teste.Teste1;
import com.renato.imc.teste.Teste2;
import com.renato.imc.teste.Teste3;

import com.renato.imc.teste.Teste4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class taskApplication {




	public static void main(String[] args) {
		SpringApplication.run(taskApplication.class, args);


		Teste1.executa();
		Teste2.executa();
		Teste3.executa();
		Teste4.executa();


		System.out.println("\n-\nfim!");
	}




}
