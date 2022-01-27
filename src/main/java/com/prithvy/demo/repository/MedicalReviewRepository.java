package com.prithvy.demo.repository;

import com.prithvy.demo.model.MedicalReviewModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Component
public interface MedicalReviewRepository extends CrudRepository<MedicalReviewModel, Long> {

    List<MedicalReviewModel> findAll();

    List<MedicalReviewModel> findAllByCollegeId(Long id);
}
