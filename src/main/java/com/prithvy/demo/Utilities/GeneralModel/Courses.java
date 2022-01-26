package com.prithvy.demo.Utilities.GeneralModel;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Id;

@Data
@Component
public class Courses {
    @Id
    private Long id;

    private Long CollegeTypeId;

    private String course;

    public Courses() {
    }

    public Courses(Long collegeTypeId, String course) {
        CollegeTypeId = collegeTypeId;
        this.course = course;
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
        return "Courses{" +
                "id=" + id +
                ", CollegeTypeId=" + CollegeTypeId +
                ", course='" + course + '\'' +
                '}';
    }
}
