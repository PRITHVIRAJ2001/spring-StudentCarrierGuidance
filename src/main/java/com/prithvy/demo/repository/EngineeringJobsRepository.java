package com.prithvy.demo.repository;

import com.prithvy.demo.model.EngineeringJobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Component
public interface EngineeringJobsRepository extends MongoRepository<EngineeringJobs, Long> {

    List<EngineeringJobs> findAll();

    List<EngineeringJobs> findAllByCourseId(Long id);
}
