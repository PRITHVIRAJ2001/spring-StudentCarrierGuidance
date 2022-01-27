package com.prithvy.demo.repository;

import com.prithvy.demo.model.MedicalCollege;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface MedicalCollegeRepository extends CrudRepository<MedicalCollege, Long> {
    List<MedicalCollege> findAllByDistrict(String District);

    List<MedicalCollege> findAll();

    MedicalCollege findByCollegename(String collegename);
}
