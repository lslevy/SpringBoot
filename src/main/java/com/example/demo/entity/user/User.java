package com.example.demo.entity.user;

import java.io.Serializable;

public class User implements Serializable {
    private String USER_ID;
    private String USERNAME;
    private String NAME;

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    @Override
    public String toString() {
        return "User{" +
                "USER_ID='" + USER_ID + '\'' +
                ", USERNAME='" + USERNAME + '\'' +
                ", NAME='" + NAME + '\'' +
                '}';
    }
}
