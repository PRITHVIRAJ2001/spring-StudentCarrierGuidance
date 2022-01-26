package com.prithvy.demo.repository;

import com.prithvy.demo.model.MedicalCollege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface MedicalCollegeRepository extends MongoRepository<MedicalCollege, Long> {
    List<MedicalCollege> findAllByDistrict(String District);

    List<MedicalCollege> findAll();

    MedicalCollege findByCollegename(String collegename);
}
