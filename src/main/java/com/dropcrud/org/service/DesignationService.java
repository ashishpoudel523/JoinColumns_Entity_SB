package com.dropcrud.org.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.dropcrud.org.entity.Designation;
import com.dropcrud.org.repo.DesignationRepository;

@Service
public class DesignationService {

    private final DesignationRepository designationRepository;

    public DesignationService(DesignationRepository designationRepository) {
        this.designationRepository = designationRepository;
    }

    public List<Designation> findAllDesignations() {
        return designationRepository.findAll();
    }

    public Optional<Designation> findDesignationsById(Long id) {
        return designationRepository.findById(id);
    }

    public Designation saveDesignation(Designation designation) {
        return designationRepository.save(designation);
    }

    public void deleteDesignationById(Long id) {
    	designationRepository.deleteById(id);
    }
}

