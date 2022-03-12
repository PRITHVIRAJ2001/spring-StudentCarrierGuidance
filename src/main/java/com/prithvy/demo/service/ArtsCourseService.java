package com.prithvy.demo.service;

import com.prithvy.demo.model.ArtsCourses;
import com.prithvy.demo.repository.ArtsCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ArtsCourseService {

    @Autowired
    ArtsCourseRepository repo;

    public ArtsCourseService(ArtsCourseRepository repo) {
        super();
        this.repo = repo;
    }


    public List<ArtsCourses> findAll() {
        return repo.findAll();
    }

    public ArtsCourses findByCourse(String course) {
        return repo.findByCourse(course);
    }
}
