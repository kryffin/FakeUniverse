package fr.univlorraine.FakeUniverse;

import fr.univlorraine.FakeUniverse.dao.BodyRepository;
import fr.univlorraine.FakeUniverse.model.CelestialBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FakeUniverseApplication {

	private static final Logger log = LoggerFactory.getLogger(FakeUniverseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FakeUniverseApplication.class, args);
	}

	public CommandLineRunner demo(BodyRepository repository) {
		return (args) -> {
			log.info("Affichage de tous les corps (findAll) :");
			for (CelestialBody body : repository.findAll()) {
				System.out.println(body.toString());
				log.info(body.toString());
			}

			log.info("Affichage d'un seul corps (findById(Schtroumpf)) :");
			CelestialBody body = repository.findByName("Schtroumpf");
			log.info(body.toString());

			log.info("Affichage des corps par rapport au rayon (findByRadius(10.)) :");
			repository.findByRadius(10.).forEach(b -> {
				log.info(b.toString());
			});
		};
	}

}
