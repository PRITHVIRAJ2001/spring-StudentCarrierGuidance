package com.prithvy.demo.model;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Document 
@Data
@Entity
@Component
public class ArtsCollege {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String collegename;
    private String district;
    private String details;
    @OneToMany(cascade = CascadeType.ALL, targetEntity = ArtsReviewModel.class)
    private List<ArtsReviewModel> artsReviewModel = new ArrayList<>();


    public ArtsCollege() {
        super();
    }

    public ArtsCollege(String collegename, String district, String details, List<ArtsReviewModel> artsReviewModel) {
        super();
        this.collegename = collegename;
        this.district = district;
        this.details = details;
        this.artsReviewModel = artsReviewModel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public List<ArtsReviewModel> getArtsReviewModel() {
        return artsReviewModel;
    }

    public void setArtsReviewModel(List<ArtsReviewModel> artsReviewModel) {
        this.artsReviewModel = artsReviewModel;
    }

    @Override
    public String toString() {
        return "ArtsCollege [id=" + id + ", collegename=" + collegename + ", district=" + district + ", details="
                + details + ", artsReviewModel=" + artsReviewModel + "]";
    }


}
