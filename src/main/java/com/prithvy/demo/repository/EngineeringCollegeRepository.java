package com.prithvy.demo.repository;

import com.prithvy.demo.model.EngineeringCollege;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface EngineeringCollegeRepository extends CrudRepository<EngineeringCollege, Long> {
    List<EngineeringCollege> findAllByDistrict(String District);

    List<EngineeringCollege> findAll();

    EngineeringCollege findByCollegename(String collegename);

}
