package com.prithvy.demo.service;

import com.prithvy.demo.model.EngineeringCollege;
import com.prithvy.demo.repository.EngineeringCollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class EngineeringCollegeService {

    @Autowired
    EngineeringCollegeRepository repo;

    public EngineeringCollegeService(EngineeringCollegeRepository repo) {
        super();
        this.repo = repo;
    }

    public List<EngineeringCollege> findAllByDistrict(String District) {
        List<EngineeringCollege> eng = repo.findAllByDistrict(District);
        return eng;
    }

    public List<EngineeringCollege> findAll() {
        List<EngineeringCollege> eng = repo.findAll();
        return eng;
    }

    public EngineeringCollege findByCollegename(String collegename) {
        return repo.findByCollegename(collegename);

    }

}
	

