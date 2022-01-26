package com.prithvy.demo.model;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Document
@Entity
@Data
@Component
public class CollegeTypes {

    @Id
    private Long id;
    private String type;

    public CollegeTypes() {

    }

    public CollegeTypes(String type) {
        super();
        this.type = type;
    }

    @Override
    public String toString() {
        return " [ " + type + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
