package com.zdy.mappers;

import com.zdy.domain.College;

import java.util.List;

public interface ICollegeMapper {
    List<College> getColleges();
    College getCollegesByID(int collegeID);
    void addCollage(College college);
    void delCollage(int collegeID);
    void updateCollage(College college);
}
