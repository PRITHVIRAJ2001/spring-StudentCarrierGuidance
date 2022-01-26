package com.prithvy.demo.repository;

import com.prithvy.demo.model.MedicalReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Component
public interface MedicalReviewRepository extends MongoRepository<MedicalReviewModel, Long> {

    List<MedicalReviewModel> findAll();

    List<MedicalReviewModel> findAllByCollegeId(Long id);
}
