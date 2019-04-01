package com.zdy;

import com.zdy.domain.College;
import com.zdy.service.CollegeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SSMprojTest {

    @Test
    public void createBeanTest(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        College collegeOne = applicationContext.getBean("college",College.class);
        System.out.println("college create finished!");

        collegeOne.setCollegeID(1);
        collegeOne.setCollegeName("test");
        collegeOne.setBuildDate("20190401");
        collegeOne.setCollegeAddr("addr");
        collegeOne.setCollegeStatus(2);

        CollegeService collegeService = applicationContext.getBean("collegeService",CollegeService.class);
        collegeService.addCollege(collegeOne);
        System.out.println(collegeService.getColleges());
        System.out.println("sqlSessionFactory create finished!");
    }
}
