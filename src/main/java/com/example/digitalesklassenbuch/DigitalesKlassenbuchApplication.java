package com.example.digitalesklassenbuch;

import com.example.digitalesklassenbuch.entity.Eintrag;
import com.example.digitalesklassenbuch.entity.Wochentag;
import com.example.digitalesklassenbuch.repository.EintragRepository;
import com.example.digitalesklassenbuch.repository.WochentagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;

@SpringBootApplication
public class DigitalesKlassenbuchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DigitalesKlassenbuchApplication.class, args);
	}

	@Autowired
	private EintragRepository eintragRepository;

	@Autowired
	WochentagRepository wochentagRepository;

	@Override
	public void run(String... args) throws Exception {

		/*
		 Eintrag eintrag1 = new Eintrag("Manuel", "Gruber", "bla@gmail.com");
		 eintragRepository.save(eintrag1);

		 Eintrag eintrag2 = new Eintrag("Denis", "Reichert", "nochmehrbla@gmail.com");
		 eintragRepository.save(eintrag2);
		 */


		/*
		//Beispielobjekt erstellen, testen ob Bild in Datenbank eingefügt wird
		Blob blob = new SerialBlob();

		Wochentag wochentag1 = new Wochentag("keine", "keine", "keine", "keine", "keine", "2002-02-02", )

		 */
	}
}