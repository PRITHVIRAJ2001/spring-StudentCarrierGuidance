package com.prithvy.demo.model;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Document
@Entity
@Data
@Component
public class EngineeringCollege {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String collegename;
    private String district;
    private String details;
    @OneToMany(cascade = CascadeType.ALL, targetEntity = EngineeringReviewModel.class)
    private List<EngineeringReviewModel> engineeringReviewModel = new ArrayList<>();


    public EngineeringCollege(String collegename, String district, String details,
                              List<EngineeringReviewModel> engineeringReviewModel) {
        super();
        this.collegename = collegename;
        this.district = district;
        this.details = details;
        this.engineeringReviewModel = engineeringReviewModel;
    }


    public EngineeringCollege() {
        super();
    }

    @Override
    public String toString() {
        return "EngineeringCollege [id=" + id + ", collegename=" + collegename + ", district=" + district + ", details="
                + details + ", engineeringReviewModel=" + engineeringReviewModel + "]";
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

    public List<EngineeringReviewModel> getEngineeringReviewModel() {
        return engineeringReviewModel;
    }

    public void setEngineeringReviewModel(List<EngineeringReviewModel> engineeringReviewModel) {
        this.engineeringReviewModel = engineeringReviewModel;
    }


}
