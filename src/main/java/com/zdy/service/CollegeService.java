package com.zdy.service;

import com.zdy.dao.CollegeDAO;
import com.zdy.domain.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    @Autowired
    private CollegeDAO collegeDAO;

    public void addCollege(College college){
        collegeDAO.addCollage(college);
    }

    public List<College> getColleges(){
        return collegeDAO.getColleges();
    }
}
