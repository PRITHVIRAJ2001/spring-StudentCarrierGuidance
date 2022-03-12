package com.prithvy.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@Component
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Name;
    @Column(unique = true)
    private String email;
    private String password;
    private String confirmpassword;
    private String College;
    private String District;

    public User() {

    }

    public User(String name, String email, String password, String confirmpassword, String college, String district) {
        super();
        Name = name;
        this.email = email;
        this.password = password;
        this.confirmpassword = confirmpassword;
        College = college;
        District = district;
    }

    public String getConfirmpassword(String encode) {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    @Override
    public String toString() {
        return "User [id=" + ", Name=" + Name + ", email=" + email + ", password=" + password + ", College="
                + College + ", District=" + District + "]";
    }

}
