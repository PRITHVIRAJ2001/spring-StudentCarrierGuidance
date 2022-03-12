package com.prithvy.demo.service;

import com.prithvy.demo.model.MedicalCourses;
import com.prithvy.demo.repository.MedicalCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class MedicalCoursesService {

    @Autowired
    MedicalCoursesRepository repo;

    public MedicalCoursesService(MedicalCoursesRepository repo) {
        super();
        this.repo = repo;
    }

    public List<MedicalCourses> findAll() {
        return repo.findAll();
    }

    public MedicalCourses findByCourse(String course) {
        return repo.findByCourse(course);
    }
}

