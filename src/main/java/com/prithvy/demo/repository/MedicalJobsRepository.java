package com.prithvy.demo.repository;

import com.prithvy.demo.model.MedicalJobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface MedicalJobsRepository extends MongoRepository<MedicalJobs, Long> {

    List<MedicalJobs> findAll();

    List<MedicalJobs> findAllByCourseId(Long id);
}
