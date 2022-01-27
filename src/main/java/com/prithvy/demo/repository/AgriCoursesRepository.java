package com.prithvy.demo.repository;

import com.prithvy.demo.model.AgriCourses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface AgriCoursesRepository extends CrudRepository<AgriCourses, Long> {

    List<AgriCourses> findAll();

    AgriCourses findByCourse(String course);
}
