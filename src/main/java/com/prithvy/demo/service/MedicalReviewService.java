package com.prithvy.demo.service;

import com.prithvy.demo.model.MedicalReviewModel;
import com.prithvy.demo.repository.MedicalReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class MedicalReviewService {


    @Autowired
    MedicalReviewRepository repo;

    public MedicalReviewService(MedicalReviewRepository repo) {
        super();
        this.repo = repo;
    }

    public void saveMyReview(MedicalReviewModel medicalReviewModel) {
        repo.save(medicalReviewModel);
    }

    public List<MedicalReviewModel> findAll() {
        List<MedicalReviewModel> med = repo.findAll();
        return med;
    }

    public List<MedicalReviewModel> findAllByCollegeId(Long id) {
        return repo.findAllByCollegeId(id);
    }
}
