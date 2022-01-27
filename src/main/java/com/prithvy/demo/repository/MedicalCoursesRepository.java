package com.prithvy.demo.repository;

import com.prithvy.demo.model.MedicalCourses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Component
public interface MedicalCoursesRepository extends CrudRepository<MedicalCourses, Long> {

    List<MedicalCourses> findAll();

    MedicalCourses findByCourse(String course);
}
