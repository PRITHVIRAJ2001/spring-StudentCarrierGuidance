package com.prithvy.demo.repository;

import com.prithvy.demo.model.AgriCollege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Component
public interface AgriCollegeRepository extends MongoRepository<AgriCollege, Long> {

    List<AgriCollege> findAllByDistrict(String district);

    List<AgriCollege> findAll();

    AgriCollege findByCollegename(String collegename);
}
