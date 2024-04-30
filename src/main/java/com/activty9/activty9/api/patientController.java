package com.activty9.activty9.api;

import com.activty9.activty9.models.patient;
import com.activty9.activty9.services.patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class patientController {

    @Autowired
    patientService patService;

    @GetMapping("/getall")
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

    @PostMapping("/add")
    public void createPatient(@RequestBody patient pat) {
        patService.createPatient(pat);
    }

    @PutMapping("/modfier/{matricule}")
    public void updatePatient(@RequestBody patient pat) {
        patService.updatePatient(pat);
    }

    @DeleteMapping("/supprimer/{matricule}")
    public void deletePatient(@PathVariable int matricule) {
        patService.deletePatient(matricule);
    }
}
