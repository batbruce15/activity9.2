package com.activty9.activty9.services;

import com.activty9.activty9.mappers.traitementMapper;
import com.activty9.activty9.models.patient;
import com.activty9.activty9.models.traitement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class traitementService {
    @Autowired
    traitementMapper tMapper;

    public List<traitement> getAllTraitement(){

        return tMapper.getAll();
    }

    public List<traitement> getTaitementByName(String nom_utilisateur) {
        return tMapper.getByName(nom_utilisateur);
    }

    public traitement getTraitementById(int matricule) {
        return tMapper.getById(matricule);
    }

    public void createTraitement( traitement trait) {

        tMapper.insert(trait);
    }

    public void updateTraitement(traitement trait) {
        tMapper.update(trait);
    }

    public void deleteTraitement(int matricule) {

        tMapper.delete(matricule);
    }
}
