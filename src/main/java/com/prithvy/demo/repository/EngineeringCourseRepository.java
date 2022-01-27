package com.prithvy.demo.repository;

import com.prithvy.demo.model.EngineeringCourses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Component
public interface EngineeringCourseRepository extends CrudRepository<EngineeringCourses, Long> {

    List<EngineeringCourses> findAll();

    Long findIdByCourse(String course);

    EngineeringCourses findByCourse(String course);
}
