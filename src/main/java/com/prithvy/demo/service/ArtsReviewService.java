package com.prithvy.demo.service;

import com.prithvy.demo.model.ArtsReviewModel;
import com.prithvy.demo.repository.ArtsReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ArtsReviewService {

    @Autowired
    ArtsReviewRepository repo;

    public ArtsReviewService(ArtsReviewRepository repo) {
        super();
        this.repo = repo;
    }

    public void saveMyReview(ArtsReviewModel artsReviewModel) {
        repo.save(artsReviewModel);
    }

    public List<ArtsReviewModel> findAll() {
        return repo.findAll();

    }

    public List<ArtsReviewModel> findAllByCollegeId(Long id) {
        return repo.findAllByCollegeId(id);
    }
}
