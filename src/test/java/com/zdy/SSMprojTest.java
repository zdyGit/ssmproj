package com.zdy;

import com.zdy.domain.College;
import com.zdy.service.CollegeService;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SSMprojTest {

    @Test
    public void createBeanTest()  {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        College collegeOne = applicationContext.getBean("college",College.class);
        System.out.println("college create finished!");

        collegeOne.setCollegeID(1);
        collegeOne.setCollegeName("test");
        collegeOne.setBuildDate("20190401");
        collegeOne.setCollegeAddr("addr");
        collegeOne.setCollegeStatus(1);

        CollegeService collegeService = applicationContext.getBean("collegeService",CollegeService.class);
        collegeService.addCollege(collegeOne);
        System.out.println("add college success");

        List<College> colleges = collegeService.getColleges();
        for(int i = 0 ; i < colleges.size();i++){
            System.out.println(colleges.get(i));
        }
        System.out.println("query colleges success");

        collegeOne.setCollegeName("edit_collegeName");
        collegeOne.setCollegeStatus(2);
        collegeService.updateCollege(collegeOne);

        colleges = collegeService.getColleges();
        for(int i = 0 ; i < colleges.size();i++){
            System.out.println(colleges.get(i));
        }
        System.out.println("query colleges success");

        collegeService.delCollege(collegeOne.getCollegeID());
        System.out.println("del college success");

        colleges = collegeService.getColleges();
        for(int i = 0 ; i < colleges.size();i++){
            System.out.println(colleges.get(i));
        }
        System.out.println("query colleges success");
    }
}
