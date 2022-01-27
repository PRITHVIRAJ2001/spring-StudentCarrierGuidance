package com.prithvy.demo.repository;

import com.prithvy.demo.model.CollegeTypes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface CollegeTypesRepository extends CrudRepository<CollegeTypes, Long> {
    List<CollegeTypes> findAll();
}
