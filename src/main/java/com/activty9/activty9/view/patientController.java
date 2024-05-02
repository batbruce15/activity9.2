package com.activty9.activty9.view;

import com.activty9.activty9.models.patient;
import com.activty9.activty9.services.consultationService;
import com.activty9.activty9.services.patientService;
import com.activty9.activty9.services.traitementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class patientController {
    @Autowired
    patientService patService;

    @GetMapping("/getallp")
    public List<patient> getAllPatients(){
        return patService.getAllPatient();
    }

    @GetMapping("/{matricule}")
    public patient getAgentById(@PathVariable int matricule) {
        return patService.getPatientById(matricule);
    }

    @GetMapping("/nom/{nom_utilisateur}")
    public List<patient> getAgentByName(@PathVariable String nom_utilisateur) {
        return patService.getPatientByName(nom_utilisateur);
    }

//    @PostMapping("/add")
//    public void createPatient(@RequestBody patient pat) {
//        patService.createPatient(pat);
//    }
    @PostMapping("/add")
    public ResponseEntity<String> createPatient(@RequestBody patient patient) {
        try {
            patService.createPatient(patient);
            return ResponseEntity.status(HttpStatus.CREATED).body("Patient créé avec succès.");
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @PutMapping("/{matricule}")
    public void updatePatient(@RequestBody patient pat) {
        patService.updatePatient(pat);
    }

    @DeleteMapping("/{matricule}")
    public void deletePatient(@PathVariable int matricule) {
        patService.deletePatient(matricule);
    }
}
