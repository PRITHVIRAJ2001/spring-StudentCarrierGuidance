package com.prithvy.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@Component
public class EngineeringReviewModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private Long collegeId;


    @Lob
    private String review;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }

    @Override
    public String toString() {
        return "EngineeringReviewModel [collegeId=" + collegeId + ", review=" + review + "]";
    }


}
