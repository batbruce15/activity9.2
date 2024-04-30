package com.activty9.activty9.services;

import com.activty9.activty9.mappers.traitementMapper;
import com.activty9.activty9.models.traitement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class traitementService {
    @Autowired
    traitementMapper tMapper;
    public List<traitement> getAll(){
        return tMapper.getAll();
    }
}
