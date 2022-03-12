package com.prithvy.demo.service;

import com.prithvy.demo.model.EngineeringCourses;
import com.prithvy.demo.repository.EngineeringCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class EngineeringCourseService {

    @Autowired
    EngineeringCourseRepository repo;

    public EngineeringCourseService(EngineeringCourseRepository repo) {
        super();
        this.repo = repo;
    }

    public List<EngineeringCourses> findAll() {
        return repo.findAll();
    }

    public Long findIdByCourse(String course) {
        return repo.findIdByCourse(course);
    }

    public EngineeringCourses findByCourse(String course) {
        return repo.findByCourse(course);
    }
}
