package com.prithvy.demo.service;

import com.prithvy.demo.model.EngineeringJobs;
import com.prithvy.demo.repository.EngineeringJobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Component
public class EngineeringJobsService {

   @Autowired
   EngineeringJobsRepository repo;

    public EngineeringJobsService(EngineeringJobsRepository repo) {
        super();
        this.repo = repo;
    }

    public List<EngineeringJobs> findAll() {
        return repo.findAll();
    }

    public List<EngineeringJobs> findAllByCourseId(Long id) {
        return repo.findAllByCourseId(id);
    }
}
