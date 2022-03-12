package com.prithvy.demo.service;

import com.prithvy.demo.model.ArtsCollege;
import com.prithvy.demo.repository.ArtsCollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ArtsCollegeService {
    @Autowired
    ArtsCollegeRepository repo;

    public ArtsCollegeService(ArtsCollegeRepository repo) {
        super();
        this.repo = repo;
    }

    public List<ArtsCollege> findAllByDistrict(String district) {
        List<ArtsCollege> arts = repo.findAllByDistrict(district);
        return arts;
    }

    public List<ArtsCollege> findAll() {
        return (List<ArtsCollege>) repo.findAll();
    }

    public ArtsCollege findByCollegename(String collegename) {
        return repo.findByCollegename(collegename);
    }


}


