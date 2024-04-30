package com.activty9.activty9;

import com.activty9.activty9.mappers.*;
import com.activty9.activty9.models.consultation;
import com.activty9.activty9.models.patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class Activty9Application {
//	@Autowired
//	private patientMapper pMapper;

//	@Autowired
//	private consultationMapper cMapper;
	public static void main(String[] args) {
		SpringApplication.run(Activty9Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO : récupérer la liste de tous les patients puis afficher leurs noms done
//		List<patient> patients = pMapper.getAll();
//		System.out.println("Liste de tous les patients :");
//		for (patient p : patients) {
//			System.out.println(p);
//		}
//
//		// TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms
//		String nomRecherche = "Yahi";
//		List<patient> patientsYahi = pMapper.getByName(nomRecherche);
//		System.out.println("Patients ayant le nom \"" + nomRecherche + "\" :");
//		for (patient p : patientsYahi) {
//			System.out.println("Nom: " + p + ", Prénom: " + p.getPrenom());
//		}
//
//		// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le
//		patient nouveauPatient = new patient();
//		nouveauPatient.setId(62);
//		nouveauPatient.setNom("Karim");
//		nouveauPatient.setPrenom("Bat");
//		nouveauPatient.setSexe("m");
//		nouveauPatient.setAdresse("Alger");
//		Date dateNaissance = new Date(94, 0, 5);
//		nouveauPatient.setDate_naissance(dateNaissance );
//		nouveauPatient.setNumero_telephone("066666666666");
//		// Set other attributes as needed
//		pMapper.insert(nouveauPatient);
//		System.out.println("Nouveau patient ajouté.");
//
//		// TODO : rechercher la consultation ayant id=3
//		int idConsultationRecherche = 3;
//		consultation c = cMapper.getById(idConsultationRecherche);
//		System.out.println("Consultation avec ID=" + idConsultationRecherche + " :");
//		System.out.println(c);
//	}
}
