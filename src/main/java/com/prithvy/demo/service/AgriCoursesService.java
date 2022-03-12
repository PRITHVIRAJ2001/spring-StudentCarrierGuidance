package com.prithvy.demo.service;

import com.prithvy.demo.model.AgriCourses;
import com.prithvy.demo.repository.AgriCoursesRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
@NoArgsConstructor
public class AgriCoursesService {

    @Autowired
    AgriCoursesRepository repo;

    public AgriCoursesService(AgriCoursesRepository repo) {
        super();
        this.repo = repo;
    }


    public List<AgriCourses> findAll() {
        return repo.findAll();
    }

    public AgriCourses findByCourse(String course) {
        return repo.findByCourse(course);
    }
}
