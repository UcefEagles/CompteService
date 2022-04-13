package com.s2.CompteService;

import com.s2.CompteService.entities.Compte;
import com.s2.CompteService.enums.TypeCompte;
import com.s2.CompteService.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class CompteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompteServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository){

		return args -> {
			compteRepository.save(new Compte(1,11000,new Date(),TypeCompte.EPARGNE));
			compteRepository.save(new Compte(2,11000,new Date(),TypeCompte.EPARGNE));
			compteRepository.save(new Compte(3,65000,new Date(),TypeCompte.COURANT));
			compteRepository.save(new Compte(4,67711,new Date(),TypeCompte.COURANT));

			compteRepository.findAll().forEach(cp->{
				System.out.println(cp.getType());
				System.out.println(cp.getSolde());

			});


		};


	}

}
