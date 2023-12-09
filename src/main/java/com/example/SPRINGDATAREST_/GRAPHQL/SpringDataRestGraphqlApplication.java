package com.example.SPRINGDATAREST_.GRAPHQL;

import com.example.SPRINGDATAREST_.GRAPHQL.Repositories.CentreRepository;
import com.example.SPRINGDATAREST_.GRAPHQL.Repositories.EtudiantRepository;
import com.example.SPRINGDATAREST_.GRAPHQL.entities.Centre;
import com.example.SPRINGDATAREST_.GRAPHQL.entities.Etudiant;
import com.example.SPRINGDATAREST_.GRAPHQL.enums.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestGraphqlApplication implements CommandLineRunner {

	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	CentreRepository centreRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestGraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Centre centre1 = Centre.builder()
				.nom("Maarif").adresse("Biranzarane").build();
		centreRepository.save(centre1);
		Centre centre2 = Centre.builder()
				.nom("Oranges").adresse("Oulfa").build();
		centreRepository.save(centre2);
		Etudiant et1 = Etudiant.builder()
				.nom("Adnani").prenom("Brahim").genre(Genre.Homme)
				.centre(centre1).build();
		etudiantRepository.save(et1);

	}

}
