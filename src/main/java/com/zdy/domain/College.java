package com.zdy.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("college")
public class College {
    private int collegeID;
    private String collegeName;
    private String collegeAddr;
    private String buildDate;
    @Value("0")
    private int collegeStatus;

    public College(){}

    public int getCollegeID() {
        return collegeID;
    }

    public void setCollegeID(int collegeID) {
        this.collegeID = collegeID;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeAddr() {
        return collegeAddr;
    }

    public void setCollegeAddr(String collegeAddr) {
        this.collegeAddr = collegeAddr;
    }

    public String getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    public int getCollegeStatus() {
        return collegeStatus;
    }

    public void setCollegeStatus(int collegeStatus) {
        this.collegeStatus = collegeStatus;
    }
}
