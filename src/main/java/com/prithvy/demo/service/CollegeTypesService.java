package com.prithvy.demo.service;

import com.prithvy.demo.model.CollegeTypes;
import com.prithvy.demo.repository.CollegeTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Component
public class CollegeTypesService {

    @Autowired
    CollegeTypesRepository repo;


    public CollegeTypesService(CollegeTypesRepository repo) {
        super();
        this.repo = repo;
    }

    public Iterable<CollegeTypes> findAll() {
        List<CollegeTypes> types = repo.findAll();
        return types;
    }

}
