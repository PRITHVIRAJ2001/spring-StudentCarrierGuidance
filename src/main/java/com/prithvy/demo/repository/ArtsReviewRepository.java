package com.prithvy.demo.repository;

import com.prithvy.demo.model.ArtsReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Component
public interface ArtsReviewRepository extends MongoRepository<ArtsReviewModel, Long> {

    List<ArtsReviewModel> findAll();

    List<ArtsReviewModel> findAllByCollegeId(Long id);
}
