package com.prithvy.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Component
public class AgriCourses {


    @Id
    private Long id;

    private Long CollegeTypeId;

    private String course;

    public AgriCourses(Long collegeTypeId, String course) {
        super();
        CollegeTypeId = collegeTypeId;
        this.course = course;
    }

    public AgriCourses() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCollegeTypeId() {
        return CollegeTypeId;
    }

    public void setCollegeTypeId(Long collegeTypeId) {
        CollegeTypeId = collegeTypeId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "AgriCourses [id=" + id + ", CollegeTypeId=" + CollegeTypeId + ", course=" + course + "]";
    }


}

