package com.prithvy.demo.service;

import com.prithvy.demo.model.AgriReviewModel;
import com.prithvy.demo.repository.AgriReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class AgriReviewService {


    @Autowired
    AgriReviewRepository repo;

    public AgriReviewService(AgriReviewRepository repo) {
        super();
        this.repo = repo;
    }

    public void saveMyReview(AgriReviewModel agriReviewModel) {
        repo.save(agriReviewModel);
    }


    public List<AgriReviewModel> findAll() {
        return repo.findAll();
    }

    public List<AgriReviewModel> findAllByCollegeId(Long id) {
        return repo.findAllByCollegeId(id);
    }
}
