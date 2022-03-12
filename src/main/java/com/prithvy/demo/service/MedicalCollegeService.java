package com.prithvy.demo.service;

import com.prithvy.demo.model.MedicalCollege;
import com.prithvy.demo.repository.MedicalCollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class MedicalCollegeService {

    @Autowired
    MedicalCollegeRepository repo;

    public MedicalCollegeService(MedicalCollegeRepository repo) {
        super();
        this.repo = repo;
    }

    public List<MedicalCollege> findAllByDistrict(String District) {
        List<MedicalCollege> med = repo.findAllByDistrict(District);
        return med;
    }

    public List<MedicalCollege> findAll() {
        List<MedicalCollege> med = repo.findAll();
        return med;
    }

    public MedicalCollege findByCollegename(String collegename) {
        return repo.findByCollegename(collegename);
    }
}

