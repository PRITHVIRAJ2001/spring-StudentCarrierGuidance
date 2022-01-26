package com.prithvy.demo.service;

import com.prithvy.demo.model.MedicalJobs;
import com.prithvy.demo.repository.MedicalJobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Component
public class MedicalJobsService {


   @Autowired
   MedicalJobsRepository repo;

    public MedicalJobsService(MedicalJobsRepository repo) {
        super();
        this.repo = repo;
    }


    public List<MedicalJobs> findAll() {
        return repo.findAll();
    }

    public List<MedicalJobs> findAllByCourseId(Long id) {
        return repo.findAllByCourseId(id);
    }
}
