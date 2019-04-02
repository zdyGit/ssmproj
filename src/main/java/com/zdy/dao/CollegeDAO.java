package com.zdy.dao;

import com.zdy.domain.College;
import com.zdy.mappers.ICollegeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CollegeDAO implements ICollegeMapper {

    @Autowired
    private ICollegeMapper iCollegeMapper;

    @Override
    public List<College> getColleges() {
        return iCollegeMapper.getColleges();
    }

    @Override
    public College getCollegesByID(int collegeID) {
        return iCollegeMapper.getCollegesByID(collegeID);
    }

    @Override
    public void addCollage(College college) {
        iCollegeMapper.addCollage(college);
    }

    @Override
    public void delCollage(int collegeID) {
        iCollegeMapper.delCollage(collegeID);
    }

    @Override
    public void updateCollage(College college) {
        iCollegeMapper.updateCollage(college);
    }
}
