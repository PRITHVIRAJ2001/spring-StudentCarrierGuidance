package com.prithvy.demo.repository;

import com.prithvy.demo.model.MedicalJobs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface MedicalJobsRepository extends CrudRepository<MedicalJobs, Long> {

    List<MedicalJobs> findAll();

    List<MedicalJobs> findAllByCourseId(Long id);
}
