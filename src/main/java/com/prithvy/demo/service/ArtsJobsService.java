package com.prithvy.demo.service;

import com.prithvy.demo.model.ArtsJobs;
import com.prithvy.demo.repository.ArtsJobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Component
public class ArtsJobsService {


    @Autowired
    ArtsJobsRepository repo;

    public ArtsJobsService(ArtsJobsRepository repo) {
        super();
        this.repo = repo;
    }


    public List<ArtsJobs> findAll() {
        return repo.findAll();
    }

    public List<ArtsJobs> findAllByCourseId(Long id) {
        return repo.findAllByCourseId(id);
    }
}
