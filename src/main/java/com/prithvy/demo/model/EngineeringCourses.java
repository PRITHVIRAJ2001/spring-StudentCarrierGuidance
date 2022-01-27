package com.prithvy.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Component
public class EngineeringCourses {

    @Id
    private Long id;

    private Long CollegeTypeId;

    private String course;

    public EngineeringCourses(Long collegeTypeId, String course) {
        super();
        CollegeTypeId = collegeTypeId;
        this.course = course;
    }

    public EngineeringCourses() {
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
        return "Engineering_Courses [id=" + id + ", CollegeTypeId=" + CollegeTypeId + ", course=" + course
                + ", getId()=" + getId() + ", getCollegeTypeId()=" + getCollegeTypeId() + ", getCourse()=" + getCourse()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }


}
