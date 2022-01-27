package com.prithvy.demo.repository;

import com.prithvy.demo.model.EngineeringReviewModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface EngineeringReviewModelRepository extends CrudRepository<EngineeringReviewModel, Integer> {

    List<EngineeringReviewModel> findAllByCollegeId(Long id);

    List<EngineeringReviewModel> findAll();

}
