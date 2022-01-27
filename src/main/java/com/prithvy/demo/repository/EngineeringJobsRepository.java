package com.prithvy.demo.repository;

import com.prithvy.demo.model.EngineeringJobs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Component
public interface EngineeringJobsRepository extends CrudRepository<EngineeringJobs, Long> {

    List<EngineeringJobs> findAll();

    List<EngineeringJobs> findAllByCourseId(Long id);
}
