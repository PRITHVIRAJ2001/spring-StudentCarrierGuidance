package com.prithvy.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Component
public class AgriCollege {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String collegename;
    private String district;
    private String details;
    @OneToMany(cascade = CascadeType.ALL, targetEntity = AgriReviewModel.class)
    private List<AgriReviewModel> agriReviewModel = new ArrayList<>();

    public AgriCollege(String collegename, String district, String details, List<AgriReviewModel> agriReviewModel) {
        super();
        this.collegename = collegename;
        this.district = district;
        this.details = details;
        this.agriReviewModel = agriReviewModel;
    }

    public AgriCollege() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public List<AgriReviewModel> getAgriReviewModel() {
        return agriReviewModel;
    }

    public void setAgriReviewModel(List<AgriReviewModel> agriReviewModel) {
        this.agriReviewModel = agriReviewModel;
    }

    @Override
    public String toString() {
        return "AgriCollege [id=" + ", collegename=" + collegename + ", district=" + district + ", details="
                + details + ", agriReviewModel=" + agriReviewModel + "]";
    }


}
