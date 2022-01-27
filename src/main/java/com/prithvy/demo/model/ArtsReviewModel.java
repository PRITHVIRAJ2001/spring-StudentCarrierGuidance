package com.prithvy.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@Component
public class ArtsReviewModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long collegeId;


    @Lob
    private String review;


    public ArtsReviewModel(Long collegeId, String review) {
        super();
        this.collegeId = collegeId;
        this.review = review;
    }


    public ArtsReviewModel() {
        super();
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Long getCollegeId() {
        return collegeId;
    }


    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }


    public String getReview() {
        return review;
    }


    public void setReview(String review) {
        this.review = review;
    }


    @Override
    public String toString() {
        return "ArtsReviewModel [id=" + id + ", collegeId=" + collegeId + ", review=" + review + "]";
    }


}
