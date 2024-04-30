package com.activty9.activty9.view;

import com.activty9.activty9.models.traitement;
import com.activty9.activty9.services.traitementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/traitement")
public class traitementController {
    @Autowired
    traitementService traitService;

    @GetMapping("/getall")
    public List<traitement> getAllTraitements(){
        return traitService.getAllTraitement();
    }

    @GetMapping("/{matricule}")
    public traitement getTraitementById(@PathVariable int matricule) {
        return traitService.getTraitementById(matricule);
    }

    @GetMapping("/nom/{nom_utilisateur}")
    public List<traitement> getTraitementByName(@PathVariable String nom_utilisateur) {
        return traitService.getTaitementByName(nom_utilisateur);
    }

    @PostMapping("/add")
    public void createTraitement(@RequestBody traitement trait) {
        traitService.createTraitement(trait);
    }

    @PutMapping("/{matricule}")
    public void updateTraitement(@RequestBody traitement trait) {
        traitService.updateTraitement(trait);
    }

    @DeleteMapping("/{matricule}")
    public void deleteTraitement(@PathVariable int matricule) {
        traitService.deleteTraitement(matricule);
    }
}
