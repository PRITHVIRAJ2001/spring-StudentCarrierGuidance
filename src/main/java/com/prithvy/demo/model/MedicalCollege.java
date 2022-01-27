package com.prithvy.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Component
public class MedicalCollege {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String collegename;
    private String district;
    private String details;
    @OneToMany(cascade = CascadeType.ALL, targetEntity = MedicalReviewModel.class)
    private List<MedicalReviewModel> medicalCollegeReview = new ArrayList<>();

    public MedicalCollege() {
        super();
    }

    public MedicalCollege(String collegename, String district, String details,
                          List<MedicalReviewModel> medicalCollegeReview) {
        super();
        this.collegename = collegename;
        this.district = district;
        this.details = details;
        this.medicalCollegeReview = medicalCollegeReview;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<MedicalReviewModel> getMedicalCollegeReview() {
        return medicalCollegeReview;
    }

    public void setMedicalCollegeReview(List<MedicalReviewModel> medicalCollegeReview) {
        this.medicalCollegeReview = medicalCollegeReview;
    }

    @Override
    public String toString() {
        return "MedicalCollege [id=" + id + ", collegename=" + collegename + ", district=" + district + ", details="
                + details + ", medicalCollegeReview=" + medicalCollegeReview + "]";
    }


}
