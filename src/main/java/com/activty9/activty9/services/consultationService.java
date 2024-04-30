package com.activty9.activty9.services;

import com.activty9.activty9.mappers.consultationMapper;
import com.activty9.activty9.models.consultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class consultationService {
    @Autowired
    consultationMapper cMapper;
    public List<consultation> getAllConsultations(){

        return cMapper.getAll();
    }

    public consultation getConsultationById(int id) {

        return cMapper.getById(id);
    }

    public List<consultation> getConsultationByName(String nom_utilisateur) {
        return cMapper.getByName(nom_utilisateur);
    }


    public void createConsultation(consultation consult) {

        cMapper.insert(consult);
    }

    public void updateConsultation(consultation consult) {

        cMapper.update(consult);
    }

    public void deleteConsultation(int matricule) {

        cMapper.delete(matricule);
    }
}
