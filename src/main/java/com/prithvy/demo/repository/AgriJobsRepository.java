package com.prithvy.demo.repository;

import com.prithvy.demo.model.AgriJobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface AgriJobsRepository extends MongoRepository<AgriJobs, Long> {

    List<AgriJobs> findAll();

    List<AgriJobs> findAllByCourseId(Long id);
}
