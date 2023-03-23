package com.example.digitalesklassenbuch;

import com.example.digitalesklassenbuch.entity.Dozent;
import com.example.digitalesklassenbuch.entity.Eintrag;
import com.example.digitalesklassenbuch.entity.Fächer;
import com.example.digitalesklassenbuch.entity.Wochentag;
import com.example.digitalesklassenbuch.repository.DozentRepository;
import com.example.digitalesklassenbuch.repository.EintragRepository;
import com.example.digitalesklassenbuch.repository.FächerRepository;
import com.example.digitalesklassenbuch.repository.WochentagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.time.LocalDate;

@SpringBootApplication
public class DigitalesKlassenbuchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DigitalesKlassenbuchApplication.class, args);
	}

	@Autowired
	private EintragRepository eintragRepository;

	@Autowired
	private WochentagRepository wochentagRepository;

	@Autowired
	private FächerRepository fächerRepository;

	@Autowired
	DozentRepository dozentRepository;

	@Override
	public void run(String... args) throws Exception {

		//Beispielobjekt erstellen, testen ob Bild in Datenbank eingefügt wird
		//Blob blob = new SerialBlob();

		//Einmaliges einfügen von Daten in die Datenbanken
		/*
		 Eintrag eintrag1 = new Eintrag("Manuel", "Gruber", "bla@gmail.com");
		 eintragRepository.save(eintrag1);

		 Eintrag eintrag2 = new Eintrag("Denis", "Reichert", "nochmehrbla@gmail.com");
		 eintragRepository.save(eintrag2);

		Wochentag wochentag1 = new Wochentag("keine", "keine", "keine", "keine",
				"keine", "keine", LocalDate.now());
		wochentagRepository.save(wochentag1);
		Fächer fächer = new Fächer("Projektmanagement");
		fächerRepository.save(fächer);
		Fächer fächer2 = new Fächer("Anwendungsentwicklung");
		fächerRepository.save(fächer2);
		Fächer fächer3 = new Fächer("BWL");
		fächerRepository.save(fächer3);



		Dozent dozent = new Dozent("Bernhard", "Lang", "bernhard.lang@mischok.academy");
		dozentRepository.save(dozent);
		Dozent dozent1 = new Dozent("Matthias", "Hartmann", "matthias.hartmann@dozent.mischok.academy");
		dozentRepository.save(dozent1);
		Dozent dozent2= new Dozent("Sebastian", "Vater", "sebastian.vater@dozent.mischok.academy");
		dozentRepository.save(dozent2);
		Dozent dozent3 = new Dozent("Marina", "Lang", "marina.lang@dozent.mischok.academy");
		dozentRepository.save(dozent3);
		Dozent dozent4 = new Dozent("Kajetan", "Mischok", "kajetan.mischok@dozent.mischok.academy");
		dozentRepository.save(dozent4);


		Dozent dozent5 = new Dozent("Tobias", "Kurz", "tobias.kurtz@dozent.mischok.academy");
		dozentRepository.save(dozent5);
		Dozent dozent6 = new Dozent("Shkelzen", "Veliqi", "shkelzen.veliqi@dozent.mischok.academy");
		dozentRepository.save(dozent6);
		Dozent dozent7 = new Dozent("Jonas", "Franz", "jonas.franz@dozent.mischok.academy");
		dozentRepository.save(dozent7);
		Dozent dozent8 = new Dozent("Julius", "Mischok", "julius.mischok@dozent.mischok.academy");
		dozentRepository.save(dozent8);

/*
		 */



	}
}