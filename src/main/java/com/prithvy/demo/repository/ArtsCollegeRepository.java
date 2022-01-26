package com.prithvy.demo.repository;

import com.prithvy.demo.model.ArtsCollege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface ArtsCollegeRepository extends MongoRepository<ArtsCollege, Long> {
    List<ArtsCollege> findAllByDistrict(String district);

    List<ArtsCollege> findAll();

    ArtsCollege findByCollegename(String collegename);
}
