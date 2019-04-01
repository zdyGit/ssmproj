package com.zdy.mappers;

import com.zdy.domain.College;

public interface ICollegeMapper {
    void addCollage(College college);
    void delCollage(int collegeID);
    void updateCollage(College college);
}
