package com.prithvy.demo.repository;

import com.prithvy.demo.model.AgriCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface AgriCoursesRepository extends MongoRepository<AgriCourses, Long> {

    List<AgriCourses> findAll();

    AgriCourses findByCourse(String course);
}
