package com.activty9.activty9.services;

import com.activty9.activty9.mappers.patientMapper;
import com.activty9.activty9.models.patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class patientService {
    @Autowired
    patientMapper pMapper;
    public List<patient> getAllPatient(){ return pMapper.getAll(); }
    public List<patient> getPatientByName(String nom_utilisateur) { return pMapper.getByName(nom_utilisateur); }

    public patient getPatientById(int matricule) { return pMapper.getById(matricule); }

    public void updatePatient(patient pat) { pMapper.update(pat); }

    public void deletePatient(int matricule) { pMapper.delete(matricule); }

    public void createPatient(patient pat) {
        if (pat.getDate_naissance() == null || !isAgeValid(pat.getDate_naissance())) {
            throw new IllegalArgumentException("L'âge du patient doit être supérieur à 18 ans.");
        }
        pMapper.insert(pat);
    }
    private boolean isAgeValid(Date dateOfBirth) {
        // Calcul de l'âge en années
        Calendar dob = Calendar.getInstance();
        dob.setTime(dateOfBirth);
        Calendar now = Calendar.getInstance();
        int age = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (now.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age >= 18;
    }
}
