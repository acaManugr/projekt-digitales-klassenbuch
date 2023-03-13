package com.example.digitalesklassenbuch;

import com.example.digitalesklassenbuch.entity.Eintrag;
import com.example.digitalesklassenbuch.repository.EintragRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DigitalesKlassenbuchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DigitalesKlassenbuchApplication.class, args);
	}

	@Autowired
	private EintragRepository eintragRepository;

	@Override
	public void run(String... args) throws Exception {

		/*
		 Eintrag eintrag1 = new Eintrag("Manuel", "Gruber", "bla@gmail.com");
		 eintragRepository.save(eintrag1);

		 Eintrag eintrag2 = new Eintrag("Denis", "Reichert", "nochmehrbla@gmail.com");
		 eintragRepository.save(eintrag2);
		 */
	}
}