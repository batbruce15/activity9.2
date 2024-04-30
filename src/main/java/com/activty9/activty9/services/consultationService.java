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
    public List<consultation> getAll(){
        return cMapper.getAll();
    }
    public consultation getConsultationById(int id) {
        return cMapper.getById(id);
    }
}
