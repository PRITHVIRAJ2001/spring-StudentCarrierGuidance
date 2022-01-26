package com.prithvy.demo.model;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Document
@Data
@Entity
@Component
public class AgriJobs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long courseId;

    private String job;

    public AgriJobs(Long courseId, String job) {
        super();
        this.courseId = courseId;
        this.job = job;
    }

    public AgriJobs() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "AgriJobs [id=" + id + ", course_id=" + courseId + ", job=" + job + "]";
    }


}

