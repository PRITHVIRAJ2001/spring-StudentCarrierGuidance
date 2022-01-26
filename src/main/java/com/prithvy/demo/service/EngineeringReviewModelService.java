package com.prithvy.demo.service;

import com.prithvy.demo.model.EngineeringReviewModel;
import com.prithvy.demo.repository.EngineeringReviewModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Component
public class EngineeringReviewModelService {


    @Autowired
    EngineeringReviewModelRepository repo;

    public EngineeringReviewModelService(EngineeringReviewModelRepository repo) {
        super();
        this.repo = repo;
    }

    public void saveMyReview(EngineeringReviewModel engineeringReviewModel) {
        repo.save(engineeringReviewModel);
    }

    public List<EngineeringReviewModel> findAll() {
        List<EngineeringReviewModel> types = repo.findAll();
        return types;
    }

    public List<EngineeringReviewModel> findAllByCollegeId(Long id) {
        List<EngineeringReviewModel> reviews = repo.findAllByCollegeId(id);
        return reviews;
    }


}
