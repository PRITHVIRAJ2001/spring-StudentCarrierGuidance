package com.prithvy.demo.service;

import com.prithvy.demo.model.AgriCollege;
import com.prithvy.demo.repository.AgriCollegeRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Component
@NoArgsConstructor
public class AgriCollegeService {

    @Autowired
    AgriCollegeRepository repo;

    public AgriCollegeService(AgriCollegeRepository repo) {
        super();
        this.repo = repo;
    }

    public List<AgriCollege> findAllByDistrict(String District) {
        List<AgriCollege> agri = repo.findAllByDistrict(District);
        return agri;
    }

    public List<AgriCollege> findAll() {
        List<AgriCollege> agri = repo.findAll();
        return agri;
    }

    public AgriCollege findByCollegename(String collegename) {
        return repo.findByCollegename(collegename);
    }
}
