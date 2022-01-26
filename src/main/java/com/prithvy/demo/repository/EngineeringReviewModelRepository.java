package com.prithvy.demo.repository;

import com.prithvy.demo.model.EngineeringReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface EngineeringReviewModelRepository extends MongoRepository<EngineeringReviewModel, Integer> {

    List<EngineeringReviewModel> findAllByCollegeId(Long id);

    List<EngineeringReviewModel> findAll();

}
