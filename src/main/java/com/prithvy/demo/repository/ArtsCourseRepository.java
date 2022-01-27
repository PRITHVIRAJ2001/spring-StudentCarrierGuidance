package com.prithvy.demo.repository;

import com.prithvy.demo.model.ArtsCourses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Component
public interface ArtsCourseRepository extends CrudRepository<ArtsCourses, Long> {

    List<ArtsCourses> findAll();

    ArtsCourses findByCourse(String course);
}
