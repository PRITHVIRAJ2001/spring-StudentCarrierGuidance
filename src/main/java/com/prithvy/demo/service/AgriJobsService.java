package com.prithvy.demo.service;

import com.prithvy.demo.model.AgriJobs;
import com.prithvy.demo.repository.AgriJobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Component
public class AgriJobsService {

    @Autowired
    AgriJobsRepository repo;

    public AgriJobsService(AgriJobsRepository repo) {
        super();
        this.repo = repo;
    }

    public AgriJobsService() {
    }


    public List<AgriJobs> findAll() {
        return repo.findAll();
    }

    public List<AgriJobs> findAllByCourseId(Long id) {
        return repo.findAllByCourseId(id);
    }

}
