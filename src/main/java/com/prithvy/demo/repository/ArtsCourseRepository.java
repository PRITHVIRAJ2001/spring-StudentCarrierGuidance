package com.prithvy.demo.repository;

import com.prithvy.demo.model.ArtsCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Component
public interface ArtsCourseRepository extends MongoRepository<ArtsCourses, Long> {

    List<ArtsCourses> findAll();

    ArtsCourses findByCourse(String course);
}
