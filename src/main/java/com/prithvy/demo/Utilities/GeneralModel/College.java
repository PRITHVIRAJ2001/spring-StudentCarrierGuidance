package com.prithvy.demo.Utilities.GeneralModel;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Component
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String collegename;
    private String district;
    private String details;

    public College() {
    }

    public College(String collegename, String district, String details) {
        this.collegename = collegename;
        this.district = district;
        this.details = details;
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

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", collegename='" + collegename + '\'' +
                ", district='" + district + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
