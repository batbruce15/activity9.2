package com.activty9.activty9.api;

import com.activty9.activty9.models.consultation;
import com.activty9.activty9.services.consultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/consultation")
public class consultationController {
    @Autowired
    consultationService consultService;

    @GetMapping("/getall")
    public List<consultation> getAllConsultation(){
        return consultService.getAllConsultations();
    }

    @GetMapping("/{matricule}")
    public consultation getConsultationById(@PathVariable int matricule) {
        return consultService.getConsultationById(matricule);
    }

    @GetMapping("/nom/{nom_utilisateur}")
    public List<consultation> getConsultationByName(@PathVariable String nom_utilisateur) {
        return consultService.getConsultationByName(nom_utilisateur);
    }

    @PostMapping("/add")
    public void createConsultation(@RequestBody consultation consult) {
        consultService.createConsultation(consult);
    }

    @PutMapping("/{matricule}")
    public void updatePatient(@RequestBody consultation consult) {
        consultService.updateConsultation(consult);
    }

    @DeleteMapping("/{matricule}")
    public void deleteConsultation(@PathVariable int matricule) {
        consultService.deleteConsultation(matricule);
    }
}
