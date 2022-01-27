package com.prithvy.demo.repository;

import com.prithvy.demo.model.ArtsJobs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface ArtsJobsRepository extends CrudRepository<ArtsJobs, Long> {
    List<ArtsJobs> findAll();

    List<ArtsJobs> findAllByCourseId(Long id);
}
