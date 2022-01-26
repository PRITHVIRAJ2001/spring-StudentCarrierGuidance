package com.prithvy.demo.repository;

import com.prithvy.demo.model.EngineeringCollege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface EngineeringCollegeRepository extends MongoRepository<EngineeringCollege, Long> {
    List<EngineeringCollege> findAllByDistrict(String District);

    List<EngineeringCollege> findAll();

    EngineeringCollege findByCollegename(String collegename);

}
