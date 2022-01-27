package com.prithvy.demo.repository;

import com.prithvy.demo.model.ArtsCollege;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface ArtsCollegeRepository extends CrudRepository<ArtsCollege, Long> {
    List<ArtsCollege> findAllByDistrict(String district);

    ArtsCollege findByCollegename(String collegename);
}
