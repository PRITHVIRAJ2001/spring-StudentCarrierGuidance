package com.prithvy.demo.repository;

import com.prithvy.demo.model.ArtsReviewModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Component
public interface ArtsReviewRepository extends CrudRepository<ArtsReviewModel, Long> {

    List<ArtsReviewModel> findAll();

    List<ArtsReviewModel> findAllByCollegeId(Long id);
}
